package cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages={"org.dao"})
public class ApplicationProduct {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApplicationProduct.class, args);
	}
}
