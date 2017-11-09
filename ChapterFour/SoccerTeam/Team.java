package SoccerTeam;


/**
 * Write a description of class Team here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Team
{
  private String teamName;
  private Athlete[] players;
  public Team(String tmnm, int size){
      this.teamName = tmnm;
      this.players = new Athlete[size];
    }
    public String toString() {
        String output = "The members of this team are; \n";
        for(Athlete a : players) {
            output += a + "\n";
    }
    return output;
}

public void addAthlete(int index, Athlete a) {
    players[index] = a;
}
}