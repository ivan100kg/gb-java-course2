package io.github.ivan100kg.homework13;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("io.github.ivan100kg.homework13")
@PropertySource("myApp.properties")
public class AppConfig {

}
