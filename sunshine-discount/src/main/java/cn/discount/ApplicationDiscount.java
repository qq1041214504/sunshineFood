package cn.discount;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages={"org.dao"})
@ComponentScan(basePackages={"cn"})  
public class ApplicationDiscount {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApplicationDiscount.class, args);
	}

}
