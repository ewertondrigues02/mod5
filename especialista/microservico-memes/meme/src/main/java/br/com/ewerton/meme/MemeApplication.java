package br.com.ewerton.meme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MemeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemeApplication.class, args);
    }

}
