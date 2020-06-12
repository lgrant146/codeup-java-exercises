import java.util.Scanner;

public class HighLow {
    static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public static int getInteger(int min, int max){
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userInput = sc.nextInt();
        if(userInput > max || userInput < min){
            System.out.println("Please enter a number within range.");
            return getInteger(min, max);
        }
        return userInput;
    }
    public static void guessingGame(int guess, int answer){
        if(guess == answer){
            System.out.println("You got it!");
        }else if (guess < answer){
            System.out.println("HIGHER");
            guessingGame(getInteger(1,100), answer);
        }else {
            System.out.println("LOWER");
            guessingGame(getInteger(1,100), answer);
        }
    }
  public static void main(String[] args){
      do {
          int answer = (int) (Math.random() * 100) + 1;;
          System.out.println("Can you guess what number I'm thinking of");
          guessingGame(getInteger(1,100), answer);
          System.out.println("Would you like to continue?(y/n)");
      } while(sc.next().equalsIgnoreCase("y"));
  }
}