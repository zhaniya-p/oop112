public class Main {
    public static void main(String[] args) {
        Artist artist1 = new Artist("BTS", "K-Pop");
        Artist artist2 = new Artist("dudeontheguitar", "Indie");
        Artist artist3 = new Artist("Shawn Mendes", "Pop");

        Song song1 = new Song("Boy In Luv", artist1, 3.5);
        Song song2 = new Song("bet", artist2, 4.12);
        Song song3 = new Song("There's Nothing Holding Me Back", artist3, 3.56);

        Playlist playlist = new Playlist("My Favorites");
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);

        playlist.displayPlaylist();

        playlist.compareSongs(song1, song2);
    }
}