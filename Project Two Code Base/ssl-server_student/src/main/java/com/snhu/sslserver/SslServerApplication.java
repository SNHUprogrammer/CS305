package com.snhu.sslserver;

import java.security.MessageDigest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, "Checking the sum...");
	}

	@RequestMapping("/hash")
	public String myHash() throws Exception {
		String data = "My name is Ryan";

		MessageDigest md = MessageDigest.getInstance("SHA-256");

		data += " | AFTER HASH: " + new String(md.digest(data.getBytes()));
		
		return "<p>data:" + data;
	}
}