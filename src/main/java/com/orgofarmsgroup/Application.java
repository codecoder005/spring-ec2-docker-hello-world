package com.orgofarmsgroup;

import com.orgofarmsgroup.entity.UserEntity;
import com.orgofarmsgroup.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class Application {
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
	public void postConstruct() {
		log.info("post construct");
		UserEntity user = UserEntity.builder().uid(101L).build();
		userRepository.save(user);
	}

	@Bean
	ApplicationRunner applicationRunner(UserRepository userRepository) {
		return args -> {
			//userRepository.deleteByUid(101L);
		};
	}

}
