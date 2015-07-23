package com.fubai.zhang.util;

import java.util.ResourceBundle;

/**
 * ClassName:Constants <br/>
 * Description: 通用配置类 <br/>
 *
 * @author fubai.zhang
 */
public class Constants {

  public static Integer INTEGER_ONE = 1;
  public static Integer INTEGER_THREE = 3;
  public static Integer INTEGER_TWO = 2;
  public static Integer INTEGER_ZORE = 0;
  private static ResourceBundle resourceBundle;

  static {
    if (null == resourceBundle) {
      resourceBundle = ResourceBundle.getBundle("Constants");
    }
  }

  public static String getConstantsPropertiesValue(String key) {
    return resourceBundle.getString(key);
  }
}
