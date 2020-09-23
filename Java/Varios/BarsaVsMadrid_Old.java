/**
 * Do not change the first two 
 * lines of this program. They
 * are used to declare the Main
 * class and the main method. 
 */

public class Main {

	public static void main(String[] args) {
		int goalsHomeBarc = 2;
		int goalsAwayBarc = 1;
		int goalsHomeMad = 2;
		int goalsAwayMad = 1;
		int totalGoalsMad = goalsHomeMad + goalsAwayMad;
		int totalGoalsBarc = goalsHomeBarc + goalsAwayBarc;
		
		if(totalGoalsMad == totalGoalsBarc){
		    // When the overall result is even,
		    //goals scored away count double
		    // so we update the goals away for 
		    //each team and compare again.
		    goalsAwayBarc = goalsAwayBarc *2;
		    
		    // The 'variable *= X' operator means 
		    //the same as 'variable = variable * X'
		    goalsAwayMad *=2;
		    
		    // We calculate again the overall result
		    totalGoalsMad = goalsHomeMad + goalsAwayMad;
		    totalGoalsBarc = goalsHomeBarc + goalsAwayBarc;
		    
		    // We show the result
		    System.out.println("Overall Result is ");
		    System.out.print("F.C. Barcelona "+totalGoalsBarc);
		    System.out.println(" - Real Madrid "+totalGoalsMad);
		    
		    if (totalGoalsMad == totalGoalsBarc){
		    	System.out.println("They have to play extra time!");
		    }else if(totalGoalsMad > totalGoalsBarc){
		        System.out.println("Madrid passes the round!");
		    }else{
		        System.out.println("Barcelona passes the round!");
		    }
		}else{
		    
		    // If the overall is not even 
		    // there is a clear winner.
		    System.out.println("Overall Result is ");
		    System.out.print("F.C. Barcelona "+totalGoalsBarc);
		    System.out.println(" - Real Madrid "+totalGoalsMad);
		    
		    if(totalGoalsMad > totalGoalsBarc){
		        System.out.println("Madrid passes the round!");
		    }else{
		        System.out.println("Barcelona passes the round!");
		    }
		}
	}
}
