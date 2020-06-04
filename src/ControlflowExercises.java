import java.util.Scanner;
public class ControlflowExercises {
    public static void main(String[] args) {
//        for (int i = 5; i <= 15; i += 1) {
//            System.out.println(i);
//        }
//
//        for (int k = 0; k <= 100; k += 2) {
//            System.out.println(k);
//        }
//
//        for (long j = 2; j < 1000000; j *= j) {
//            System.out.println(j);
//        }
//        for(int l = 1; l <= 100; l += 1){
//            if (l % 15 == 0)
//                System.out.print("FizzBuzz" + " ");
//            else if (l % 5 == 0)
//                System.out.println("Buzz"+" ");
//            else
//                System.out.print(l +" ");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter number");
        int num = userInput.nextInt();

        System.out.println("Here is your table");
        System.out.println("number     | squared      | cubed");
        System.out.println("------     | -------      | -----");
        for(int y = 1; y <= num; y += 1){
            System.out.printf("%d          | %d           | %d%n", y, y*y, y*y*y);
        }



    }
}
