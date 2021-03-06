package springcloudeureka.provider2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@SpringBootApplication
@EnableEurekaClient
@RestController
public class Provider2Application {

    @Value("${content}")
    String content;
    @Value("${server.port}")
    String port;
    @RequestMapping("/")
    public String home() {
        return "Hello world ,port:" + port+",content="+content;
    }
    public static void main(String[] args) {
        SpringApplication.run(Provider2Application.class, args);
    }

}
