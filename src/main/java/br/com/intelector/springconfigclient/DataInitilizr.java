package br.com.intelector.springconfigclient;

import br.com.intelector.springconfigclient.utils.PropertiesUtil;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Profile("dev")
@Log
@Component
public class DataInitilizr implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    PropertiesUtil propertiesUtil;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.info(propertiesUtil.getKafkaUrl());
        log.info(propertiesUtil.getKafkaPort());
    }

}

