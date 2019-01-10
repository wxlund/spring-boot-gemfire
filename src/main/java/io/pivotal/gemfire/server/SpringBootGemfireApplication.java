package io.pivotal.gemfire.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.config.annotation.CacheServerApplication;
import org.springframework.data.gemfire.config.annotation.EnableLocator;
import org.springframework.data.gemfire.config.annotation.EnableManager;
import org.springframework.session.data.gemfire.config.annotation.web.http.EnableGemFireHttpSession;

@CacheServerApplication
@EnableManager(start = true)
@EnableLocator(port = 10334)
@EnableGemFireHttpSession(regionName = "Session")
@SpringBootApplication
public class SpringBootGemfireApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootGemfireApplication.class, args);
  }

}