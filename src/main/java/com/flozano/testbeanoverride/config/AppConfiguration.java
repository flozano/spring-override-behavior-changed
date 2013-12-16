package com.flozano.testbeanoverride.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.flozano.testbeanoverride.TheService;
import com.flozano.testbeanoverride.impl.TheServiceBean;

@Configuration
public class AppConfiguration {

	@Bean
	@Scope(value = "singleton" // = "thread",
								// proxyMode=ScopedProxyMode.INTERFACES*/
	)
	TheService theService() {
		TheServiceBean b = new TheServiceBean();
		b.setName("Lisa");
		return b;
	}

}
