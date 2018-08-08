
public class GuessTheMovieGame {
public static void main(String[] args) {
	final String ALPHABET = "[a-zA-Z]";
	//test();
	String randomMovie = randomMovie();
	
	System.out.println("Random movie has been picked. Now guess the movie");
	
	randomMovie = randomMovie.replaceAll(ALPHABET,"-");
	
	System.out.println(randomMovie);
	
	
}

public static String randomMovie() {
	String movies [] = {"Devdas","Iron Man 3","Dil To Pagal Hai","Kuch Kuch Hota hai"};
	int guessNumber = (int)(Math.random() * movies.length) +1;
	//System.out.println("test number : " + guessNumber);
	if (guessNumber == movies.length) {
		guessNumber = 0;
	}
	
	String movie = movies[guessNumber];
	return movie;
}

//public static void test() {
//	String movies [] = {"Devdas","Iron Man 3","Dil To Pagal Hai","Kuch Kuch Hota hai"};
//	int guessNumber = (int)(Math.random() * movies.length) +1;
//	//System.out.println("test number : " + guessNumber);
//	if (guessNumber == movies.length) {
//		guessNumber = 0;
//	}
//	
//	System.out.println(guessNumber);
//}
}
