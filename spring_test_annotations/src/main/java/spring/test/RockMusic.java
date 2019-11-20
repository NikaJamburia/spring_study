package spring.test;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>(Arrays.asList("Bored of you", "I Remember", "My war"));

    @Override
    public List<String> getSongs() {
        return songs;
    }


}
