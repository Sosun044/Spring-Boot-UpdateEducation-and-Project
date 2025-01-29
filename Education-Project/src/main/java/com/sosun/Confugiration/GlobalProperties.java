package com.sosun.Confugiration;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

// GlobalProperties sınıfı, uygulamanın yapılandırma dosyasındaki (application.properties veya application.yml) 'app' prefix'ine sahip özellikleri almak için kullanılır
@Data
@Component // Spring konteynerine bu sınıfın bir bean olarak eklenmesini sağlar
@ConfigurationProperties(prefix = "app") // 'app' prefix'ine sahip tüm yapılandırma parametrelerini bu sınıfın özelliklerine bağlar
public class GlobalProperties {
	
	// Aşağıdaki @Value anotasyonları yorumda bırakıldı. GlobalProperties sınıfı ile bunlar yerine application.properties'ten değer alınıyor.
	// @Value("${spring.datasource.url}")
	// private String url;
	// @Value("${spring.datasource.username}")
	// private String username;
	// @Value("${spring.datasource.password}")
	// private String password;
	
	// Sunucu listesi, 'app.servers' yapılandırmasındaki server bilgilerini tutar
	private List<Server> servers;
}
