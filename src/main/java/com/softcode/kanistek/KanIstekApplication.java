package com.softcode.kanistek;

import com.softcode.kanistek.model.entity.Authority;
import com.softcode.kanistek.repository.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.userdetails.UserCache;

@SpringBootApplication
public class KanIstekApplication implements CommandLineRunner {
	@Autowired
	private AuthorityRepository authorityRepository;

	public static void main(String[] args) {
		SpringApplication.run(KanIstekApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Authority admin = new Authority("ADMIN");
		Authority hospital = new Authority("ADMIN");
		Authority user = new Authority("ADMIN");
		authorityRepository.save(admin);
		authorityRepository.save(hospital);
		authorityRepository.save(user);

	}
}
