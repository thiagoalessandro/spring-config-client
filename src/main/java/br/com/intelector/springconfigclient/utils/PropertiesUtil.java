package br.com.intelector.springconfigclient.utils;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Data
@Component
@RefreshScope
public class PropertiesUtil {

    @Value("${kafka.host.url}")
    private String kafkaUrl;

    @Value("${kafka.host.port}")
    private String kafkaPort;

}



