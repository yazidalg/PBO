public class Song extends Album {
    String title;
    String[] artis;
    int duration;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtis(String[] artis) {
        this.artis = artis;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String[] getArtis() {
        return artis;
    }

    public String getDuration() {
        int minutes = duration / 60;
        int remaining = minutes % 60;

        return String.format("%02d:%02d", minutes, remaining);
    }
}

