import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MovieCollectionTest {

    static StringBuilder movieList = new StringBuilder();

    @BeforeClass
    public static void initializeList() {
        movieList.append("The Dark Knight Rises , Christopher Nolan , N/A \n")
                .append("A Walk to Remember , Adam Shankman , 8 \n")
                .append("Kahaani , Sujoy Ghosh , 9 \n")
                .append("Madagascar , Eric Darnell , 8 \n")
                .append("Avatar , James Cameron , 8.5 \n")
                .append("Wall-E , Andrew Stanton , 9 \n")
                .append("Kal Ho Na Ho , Nikhil Advani , 7 \n")
                .append("Inception , Christopher Nolan , 7 \n")
                .append("Step Up 3 , Jon Chu , 8.5 \n")
                .append("27 Dresses , Anne Fletcher , 9 \n")
                .append("Life As We Know It , Greg Berlanti , 6 \n")
                .append("The Shawshank Redemption , Frank Darabont , 9 \n")
                .append("Toy Story -1 , John Lasseter , 8 \n")
                .append("Toy Story -2 , John Lasseter , 8.5 \n")
                .append("Toy Story -3 , Lee Unkrich , 9 \n");
    }

    @Test
    public void shouldBeAbleToGetTheListOfAllMovies() {
        MovieCollection movieCollection = new MovieCollection();
        Assert.assertEquals(movieList.toString(),movieCollection.getAllMovies());
    }
}
