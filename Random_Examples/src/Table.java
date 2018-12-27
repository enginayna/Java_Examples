
public class Table {

String teamnames;
int teamorder;
int teamgoal;
int teamaveraj;
int teampuan;
public int Numbers(){
	return teamorder;
	return teamgoal;
	return teamaveraj;
	return teampuan;
}
public void ShowTeam() {

	System.out.println((teamorder) + (" " + teamnames ) + (" Puan " + teampuan ) +
	(" G.N " + teamgoal) + (" Ave " + teamaveraj));

	
}
  
public static void main (String args[]) {
	Table team1 = new Table();
	Table team2 = new Table();
	Table team3 = new Table();
	Table team4 = new Table();
	Table team5 = new Table();
	
	team1.teamorder = 1;
	team1.teamnames =("Fenerbahçe");
	team1.teampuan = 45;
	team1.teamgoal = 56;
	team1.teamaveraj = 28;
	
	team2.teamorder = 2;
	team2.teamnames = ("Galatasaray");
	team2.teampuan = 41;
	team2.teamgoal = 38;
	team2.teamaveraj = 27;
	
	team3.teamorder = 3;
	team3.teamnames = ("Beþiktaþ");
	team3.teampuan = 38;
	team3.teamgoal = 44;
	team3.teamaveraj = 29;
	
	team4.teamorder = 4;
	team4.teamnames =("Baþakþehirspor");
	team4.teampuan = 35;
	team4.teamgoal = 35;
	team4.teamaveraj = 29;
	
	team5.teamorder = 5;
	team5.teamnames = ("Trabzonspor");
	team5.teampuan = 30;
	team5.teamgoal = 27;
	team5.teamaveraj = 17;
	
	team1.ShowTeam();
	team2.ShowTeam();
    team3.ShowTeam();
	team4.ShowTeam();
	team5.ShowTeam();
	
	
  
  }
}