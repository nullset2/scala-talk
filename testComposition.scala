trait Friend{
  val name: String
  def respond = { println("Hello, I am " + name + ", wassup?") }
}

class Human(val name:String) extends Friend
class Animal(val name:String)
class Dog(override val name:String) extends Animal(name) with Friend //trait Friend
class Cat(override val name:String) extends Animal(name)
class Llama(override val name:String) extends Animal(name)

def greet(friend: Friend) = friend.respond

val ricardo = new Human("Ricardo")
greet(ricardo)

val fido = new Dog("Fido")
greet(fido)

val ernesto = new Llama("Ernesto the Llama") with Friend
greet(ernesto)

val idiot = new Cat("idiot")
//greet(idiot) //exception
