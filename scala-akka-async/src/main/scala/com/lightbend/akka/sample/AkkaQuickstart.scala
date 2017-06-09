import akka.actor.{ Actor, ActorRef, ActorSystem, Props }

object Notifier {
  def props(message: String, printerActor: ActorRef): Props = Props(new Notifier(message, printerActor))
  final case class Target(who: String)
  case object Notify
}

class Notifier(message: String, printerActor: ActorRef) extends Actor {
  import Notifier._
  import Printer._

  var notification = ""

  def receive = {
    case Target(subject) => notification = s"$message $subject?"
    case Notify      => printerActor ! Notification(notification)
  }
}

object Printer {
  def props: Props = Props[Printer]
  final case class Notification(notification: String)
}

class Printer extends Actor {
  import Printer._

  def receive = {
    case Notification(notification) => println(s"$notification")
  }
}

object ActorExample extends App {
  import Notifier._

  val system: ActorSystem = ActorSystem("testActorSystem")

  try {
    val printer: ActorRef = system.actorOf(Printer.props, "printer")
    val notifier: ActorRef = system.actorOf(Notifier.props("Sup", printer), "notifier")

    val start = System.nanoTime()
    for (i <- 1 to 500000){
      notifier ! Target(s"Alfredo $i")
      notifier ! Notify
    }
    val end = System.nanoTime()
    Thread sleep 5000
    println((end - start)/1000000000.0);

  } finally {
    system.terminate()
  }
}

