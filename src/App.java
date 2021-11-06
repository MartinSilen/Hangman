import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String key = WordStorage.getWord();
        Scanner reader = new Scanner(System.in);

        System.out.println("I guessed a word!");
        char curGuess;
        char[] display = WordStorage.curConstruct(key).toCharArray();
        System.out.println(display);

        int counter = 1;

        while(Checker.winCheck(display, key) && counter < 21){
            System.out.println("Current turn: " + counter + " out of 20");
            System.out.println("Print a Letter to guess:");
            curGuess = reader.next().charAt(0);
            display  = Checker.Check(display, key, curGuess);


            System.out.println(display);

            counter++;
        }

    }
}
