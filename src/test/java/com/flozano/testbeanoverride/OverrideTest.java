package com.flozano.testbeanoverride;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OverrideTest {

	@Test
	public void testOriginalAppCtx() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"classpath:originalApplicationContext.xml");
		TheService service = ctx.getBean("theService", TheService.class);
		assertEquals("Hello Lisa", service.sayHello());
		ctx.close();
	}

	@Test
	public void testOverrideAppCtx() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"classpath:overridingApplicationContext.xml");
		TheService service = ctx.getBean("theService", TheService.class);
		assertEquals("Hello Maria", service.sayHello());
		ctx.close();
	}
}
