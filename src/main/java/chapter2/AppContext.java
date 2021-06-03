package chapter2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {
  @Bean
  public Greeter greeter() {
    Greeter greeter = new Greeter();
    greeter.setFormat("%s, Hi!");
    return greeter;
  }
}
