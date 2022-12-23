package com.softcode.kanistek;

import com.softcode.kanistek.model.entity.Authority;
import com.softcode.kanistek.model.entity.Blood;
import com.softcode.kanistek.repository.AuthorityRepository;
import com.softcode.kanistek.repository.BloodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.userdetails.UserCache;

@SpringBootApplication
public class KanIstekApplication implements CommandLineRunner {
	@Autowired
	private AuthorityRepository authorityRepository;
	@Autowired
	private BloodRepository bloodRepository;

	public static void main(String[] args) {
		SpringApplication.run(KanIstekApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Authority admin = new Authority("ADMIN");
		Authority hospital = new Authority("HOSPITAL");
		Authority user = new Authority("USER");
		authorityRepository.save(admin);
		authorityRepository.save(hospital);
		authorityRepository.save(user);
		Blood a = new Blood("A");
		Blood b = new Blood("B");
		Blood ab = new Blood("AB");
		Blood z = new Blood("0");
		bloodRepository.save(a);
		bloodRepository.save(b);
		bloodRepository.save(ab);
		bloodRepository.save(z);


	}
}
