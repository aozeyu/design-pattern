package org.geekbang.thinking.in.spring.aop.features;


import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.*;

/**
 * @author yaozeyu
 */
@Aspect
@Configuration
@EnableAspectJAutoProxy
public class AspectJDemo {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    context.register(AspectJDemo.class);
    context.refresh();
    AspectJDemo aspectJDemo = context.getBean(AspectJDemo.class);
    context.close();
  }
}
