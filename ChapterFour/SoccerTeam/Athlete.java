package SoccerTeam;


/**
 * Write a description of class Athlete here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Athlete
{
   private String name;
   private int age;
    public Athlete(String nm, int ag) {
        this.name = nm;
        this.age = ag;
}
public boolean equals(Athlete other) {
    if(this.name.equals(other.name) && this.age == other.age) {
        return true;
       
    }
    else {
        return false;
    }
}
public String toString() {
    return "The athlete's name is " + this.name + " and they are " + this.age + "old \n";
}
}
