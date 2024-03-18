public class Main {

    public static void main(String[] args) {
        Song song1 = new Song();
        Song song2 = new Song();
        Album album = new Album();

        song1.setTitle("Hello World");
        song1.setArtis(new String[]{"Alan Walker"});
        song1.setDuration(171);

        song2.setTitle("Film Favorit");
        song2.setArtis(new String[]{"Sheila On 7"});
        song2.setDuration(226);

        album.setTitle("Kayaknya Hits");
        album.setYear(2024);

        album.addSong(song1);
        album.addSong(song2);
        album.displayInfo();
    }
}
