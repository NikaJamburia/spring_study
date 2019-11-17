package spring.test;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>(Arrays.asList("Hungarian Rapsody", "Requiem", "Symphony No. 6."));

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
