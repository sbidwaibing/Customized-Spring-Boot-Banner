package com.developer.bannerDemo;

// import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BannerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BannerDemoApplication.class, args);

		// SpringApplication app = new SpringApplication(BannerDemoApplication.class);
		// app.setBannerMode(Banner.Mode.OFF);
		// app.run(args);
	}

}
