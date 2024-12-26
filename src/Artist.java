public class Artist {
    private String name;
    private String genre;

    // Constructor
    public Artist(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getDetails() {
        return "Artist: " + name + ", Genre: " + genre;
    }
}