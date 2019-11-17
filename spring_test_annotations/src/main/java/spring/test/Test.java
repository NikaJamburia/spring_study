package spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(player.playRandomSong(MusicPlayer.genre.ROCK));
        System.out.println(player);

        context.close();
    }
}
