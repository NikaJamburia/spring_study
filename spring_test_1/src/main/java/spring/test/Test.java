package spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


//        TestBean tb = context.getBean("testBean", TestBean.class);
//        System.out.println(tb.getName());

        //IoC example.   DI by hand
//        Music classic = context.getBean("classicalBean", Music.class);
//        MusicPlayer player = new MusicPlayer(classic);
//        player.playMusic();

        //Dependency Injection from xml
        MusicPlayer confPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(String.format("Player: %s  Volume: %d", confPlayer.getName(), confPlayer.getVolume()));

        System.out.println("Song List:");
        confPlayer.randmomizeMusicList();
        confPlayer.playMusic();

        //Testing scope prototype
//        MusicPlayer confPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//        confPlayer2.setVolume(20);
//        System.out.println(confPlayer.getVolume());
//        System.out.println(confPlayer2.getVolume());

        context.close();
    }
}
