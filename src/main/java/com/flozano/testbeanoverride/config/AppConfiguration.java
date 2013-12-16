package com.flozano.testbeanoverride.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.flozano.testbeanoverride.TheService;
import com.flozano.testbeanoverride.impl.TheServiceBean;

@Configuration
public class AppConfiguration {

	@Bean
	TheService theService() {
		TheServiceBean b = new TheServiceBean();
		b.setName("Lisa");
		return b;
	}

}
