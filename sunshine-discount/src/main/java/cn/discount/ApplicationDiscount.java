package cn.discount;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages={"org.dao"})
public class ApplicationDiscount {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApplicationDiscount.class, args);
	}

}
