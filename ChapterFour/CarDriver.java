
/**
 * Write a description of class CarDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDriver
{
    public static void main(String[] args) {
        Car FordTruck = new Car("red", "Ford");
        Car Prius = new Car("green", "Prius");
        System.out.println(FordTruck);
        System.out.println(Prius);
        System.out.println(FordTruck.equals(Prius));
        
        
}
}
