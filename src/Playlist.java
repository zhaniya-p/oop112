import java.util.ArrayList;

public class Playlist {
    private String name;
    private ArrayList<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void displayPlaylist() {
        System.out.println("Playlist: " + name);
        for (Song song : songs) {
            System.out.println(song.getDetails());
        }
    }

    public void compareSongs(Song song1, Song song2) {
        System.out.println("Comparing Songs:");
        System.out.println(song1.getTitle() + " vs " + song2.getTitle() + ": " +
                (song1.getTitle().equals(song2.getTitle()) ? "Same Title" : "Different Title"));
    }
}