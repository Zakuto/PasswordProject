import java.util.Scanner;

public class GuessNumberGame {
	
	public static void main(String[] args) {
		int guessNumber = (int) (Math.random()*100) + 1;
		System.out.println("I have already get random number");
		System.out.println("Please guess it.");
		//System.out.println(guessNumber);
		boolean won = false;
		
		
		Scanner scanner = new Scanner(System.in);
		for(int i=10;i>0;i--) {
			System.out.println("You have "+ i + " guess(es) left. Choose again");
			int guess =  scanner.nextInt();
			System.out.println("Your guess was : " + guess);
			
			if (guessNumber < guess) {
				System.out.println("It's smaller than " + guess);
			}else if(guessNumber > guess) {
				System.out.println("It's bigger than " + guess);
			}
			
			if (guessNumber == guess) {
				won = true;
				break;
			}
		}
		
		if(won) {
			System.out.println("Yes correct and you WON!!!");
			System.out.println("The number was " + guessNumber);
		}else {
			System.out.println("You LOSE!! the guess number is : "+ guessNumber);
		}
	}
}
