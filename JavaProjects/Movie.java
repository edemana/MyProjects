/**
 * 
 * Author: Edem K. Anagbah
 * Date: 18-05-2024
 * Purpose: This class represents a movie. The class has the following
 * attributes:
 * title: the title of the movie
 * releaseYear: the release year of the movie
 * rating: the rating of the movie
 */
public class Movie {
    // Declare private variables for title, release year, and rating
    private String title;
    private int releaseYear;
    private double rating;

    /**
     * Constructor to initialize a Movie object
     * 
     * @param title       the title of the movie
     * @param releaseYear the release year of the movie
     * @param rating      the rating of the movie
     */
    public Movie(String title, int releaseYear, double rating) {
        // Set the title, release year, and rating of the movie
        this.title = title;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    /**
     * Setter method to update the rating of the movie
     * 
     * @param rating the new rating of the movie
     */
    public void setRating(double rating) {
        // Update the rating of the movie
        this.rating = rating;
    }

    /**
     * Getter method to retrieve the rating of the movie
     * 
     * @return the rating of the movie
     */
    public double getRating() {
        // Return the rating of the movie
        return this.rating;
    }

    /**
     * Getter method to retrieve the title of the movie
     * 
     * @return the title of the movie
     */
    public String getTitle() {
        // Return the title of the movie
        return title;
    }

    /**
     * Setter method to update the title of the movie
     * 
     * @param title
     */
    public void setTitle(String title) {
        // Set the title of the movie
        this.title = title;
    }

    /**
     * Getter method to retrieve the release year of the movie
     * 
     * @return
     */
    public int getYear() {
        // Return the release year of the movie
        return releaseYear;
    }

    /**
     * Setter method to update the release year of the movie
     * 
     * @param releaseYear
     */
    public void setYear(int releaseYear) {
        // Set the release year of the movie
        this.releaseYear = releaseYear;
    }

    @Override
    /**
     * Return a string representation of the movie
     */
    public String toString() {
        // Return a string representation of the movie
        return "(" + title + ", " + releaseYear + ", " + rating + ")";
    }
}