import java.util.Scanner;

public class AlbertEinstein {
	public static void main(String args[]){
		Scanner UserInput = new Scanner(System.in);
		
		double SpeedOfLight;
		double Mass;
		double Energy;
		
		//Telling User what to put in
		System.out.println("Enter the Mass of the object in Kilograms here: ");
		//Assigning Mass to User Input
		Mass = UserInput.nextDouble();
		
		//Assignment
		SpeedOfLight = Math.pow(299792458, 2);	
		
		//Calculation
		
		
		Energy = SpeedOfLight * Mass;
		
		//Print Energy
		
		System.out.println(Energy + "J of Energy Can be released from that mass specified" );
		
				
				
		
	}

}
