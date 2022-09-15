package academy.learnprogramming;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name, artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration){
        return songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList playlist){
        Song checkedSong = this.songs.findSong(trackNumber);

        if (checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }

        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList playlist){
        Song songToAdd = songs.findSong(songTitle);

        if (songToAdd != null) {
            playlist.add(songToAdd);
            return true;
        }
        System.out.println("The song " + songTitle + " is not in this album");
        return false;
    }

    private class SongList {

        private ArrayList<Song> songs;

        private SongList(){
            this.songs = new ArrayList();
        }

        private boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;

        }

        private Song findSong(String title){
            for (int i = 0;i<songs.size();i++){
                if (songs.get(i).getTitle() == title)
                    return songs.get(i);
            }
            return null;
        }

        private Song findSong(int trackNumber){
            trackNumber -=1;
            if (trackNumber>=0 && trackNumber<songs.size())
                return songs.get(trackNumber);
            return null;
        }
    }
}
