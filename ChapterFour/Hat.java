
/**
 * Write a description of class Hat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hat
{
    private String color;
    private String shape;

    /**
     * Constructor for objects of class Hat
     */
    public Hat(String cl, String sh)
    {
       this.color = cl;
       this.shape = sh;
    }
    public String getColor() {
        return this.color;
    }
    public String toString() {
        return "This hat's color is: " + this.color; 

    
}
}