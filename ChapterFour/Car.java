
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    private String color;
    private String brand;
    public Car(String br, String cl) {
        this.brand = br;
        this.color = cl;
    
    
}
public String toString() {
    return "This is a " + color = "it is a " + brand;
    
}
public boolean equals(Car other) {
    if(this.color.equals(other.color) && this.brand == other.brand) {
        return true;
}
else {
    return false;
}
}
}