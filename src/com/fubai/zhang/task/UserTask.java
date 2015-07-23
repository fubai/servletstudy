package com.fubai.zhang.task;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TimerTask;
import java.util.logging.Logger;

/**
 * ClassName:GmoProjectTask <br/>
 * Description: 用户定时任务 <br/>
 *
 * @author fubai.zhang
 */
public class UserTask extends TimerTask {

  private static boolean isRunning = false;

  private static Logger logger = Logger.getLogger(UserTask.class.getName());

  public UserTask() {
    super();
  }

  @Override
  public void run() {
    if (!isRunning) {
      //定时获取项目文件，并导入数据库
      logger.info("任务开始");
    } else {
      logger.warning("线程正在运行中");
    }
  }
}
