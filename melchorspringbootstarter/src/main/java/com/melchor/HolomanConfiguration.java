package com.melchor;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HolomanProperties.class)
public class HolomanConfiguration {

    @Bean
    @ConditionalOnMissingBean // 이 타입의 빈이 따로 없으면 등록됨
    public Holoman holoman(HolomanProperties properties) {
        Holoman holoman = new Holoman();
        holoman.setHowLong(properties.getHowLong());
        holoman.setName(properties.getName());
        return holoman;
    }
}
