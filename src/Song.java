public class Song {
    private String title;
    private Artist artist;
    private double duration; // in minutes

    public Song(String title, Artist artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        String title1 = title;
        return title1;
    }

    public Artist getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }

    public String getDetails() {
        return "Song: " + title + " (" + duration + " mins), " + artist.getDetails();
    }
}