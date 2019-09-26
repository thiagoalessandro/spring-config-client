package br.com.intelector.springconfigclient.controller;

import br.com.intelector.springconfigclient.utils.PropertiesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private PropertiesUtil propertiesUtil;

    @GetMapping("/kafka")
    public String kafka(){
        return propertiesUtil.getKafkaUrl().concat(":").concat(propertiesUtil.getKafkaPort());
    }
}
