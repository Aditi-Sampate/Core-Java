import java.util.Vector;

public class MusicPlaylist {

    public static void main(String[] args) {

        Vector<String> playlist = new Vector<>();

        // Add songs to playlist
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");

        System.out.println("Current Playlist:");
        System.out.println(playlist);

        // Play first song
        if (!playlist.isEmpty()) {
            String playingNow = playlist.remove(0); // remove first song from playlist
            System.out.println("\nNow Playing: " + playingNow);
        }

        // Play next song
        if (!playlist.isEmpty()) {
            String nextSong = playlist.firstElement(); // peek the next song
            System.out.println("Next Song: " + nextSong);
        } else {
            System.out.println("No more songs in the playlist.");
        }

        System.out.println("\nUpdated Playlist:");
        System.out.println(playlist);
    }
}