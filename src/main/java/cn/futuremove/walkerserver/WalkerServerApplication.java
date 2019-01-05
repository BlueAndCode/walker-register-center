package cn.futuremove.walkerserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class WalkerServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WalkerServerApplication.class, args);
    }

}

