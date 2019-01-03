package cn.discount.controller;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

	/**
	 * 
	 * @ClassName: SwaggerConfig.java
	 * @Description: Swagger配置类
	 *
	 * @version: v1.1.0
	 * @author: xiangdong
	 * @date: Mar 16, 2017
	 */
	@EnableSwagger2
	@ComponentScan(basePackages={"cn.discount.controller"})
	@Configuration
	public class SwaggerConfig extends WebMvcConfigurerAdapter {
		@Bean
		public Docket createRestApi() {
			return new Docket(DocumentationType.SWAGGER_2)
					.apiInfo(apiInfo())
					.select()
					.paths(PathSelectors.any())
					.apis(RequestHandlerSelectors.any())
					.build();
		}
		
		private ApiInfo apiInfo() {
			return new ApiInfoBuilder()
					.title("springboot利用swagger构建api文档")
					.description("简单优雅的restfun风格，http://blog.csdn.net/saytime")
					.termsOfServiceUrl("http://blog.csdn.net/saytime")
					.version("1.0")
					.build();
		}
	    
	   
	}
		
