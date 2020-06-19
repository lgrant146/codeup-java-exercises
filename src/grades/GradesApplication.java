package grades;
import util.Input;
import java.util.HashMap;


public class GradesApplication {

    static Input in = new Input();

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student noseHairy = new Student("Bobo Bobo");
        noseHairy.addGrade(80);
        noseHairy.addGrade(90);
        noseHairy.addGrade(90);

        Student wiggleMonster = new Student("John Mcknee");
        wiggleMonster.addGrade(80);
        wiggleMonster.addGrade(90);
        wiggleMonster.addGrade(90);

        Student myPasswordIs1234 = new Student("James Bond");
        myPasswordIs1234.addGrade(80);
        myPasswordIs1234.addGrade(90);
        myPasswordIs1234.addGrade(90);

        Student codeMonkey = new Student("Timmy Turner");
        codeMonkey.addGrade(80);
        codeMonkey.addGrade(90);
        codeMonkey.addGrade(90);




            System.out.println("Welcome!\n" +
                    "\n" +
                    "Here are the GitHub usernames of our students:");
            do{

                for (String key : students.keySet()) {
                    System.out.println(key + " ");
                }

                System.out.println("What student would you like to see more information on?\n");
                String typedKey = in.getString();
                if(students.containsKey(typedKey)){

                    Student currentStudent = students.get(typedKey);

                    System.out.println(String.format("Name: %s - GitHub Username: %s\n"
                                    + "Current Average: %.2f",
                            currentStudent.getName(),
                            typedKey,
                            currentStudent.getGradeAverage()
                    ));
                }else{
                    System.out.println("Sorry, no student found with the GitHub username of "+ typedKey);
                }
                System.out.println("Would you like to see another student?");
            }while(in.yesNo());

            System.out.println("Goodbye, and have a wonderful day!");



    }

}
