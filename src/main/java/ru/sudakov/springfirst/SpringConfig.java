package ru.sudakov.springfirst;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.sudakov.springfirst")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
