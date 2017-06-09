public class Car {
    final private int year;
    private int mileage;

    public Car(int year){
        this.year = year;
        this.mileage = 0;
    }

    public int getYear(){
        return year;
    }

    public int getMileage(){
        return mileage;
    }

    public void drive(int distance){
        this.mileage += distance;
    }

    public void turn(String direction){
        System.out.println("turning" + " " + direction);
    }

    public String toString() {
        return this.year + " " + this.mileage;
    }
}
