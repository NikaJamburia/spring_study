package spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music classic;
    private Music rock;
    private Music rap;

    //@Value("${musicPlayer.name}")
    @Value("Ragaca")
    private String name;

    //@Value("${musicPlayer.volume}")
    @Value("70")
    private int volume;

    enum genre {
        CLASSICAL,
        RAP,
        ROCK
    }

    @Autowired
    public MusicPlayer( @Qualifier("rockMusic") Music rock,
                        @Qualifier("classicalMusic") Music classic,
                        @Qualifier("rapMusic") Music rap)
    {
        this.rock = rock;
        this.classic = classic;
        this.rap = rap;
    }


    public String playRandomSong(genre genre){
        Random rand = new Random();
        int randNum = rand.nextInt(3);

        if(genre == genre.ROCK){
            return rock.getSongs().get(randNum);
        }
        else if(genre == genre.CLASSICAL){
            return classic.getSongs().get(randNum);
        }
        else{
            return rap.getSongs().get(randNum);
        }
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

    @Override
    public String toString() {
        return "Name: " + name + ", Volume: " + volume;
    }

    @PostConstruct
    private void initPlayer(){
        System.out.println("Initializing player \n---------------");
    }
    @PreDestroy
    private void destroyPlayer(){
        System.out.println("---------------\nDestroying player");
    }
}
