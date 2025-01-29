package com.sosun.Confugiration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Server sınıfı, bir sunucunun IP adresi ve konum bilgilerini tutar
@Data
@NoArgsConstructor // Parametresiz constructor oluşturur
@AllArgsConstructor // Parametreli constructor oluşturur
public class Server {
	
	// Sunucunun IP adresi
	private String ip;
	
	// Sunucunun fiziksel veya coğrafi konumu
	private String location;
}
