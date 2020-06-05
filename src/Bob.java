import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Say hi to Bob!");
        String userInput;
        boolean greeting;

        do {
            userInput = sc.next();
            greeting = (!userInput.equals("bye"));
            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.equals("")) {
                System.out.println("Fine be that way!");
            } else {
                System.out.println("Whatever.");
            }
        } while(greeting);
    }
}
