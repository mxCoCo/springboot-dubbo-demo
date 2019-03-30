package com.mx.springboot.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = "classpath:provider.xml")//这个配置是应用xml形式配置dubbo服务启动的方式
@SpringBootApplication
public class SpringbootDubboServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboServiceApplication.class, args);
	}

}
