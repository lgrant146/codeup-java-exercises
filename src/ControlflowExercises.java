public class ControlflowExercises {
    public static void main(String[] args){
        for(int i = 5; i <= 15; i += 1){
        System.out.println(i);
        }
       long j = 2;

do {
       System.out.println(j);
     j *= j;

    } while (j < 1000000);
    }
}
