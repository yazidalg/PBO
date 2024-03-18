package art;

import job.Artist;

public class Song {
    private String title;
    private String release;
    private Artist artist;


    public Song(String title, String release, Artist artist) {
        this.title = title;
        this.release = release;
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getRelease() {
        return release;
    }

    public Artist getArtist() {
        return artist;
    }

    private int getArtistAgeWhenRelease() {
        int artistAge = Integer.parseInt(this.artist.getBirthdate().substring(0,4));
        int releaseSong = Integer.parseInt(this.release.substring(0,4));
        return releaseSong - artistAge;
    }

    public void displayInfo() {
        System.out.println("Title   : " + this.title);
        System.out.println("Artist  : " + this.artist.getName());
        System.out.println("Release : " + this.release);
        System.out.println("Artist age is " + getArtistAgeWhenRelease() + " when song released");
    }
}
