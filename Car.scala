class Car(val year: Int, var mileage: Int){
  def drive(distance: Int) = {
    mileage += distance
  }

  def turn(direction: String) = {
    println("turning" + " " + direction)
  }
}

val car = new Car(1990, 0)
car.turn("left")
car turn "left"
