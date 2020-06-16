package movies;
import util.input;
import java.util.ArrayList;
import java.util.Arrays;

public class MoviesApplication {
    static input input = new input();

    static Movie[] movies = MoviesArray.findAll();
    public static void main(String[] arg){
        boolean keepGoing = true;
        do {
            System.out.println("What would you lik to do?");
            System.out.println(
                    "0 - exit\n" +
               "1 - All movies\n" +
                    "2 - Animated movies\n" +
                    "3 - Drama movies\n" +
                    "4 - Horror movies\n" +
                    "5 - Sci-fi movies\n" +
                    "6 - add a new movie\n");
            int userChoice = input.getInt(0,6);
            input.getString();

            switch (userChoice){
                case 0:
                    System.out.println("Bye");
                    keepGoing = false;
                    break;
                case 1:
                    for (Movie movie : movies){
                        System.out.println(movie.getName() + "--" + movie.getCategory());
                    }
                    break;
                case 2:
                    for(Movie movie : movies){
                        if(movie.getCategory().equals("animated")){
                            System.out.println(movie.getCategory() + "--" + movie.getCategory());
                        }
                    }
                    break;
                case 3:
                    for(Movie movie : movies){
                        if(movie.getCategory().equals("drama")){
                            System.out.println(movie.getName() + "--" + movie.getCategory());
                        }
                    }
                    break;
                case 4:
                    for (Movie movie : movies){
                        if(movie.getCategory().equals("horror")) {
                            System.out.println(movie.getName() + "--" + movie.getCategory());
                        }
                    }
                    break;
                case 5:
                    for (Movie movie : movies){
                        if(movie.getCategory().equals("scifi")){
                            System.out.println(movie.getName() + "--" + movie.getCategory());
                        }
                    }
                    break;
                case 6:
                    System.out.println("Add a movie");
                    System.out.println("What is the movie name?");
                    String newName = input.getString();
                    System.out.println("What is the movie category?");
                    String newCategory = input.getString();
                    Movie newMovie = new Movie(newName, newCategory);
                    System.out.println("New movie being added");

                    ArrayList<Movie> myMovies =
                            new ArrayList<>(Arrays.asList(movies));
                    myMovies.add(newMovie);
                    movies = myMovies.toArray(movies);
                    for (Movie movie : movies){
                        System.out.println(movie.getName() + "--" + movie.getCategory());
                    }

                default:
                    System.out.println("Please enter one of the options.");
            }
        } while(keepGoing);

    }
}
