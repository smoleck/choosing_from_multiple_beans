package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Cat cat1(){
        Cat c = new Cat();
        c.setName("Kicia");
        return c;
    }
    @Bean
    public Cat cat2(){
        Cat c = new Cat();
        c.setName("Kocia");
        return c;
    }

    @Bean
    public Person person(
            @Qualifier("cat2") Cat cat2) {
        Person p = new Person();
        p.setName("Ella");
        p.setCat(cat2);
        return p;
    }


}
