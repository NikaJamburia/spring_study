package spring.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;
    private String name;
    private int volume;

    public MusicPlayer(ArrayList<Music> musicList) {
        this.musicList = musicList;
    }

    //IoC
    public void playMusic(){
        musicList.stream().forEach(x -> System.out.println(x.getSong()));
    }

    public void setMusicList(ArrayList<Music> musicList) {
        this.musicList = musicList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void randmomizeMusicList(){
        Collections.shuffle(this.musicList);
    }

    private void initPlayer(){
        System.out.println("Initializing player");
    }
    private void destroyPlayer(){
        System.out.println("Destroying player");
    }
}
