import java.util.Scanner;
class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Dice Game! \nWin condition is for you to roll a combined score of 20 or higher in 3 rolls, you win! \n Type 1 to begin your rolls");
		 Scanner fluffy = new Scanner(System.in);
		 int roll = fluffy.nextInt();
		 int count = (int)(Math.random()*11)+2;
		 int count2 = (int)(Math.random()*11)+2;
		 int count3 = (int)(Math.random()*11)+2;
		 if (roll > 0) {
         	count = (int)(Math.random()*11)+2;
         	System.out.println(count);
		 }
		 int roll2 = fluffy.nextInt();
		 if (roll2 > 0) {
         	count2 = (int)(Math.random()*11)+2;
         	System.out.println(count);
		 }
		 int roll3 = fluffy.nextInt();
		 if (roll3 > 0) {
         	count3 = (int)(Math.random()*11)+2;
         	System.out.println(count);
		 }
		 int win = (count + count2 + count3);
		 if (win >= 20) {
			 System.out.println("Congrats, you win!");
		 }
	}

}
