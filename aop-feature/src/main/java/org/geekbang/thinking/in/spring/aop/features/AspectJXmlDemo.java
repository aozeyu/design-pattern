package org.geekbang.thinking.in.spring.aop.features;


import org.aspectj.apache.bcel.util.*;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.context.support.*;

/**
 * @author yaozeyu
 */
@Aspect
@Configuration
@EnableAspectJAutoProxy
public class AspectJXmlDemo {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/META-INFO/spring-aop-context.xml");
//
//    AspectJXmlDemo aspectJDemo = context.getBean(AspectJXmlDemo.class);
    context.close();
  }
}
