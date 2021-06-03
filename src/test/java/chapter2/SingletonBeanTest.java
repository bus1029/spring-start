package chapter2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class SingletonBeanTest {
  private ApplicationContext ac = new AnnotationConfigApplicationContext(AppContext.class);

  @Test
  @DisplayName("싱글턴 빈 테스트")
  void singletonBeanTest() {
    Greeter bean1 = ac.getBean(Greeter.class);
    Greeter bean2 = ac.getBean(Greeter.class);
    Assertions.assertThat(bean1).isEqualTo(bean2);
  }
}
