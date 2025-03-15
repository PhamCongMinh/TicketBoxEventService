package org.ticketbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
@EnableCaching
public class TicketBoxApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketBoxApplication.class, args);
    }

    @RequestMapping("/")
    String home() {
        return "OKE";
    }

}
