
import java.util.Random;
public class ServerNamegenerator {
    private static String[] adjectives = {
            "crazy",
            "silly",
            "blue",
            "round",
            "fit",
            "purple",
            "glittery",
            "bouncy",
            "square",
            "pale"


    };

    private static String[] nouns = {
            "people",
            "bacteria",
            "Goof",
            "Ball",
            "pain",
            "tree",
            "bed",
            "computor",
            "Number",
            "Water"
    };

    static Random radomizer = new Random();
    public static String randomElem(String[] words){
        return words[radomizer.nextInt(words.length)];
    }
    public static String serverName(String a, String b){
        return "New server name is: " + a + b;
    }
    public static void main(String[] args) {
        System.out.println(serverName(randomElem(adjectives), randomElem(nouns)));
    }
}
