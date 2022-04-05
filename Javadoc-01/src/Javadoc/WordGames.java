package Javadoc;

/**
 * Class containing the methods to manipulate the strings.
 * @author Jacopo Puddu
 */

public class WordGames {
    /**
     * Method to concatenate 2 strings, "Hello" and a string passed as a param.
     * @param word The word that goes after the "Hello" string.
     * @return Returns the string after the manipulation has been done.
     */
    public String addHelloWord(String word){

        word = "Hello " + word;

        return word;
    }

    /**
     * Method to concatenate 2 strings, name and surname, both passed as params.
     * @param name First string, the name goes here, as the first param.
     * @param surname Second string, the surname goes here, as the second param.
     * @return Returns the direct concatenation of the strings with a space in between.
     */

    public String getFullName(String name, String surname){
        return name + " " + surname;
    }
}
