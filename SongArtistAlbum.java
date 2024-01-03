import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class SongArtistAlbum {
    public static void main(String[] args) {
       
        List<String> songList = new LinkedList<>();
        List<String> artistList = new LinkedList<>();
        List<String> albumList = new LinkedList<>();

        
        songList.add("Animals");
        songList.add("Maps");
        songList.add("Ebeb");
        songList.add("Sugar");
        songList.add("Uhaw");

        artistList.add("Maroon 5");
        artistList.add("Maroon 5");
        artistList.add("  Flow G");
        artistList.add("Maroon 5");
        artistList.add("   Dilaw");

        
        combineTailRecursive(songList.listIterator(), artistList.listIterator(), albumList);

       
        System.out.println("Songs:\t\tArtists:\t\tAlbums:");
        for (int i = 0; i < songList.size(); i++) {
            System.out.print(songList.get(i) + "\t\t");
            System.out.print(artistList.get(i) + "\t\t");
            System.out.println(albumList.get(i));
        }
    }

    private static void combineTailRecursive(ListIterator<String> songs, ListIterator<String> artists, List<String> albums) {
        if (!songs.hasNext() || !artists.hasNext()) {
            return;
        }

        String song = songs.next();
        String artist = artists.next();
        String album = song + " - " + artist;
        albums.add(album);

        combineTailRecursive(songs, artists, albums);
    }
}