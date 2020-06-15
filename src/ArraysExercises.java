import java.util.Arrays;
public class ArraysExercises {
    public Arrays arrays;
    public static Person[] addPerson(Person[] people, Person person){
        Person[] oneMorePerson = Arrays.copyOf(people, people.length + 1);
        oneMorePerson[oneMorePerson.length - 1] = person;
        return oneMorePerson;
    }
    public static void main(String[] args){
        Person[] people = new Person[3];
        people[0] = new Person("Peter");
        people[1] = new Person("David");
        people[2] = new Person("James");
        people = addPerson(people, new Person("Leroy"));
        for(Person peeps: people){
            System.out.println(peeps.getName());
        }


    }
}
