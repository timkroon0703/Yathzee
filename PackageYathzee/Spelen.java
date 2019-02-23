package PackageYathzee;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Spelen {
	public static void main(String [] args) {
		YathzeeSpel Yathzee = new YathzeeSpel();
		Yathzee.spelen();
	}
}
class YathzeeSpel{
	ArrayList<Dobbelsteen> dobbelstenen = new ArrayList<Dobbelsteen>();

	YathzeeSpel(){
		Dobbelsteen d1 = new Dobbelsteen();
		Dobbelsteen d2 = new Dobbelsteen();
		Dobbelsteen d3 = new Dobbelsteen();
		Dobbelsteen d4 = new Dobbelsteen();
		Dobbelsteen d5 = new Dobbelsteen();
		
		dobbelstenen.add(d1);
		dobbelstenen.add(d2);
		dobbelstenen.add(d3);
		dobbelstenen.add(d4);
		dobbelstenen.add(d5);
	}
	void spelen(){
		int whileKeuze = 0;
		Scanner invoer = new Scanner(System.in);
		while(whileKeuze == 0) {
			String switchkeuze = invoer.nextLine();
			for(Dobbelsteen x : dobbelstenen) {
				x.werpen();
				System.out.print(x.dobbel);
			}
			switch(switchkeuze) {
			case "q":
				System.out.println( "Stopped with q");
				whileKeuze = 1;
				break;
			default:
				System.out.println("Loop is ongoing with enter");
			}
		}
	}
	void vasthouden() {
		Scanner vastinvoer = new Scanner(System.in);
	}
}
class Dobbelsteen{
	int dobbel;
	Dobbelsteen(){
		Random kans = new Random();
		dobbel = kans.nextInt(6)+1;
		System.out.print(dobbel);
	}
	int werpen(){
		Random kans = new Random();
		dobbel = kans.nextInt(6)+1;
		return dobbel;
	}
}