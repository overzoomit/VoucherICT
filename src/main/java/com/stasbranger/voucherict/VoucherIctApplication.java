package com.stasbranger.voucherict;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.stasbranger.voucherict.config.ApplicationProperties;


@SpringBootApplication
@EnableConfigurationProperties({ApplicationProperties.class})
public class VoucherIctApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoucherIctApplication.class, args);
	}
}
