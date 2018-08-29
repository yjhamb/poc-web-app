package org.sai.poc.webapp;

import javax.inject.Inject;

import org.sai.poc.webapp.config.ApplicationConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sai.poc.webapp.repository.User;
import com.sai.poc.webapp.repository.UserRepository;

@RestController
public class ApplicationController {
    @Inject
    private ApplicationConfig config;

    @Inject
    private UserRepository userRepository;

    @RequestMapping("/")
    public String index() {
	return "Greetings from Spring Boot!";
    }

    @RequestMapping("/config")
    public String config() {
	StringBuilder configData = new StringBuilder();
	configData.append("URL:").append(config.getUrl());
	return configData.toString();
    }

    @RequestMapping("/user")
    public String getUser(String name) {
	User user = userRepository.findByName(name).get(0);
	return user.getUserName();
    }

}
