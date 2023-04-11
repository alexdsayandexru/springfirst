package ru.sudakov.springfirst;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer music1 = context.getBean("musicPlayer", MusicPlayer.class);
        music1.playMusic();

        MusicPlayer music2 = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(music1 == music2);
        context.close();
    }
}
