import art.Song;
import job.Artist;

public class Main {
    public static void main(String[] args) {
        // Create object Artist with constructor
        Artist artist1 = new Artist("Alan Walker", "1997-08-24");
        Artist artist2 = new Artist("Ari Laso", "1973-01-17");

        // Display artist object
        artist1.displayInfo();
        artist2.displayInfo();

        // Create object Song with constructor
        Song song1 = new Song("Not You", "2021-12-03", artist1);
        Song song2 = new Song("Hampa", "2003-02-01", artist2);

        song1.displayInfo();
        song2.displayInfo();
    }
}
