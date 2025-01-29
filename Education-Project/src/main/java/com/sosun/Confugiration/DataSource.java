package com.sosun.Confugiration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// DataSource sınıfı, veritabanı bağlantısı için gerekli bilgileri saklar
@Getter
@Setter
@AllArgsConstructor // Parametreli constructor oluşturur
@NoArgsConstructor // Parametresiz constructor oluşturur
public class DataSource {
	
	// Veritabanı bağlantı URL'si
	private String url;
	
	// Veritabanı kullanıcı adı
	private String username;
	
	// Veritabanı kullanıcı şifresi
	private String password;

}
