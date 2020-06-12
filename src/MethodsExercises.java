import java.util.Scanner;
public class MethodsExercises {
    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static double add(double a, double b){
        return a + b;
    }
    public static double subtract(double a, double b){
        return a - b;
    }
    public static double multiply(double a, double b){
        return a * b;
    }
    public static double divide(double a, double b){
        return a / b;
    }
    public static double modulus(double a, double b){
        return a % b;
    }

    public static void testArithmetic(){
        System.out.println(add(2,3));
        System.out.println(subtract(10,7));
        System.out.println(multiply(4,4));
        System.out.println(divide(100,25));
        System.out.println(modulus(3,2));
    }
    public static int getInteger(int min, int max){
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userInput = sc.nextInt();
        if(userInput > max || userInput < min){
            System.out.println("Please enter a number within range.");
            return getInteger(min, max);
        }
        System.out.println("Thanks");
        return userInput;
    }
    public static void rollDice(int sides){
        int firstDice = (int)(Math.random() * sides) + 1;
        int secondDice = (int)(Math.random() * sides) + 1;
        System.out.printf("1st result: %d | 2nd result: %d%n", firstDice, secondDice);
    }

//
    public static void main(String[] args){
//       int number;
//       String response;
//       long fact = 1;
//       do{
//           number = getInteger(1, 10);
//           System.out.println("Calculate factorial of " + number + "?");
//           System.out.println("Continue?(y/n)");
//           response = sc.next();
//       } while (!response.equalsIgnoreCase("y"));
//        System.out.println(fact);
//        System.out.println(number + "! = ");
//        testArithmetic();
//        getInteger(1,10);
        do{
            System.out.println("Rolling a pair of dice. How many sides? ");
            rollDice(getInteger(1,10));
            System.out.println("Would you like to continue?(y/n)");
        }while(sc.next().equalsIgnoreCase("y"));


    }
//

}
