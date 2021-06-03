package chapter2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppContext.class);
    Greeter greeter = ac.getBean("greeter", Greeter.class);
    String msg = greeter.greet("Spring");
    System.out.println(msg);
    ac.close();
  }
}
