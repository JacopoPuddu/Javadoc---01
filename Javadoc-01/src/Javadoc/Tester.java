package Javadoc;

/**
 * Tester class for the string manipulation through methods.
 * @author Jacopo Puddu
 */


public class Tester {
    public static void main(String[] args) {
        /**
         * Creation of a new object of type "WordGames"
         */

        WordGames newGame = new WordGames();

        /**
         * Direct print of the method that simply adds the "Hello" string before the param.
         */

        System.out.println(newGame.addHelloWord("Jacopo"));

        /**
         * Direct print of the method that concatenates the two params.
         */

        System.out.println(newGame.getFullName("Jacopo", "Puddu"));
    }
}
