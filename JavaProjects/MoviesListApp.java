/**
 * Author: Edem K. Anagbah
 * Date: 18-05-2024
 * Purpose: This class is to manage a list of movies,
 * perform operations on the list, and display information about the movies.
 */
public class MoviesListApp {

    /**
     * Main method for program execution
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // Declare arrays to store movie titles, release years, and ratings
        String[] titles = new String[] {
                "2001: A Space Odyssey",
                "Aliens",
                "Attack of the Clones",
                "Batman",
                "beauty & the Beast",
                "The Bicycle Thief",
                "Blues Brothers",
                "The Bridge on the River Kwai",
                "Butch Cassidy and the Sundance Kid",
                "Casablanca"
        };
        int[] years = new int[] {
                1968,
                1986,
                2002,
                1989,
                1991,
                1948,
                1980,
                1957,
                1969,
                1942
        };
        double[] ratings = new double[] {
                4.3,
                4,
                5.6,
                4,
                6,
                4.8,
                7.7,
                6.6,
                5,
                4
        };
        // Create a new object to store Movie objects
        CustomArrayList MovieList = new CustomArrayList();
        // Loop through the arrays and create Movie objects
        for (int i = 0; i < titles.length; i++) {
            // Create a new Movie object with title, year, and rating
            Movie movie = new Movie(titles[i], years[i], ratings[i]);
            // Add the Movie object to the
            MovieList.add(movie);

        }
        // Find average rating of the movie list
        String averageRating = String.format("\nThe average rating is %.1f\n", averageRating(MovieList));
        System.out.println(averageRating);
        System.out.println(MovieList.display());

        // Remove a Movie object from the MovieList by title and index and Display the
        // contents of
        // the after removal
        MovieList.remove(titles[4]);
        System.out.println("Removed movie: " + MovieList.remove(titles[3]));
        System.out.println("Removed movie: " + MovieList.remove(4));
        System.out.println(MovieList.display());

        // Display the average rating of the Movie objects in the array
        averageRating = String.format("\nThe average rating is %.1f\n", averageRating(MovieList));
        System.out.println(averageRating);

        // Add a Movie object to MovieList
        MovieList.add(new Movie("Creed", 2023, 7.8));
        System.out.println("Your Movie List (Title, Release Year, Rating):\n" + MovieList.display());
        System.out.println();

        // Get a Movie object from the by index
        System.out.println("Movie: " + MovieList.get(2) + "\n");

        // Set a Movie
        MovieList.set(1, new Movie("Equalizer", 2023, 4.9));
        System.out.println("Displaying the list after setting the second movie:");
        System.out.println("Your Movie List (Title, Release Year, Rating):\n" + MovieList.display());

        // Check the size of the Movie list
        System.out.println("Size of the list: " + MovieList.size());

        // Test the isEmpty() method
        System.out.println("Is the list empty? " + MovieList.isEmpty());
    }

    /**
     * Return the average ratings in a MovieList
     * 
     * @param MovieList
     * @return
     * @throws Exception
     */
    private static double averageRating(CustomArrayList MovieList) throws Exception {
        // Initialize a variable to store the total rating
        double total = 0;
        for (int i = 0; i < MovieList.size(); i++) {
            double rating = ((Movie) MovieList.get(i)).getRating();
            // Add the rating of each Movie object to the total
            total += rating;
        }
        // Calculate the average rating
        double average = total / MovieList.size();
        // Return the average rating
        return average;
    }

}
