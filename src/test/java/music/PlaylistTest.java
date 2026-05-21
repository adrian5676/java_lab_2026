package music;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PlaylistTest {
    @Test
   public void testEmptyPlaylist(){
        Playlist playlist = new Playlist();
        assertTrue (playlist.isEmpty());
   }
   @Test
   public void testSingleElement(){
        Playlist playlist = new Playlist();
        playlist.add(new Song("Bathory", "The Lake", 300));
        assertEquals(1, playlist.size());
    }

    @Test
    public void testSameElement(){
        Playlist playlist = new Playlist();
        Song song = new Song("Bathory", "The Lake", 300);
        Song song2 = new Song("Bathory", "The Lake", 300);
        playlist.add(song);
        assertTrue( playlist.contains(song));
        assertEquals(playlist.get(0), song2);
    }
    @Test
    public void testEqualElement(){
        Playlist playlist = new Playlist();
        Song song = new Song("Bathory", "The Lake", 300);
        Song song2 = new Song("Bathory", "The Lake", 300);
        playlist.add(song);
        assertEquals(playlist.get(0), song2);;
        assertTrue(playlist.contains(song));
    }
    @Test
    public void testAtSecond(){
        Playlist playlist = new Playlist();
        Song song1 = new Song("Iron Maiden", "Killers", 260);
        Song song2 = new Song( "Megadeth", "Dawn Patrol", 120);
        Song song3 = new Song("Darkthrone", "Natassja in Eternal Sleep", 250);
        playlist.add(song1);
        playlist.add(song2);
        playlist.add(song3);
        assertEquals(song1, playlist.atSecond(0));
        assertEquals(song1, playlist.atSecond(50));
        assertEquals(song2, playlist.atSecond(300));
        assertEquals(song3, playlist.atSecond(400));
    }
}
