package org.example.interview;

import java.lang.reflect.*;

/**
 * @author yaozeyu
 */
public class Reflect {
  public static String reflectToJson(Object object) {
    StringBuilder stringBuilder = new StringBuilder();
    //获取字节码对象
    Class<?> objectClass = object.getClass();
    //通过反射机制来获取全部属性的信息
    Field[] declaredFields = objectClass.getDeclaredFields();
    stringBuilder.append("{");
    for (Field declaredField : declaredFields) {
      //打破封装
      declaredField.setAccessible(true);
      //获取属性的名称
      String fieldName = declaredField.getName();
      Object value = null;
      try {
        value = declaredField.get(object);
        stringBuilder.append(value);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return stringBuilder.toString();
  }
}
