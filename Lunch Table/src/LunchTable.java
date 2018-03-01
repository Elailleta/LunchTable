import java.util.Scanner;

public class LunchTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		final double hotDogCost=1.5;
		int numHotDog;
		final double hambugerCost=2;
		int numHamburger;
		final double smoothieCost=3;
		int numSmoothie;
		final double friesCost=3.75;
		int numfries;
		final double pizzaCost=2;
		int numPizza;
		double total;
		double answer;
		double pay;
		double change;

		System.out.println("How many hotdogs would you like?");
		numHotDog=in.nextInt();

		System.out.println("How many hamburgers would you like?");
		numHamburger=in.nextInt();

		System.out.println("How many smooties would like?");
		numSmoothie=in.nextInt();

		System.out.println("How many Fries would you like?");
		numfries=in.nextInt();

		System.out.println("How many slices of pizza would you like?");
		numPizza=in.nextInt();

		total= numHotDog*hotDogCost+numHamburger*hambugerCost+numSmoothie*smoothieCost+numfries*friesCost+numPizza*pizzaCost;

		answer=total*1.13;
		total=total*100;
		total=Math.round(total);
		total=total/100;

		System.out.println("The total will be "+total);
		System.out.println("Please enter your payment amount");
		pay=in.nextInt();

		change=pay-total;

		System.out.println("Your change is "+change);

	}

}
