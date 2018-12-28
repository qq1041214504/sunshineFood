package orm.rider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages={"org.dao"})
public class ApplicationRider {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApplicationRider.class, args);
	}

}  
