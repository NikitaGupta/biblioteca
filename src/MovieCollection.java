import java.util.ArrayList;
import java.util.List;

public class MovieCollection {
    private static List<Movie> movieList = new ArrayList<Movie>();

    public MovieCollection() {
        
        movieList.add(new Movie("The Dark Knight Rises" , "Christopher Nolan" , "N/A"));
                movieList.add(new Movie("A Walk to Remember" , "Adam Shankman" , "8"));
                movieList.add(new Movie("Kahaani", "Sujoy Ghosh" , "9"));
                movieList.add(new Movie("Madagascar" , "Eric Darnell" , "8"));
                movieList.add(new Movie("Avatar" , "James Cameron" , "8.5"));
                movieList.add(new Movie("Wall-E" , "Andrew Stanton" , "9"));
                movieList.add(new Movie("Kal Ho Na Ho" , "Nikhil Advani" , "7"));
                movieList.add(new Movie("Inception" , "Christopher Nolan" ,"7"));
                movieList.add(new Movie("Step Up 3" , "Jon Chu" , "8.5"));
                movieList.add(new Movie("27 Dresses" , "Anne Fletcher" , "9"));
                movieList.add(new Movie("Life As We Know It" , "Greg Berlanti" , "6"));
                movieList.add(new Movie("The Shawshank Redemption" , "Frank Darabont" , "9"));
                movieList.add(new Movie("Toy Story -1" , "John Lasseter" , "8"));
                movieList.add(new Movie("Toy Story -2" , "John Lasseter" , "8.5"));
                movieList.add(new Movie("Toy Story -3" , "Lee Unkrich" , "9"));
    }
    
    public String getAllMovies() {
        StringBuilder movies = new StringBuilder();
        for (Movie movie : movieList) {
            movies.append(movie.toString()).append(" \n");
        }
        return movies.toString();
    }
}
