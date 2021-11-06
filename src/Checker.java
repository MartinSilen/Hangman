public class Checker {
    public static char[] Check(char[] current, String key, char guess) {



        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) == guess) {current [i] = key.charAt(i);}

        }
        return current;
    }

    public static boolean winCheck(char[] guess, String key) {

        for (int i = 0; i < key.length(); i++) {
            if (guess[i] != key.charAt(i)) {
                return true;}
        }
        System.out.println("You won!");
        return false;
    }
}
