package org.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan("org.dao")
public class SunshineSeller {
   public static void main(String[] args) throws Exception {
	SpringApplication.run(SunshineSeller.class, args);
}

}
