package com.ia.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import net.sf.clipsrules.jni.Environment;

@Configuration
public class ClipsConfiguration {

    @Bean
    public Environment clipsEnviorment(){
        Environment clipsEnvironment = new Environment();
        clipsEnvironment.loadFromResource("/lib/p.clp");
        clipsEnvironment.reset();
        return clipsEnvironment;
    }
}
