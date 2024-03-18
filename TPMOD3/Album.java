import java.util.Arrays;

public class Album {
    String title;
    int year;
    Song[] songs;

    public Album() {
        this.songs = new Song[4];
    }

    private int counter = 1;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void addSong(Song song) {
        songs[counter] = song;
        counter++;
    }

    public void displayInfo() {
        System.out.println("Album Info");
        System.out.println("Title : " + title);
        System.out.println("Year : " + year);
        System.out.println("Song List");
        for (int i = 1; i < counter; i++) {
            if (songs[i] != null) {
                System.out.println(i + ". Title : " + songs[i].title);
                System.out.println("Artist : " + Arrays.toString(songs[i].artis));
                System.out.println("Duration : " + songs[i].duration);
            }
        }
    }
}
