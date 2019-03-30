package com.mx.springboot.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = "classpath:consumer.xml")//应用xml形式配置dubbo服务启动的
@SpringBootApplication
public class SpringbootDubboWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboWebApplication.class, args);
	}

}
