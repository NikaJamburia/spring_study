package spring.test;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RapMusic implements Music {
    private List<String> songs = new ArrayList<>(Arrays.asList("My favourite mutiny", "Dig it", "Guillotine"));

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
