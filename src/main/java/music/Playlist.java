package music;

import java.util.ArrayList;

public class Playlist extends ArrayList<Song> {

    public Song atSecond(int second){
        int offSet = 0;
        for (Song song : this){
            int end = offSet + song.getLength();
            if (offSet <= second && second < end){
                return song;
            } else {
                offSet = end;
            }
        }
        return null;
    }
}
