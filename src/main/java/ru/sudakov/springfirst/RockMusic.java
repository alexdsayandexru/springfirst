package ru.sudakov.springfirst;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Scorpions";
    }
}
