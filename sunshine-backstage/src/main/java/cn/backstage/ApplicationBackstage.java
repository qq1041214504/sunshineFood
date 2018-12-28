package cn.backstage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages={"org.dao"})
public class ApplicationBackstage {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApplicationBackstage.class, args);
	}

}
