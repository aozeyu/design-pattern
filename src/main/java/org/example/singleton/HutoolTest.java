package org.example.singleton;


import cn.hutool.core.date.*;
import cn.hutool.core.util.*;

import java.util.*;

public class HutoolTest {
  public static void main(String[] args) {
    Date date = DateUtil.date();
    System.out.println(date);
    System.out.println(DateUtil.offset(new Date(), DateField.MONTH, 1));

    System.out.println(StrUtil.join(",", "a", "b", "c"));
  }
}
