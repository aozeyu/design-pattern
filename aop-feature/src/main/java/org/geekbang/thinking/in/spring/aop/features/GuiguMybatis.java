package org.geekbang.thinking.in.spring.aop.features;

import java.util.*;

public class GuiguMybatis {

  public static Map<String,User> userCache = new HashMap<>();

  public User getUser(String username) {
    User user = null;
    //缓存没有查数据库
    if (!userCache.containsKey(username)) {
       user = extracted(username);
    }else {
     user =  userCache.get(username);
     // 从 这个对象快速得到克隆体
      user  = (User)user.clone();

    }
    return user;
  }

  public static User extracted(String username) {
    User user = new User();
    user.setUsername(username);
    user.setAge(18);
    //放入缓存
    userCache.put(username,user);
    return user;
  }


}
