package academy.learnprogramming;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name, artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title)==null){
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        for (int i=0;i<songs.size();i++){
            if(songs.get(i).getTitle().equals(title))
                return songs.get(i);
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList playlist){
        int index = trackNumber-1;
        if(index>=0 && index<= songs.size()){
            playlist.add(songs.get(index));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList playlist){
        Song checkedSong = findSong(songTitle);
        if(checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        return false;
    }
}
