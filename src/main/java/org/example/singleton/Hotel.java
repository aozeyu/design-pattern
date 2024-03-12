package org.example.singleton;

/**
 * @author yaozeyu
 */
public class Hotel {
  //需要实现类 B 的方法，这个方法会调用 类 A 中提供的回调方法：
  public void wakeService(CallBack callBack) {
    System.out.println("顾客预约了叫醒服务");
    try {
      Thread.sleep(3000);
      System.out.println("时间过去了一夜");
      callBack.beWakedUp();
    }catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
