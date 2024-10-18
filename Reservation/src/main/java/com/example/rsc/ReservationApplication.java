package com.example.rsc;

import com.example.rsc.connections.ReservationConnection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication()
@EnableMongoRepositories("com.example.rsc.repository")
public class ReservationApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReservationApplication.class, args);
    }
}
