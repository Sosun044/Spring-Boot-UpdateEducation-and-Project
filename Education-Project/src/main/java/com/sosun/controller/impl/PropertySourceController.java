package com.sosun.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sosun.Confugiration.DataSource;
import com.sosun.Confugiration.GlobalProperties;
import com.sosun.Confugiration.Server;

@RestController
@RequestMapping("/rest/api/property")
public class PropertySourceController {
    
    // GlobalProperties nesnesi ile yapılandırma bilgilerini almak için
    @Autowired
    private GlobalProperties globalProperties;
    
    // DataSource bilgilerini almak için örnek metod
    @GetMapping(path = "/datasource")
    public DataSource getDataSource() {
        DataSource dataSource = new DataSource();
        
        // DataSource nesnesinin URL, kullanıcı adı ve şifre gibi bilgileri
        // globalProperties üzerinden alması bekleniyor, fakat şu an null döndürülüyor
        // dataSource.setUrl(globalProperties.getUrl());
        // dataSource.setUsername(globalProperties.getUsername());
        // dataSource.setPassword(globalProperties.getPassword());
        
        // Şu an için null döndürüyoruz
        return null;
        // return dataSource; // Düzeltilmiş haliyle veritabanı bilgilerini döndürmesi gerekiyor
    }

    // Sunucuların listesini almak için metod
    @GetMapping(path = "/getServers")
    public List<Server> getServers(){
        // GlobalProperties nesnesi içerisindeki sunucuları döndürüyoruz
        return globalProperties.getServers();
    }
}
