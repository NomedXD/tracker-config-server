package by.innowise.trackerconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableConfigServer
@RefreshScope
public class TrackerConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrackerConfigServerApplication.class, args);
    }

}
