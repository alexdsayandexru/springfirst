package ru.sudakov.springfirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volumn}")
    private int volumn;

    @Autowired
    @Qualifier("rockMusic")
    private Music music;

    public void playMusic() {
        //this.musics.forEach(music->System.out.println("Playing:: " + music.getSong()));
        System.out.println("Playing:: " + music.getSong() + " name:" + name + " volumn:" + volumn);
    }
}
