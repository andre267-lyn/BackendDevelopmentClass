package com.ideaco.diabatch4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Annotation khusus Spring Boot yang menyatukan beberapa anotasi menjadi satu, termasuk @Configuration,
// @EnableAutoConfiguration, dan @ComponentScan. Ini mengindikasikan bahwa kelas ini adalah kelas utama yang akan menjalankan aplikasi Spring Boot.
@SpringBootApplication
public class Diabatch4Application {

	public static void main(String[] args) {
		SpringApplication.run // Membuat konteks aplikasi Spring dan memulai aplikasi dengan menggunakan konfigurasi yang ditentukan dalam kelas Diabatch4Application.
				              // Ketika aplikasi dijalankan
				(Diabatch4Application.class, args);
	}

}
