package Shitta.configurations;

import Shitta.Service.IUserService;
import Shitta.Service.UserServiceImpl;
import org.apache.catalina.Context;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	public static void main(String[] args) {
		
	}
	
	@Bean
	public IUserService getUserService(){
		return new UserServiceImpl();
	}
}
