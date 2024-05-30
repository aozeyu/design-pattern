package org.geekbang.thinking.in.spring.aop.features;

/**
 * @author yaozeyu
 */
public class MainTest {
  public static void main(String[] args) {
    GuiguMybatis guiguMybatis = new GuiguMybatis();
    User zhangsan1 = guiguMybatis.getUser("zhangsan");
    //第一次是从缓存中拿
    System.out.println(zhangsan1);
    //后面都是克隆体
    User zhangsan2 = guiguMybatis.getUser("zhangsan");
    zhangsan2.setUsername("李四2");
    System.out.println(zhangsan2);
    User zhangsan3 = guiguMybatis.getUser("zhangsan");
    System.out.println(zhangsan3);
    User zhangsan4 = guiguMybatis.getUser("zhangsan");
    System.out.println(zhangsan4);

  }
}
