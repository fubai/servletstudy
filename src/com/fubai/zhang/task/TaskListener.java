/**
 * Project Name:wanyan_cooperation
 * File Name:TaskListener.java
 * Package Name:com.wanyan.cooperation.task
 * Date:2015年7月22日下午3:47:35
 * Copyright @ 2010-2015 上海万言网络技术咨询有限公司  All Rights Reserved.
 *
 */

package com.wanyan.cooperation.task;

import java.util.Timer;
import java.util.logging.Logger;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * ClassName:TaskListener <br/>
 * Description: 定时任务的监听 <br/>
 * Date: 2015年7月22日 下午3:47:35 <br/>
 *
 * @author 张兴珂
 * @version
 * @since JDK 1.7
 * @see
 */
public class TaskListener implements ServletContextListener {

  private static Logger logger = Logger.getLogger(TaskListener.class.getName());
  private Timer timer;

  @Override
  public void contextDestroyed(ServletContextEvent event) {
    timer.cancel();
    logger.info("定时器销毁");
  }

  @Override
  public void contextInitialized(ServletContextEvent event) {
    timer = new java.util.Timer(true);
    logger.info("定时器已启动");
    timer.schedule(new GmoProjectTask(), 0, 10 * 1000);//每隔1小时
    logger.info("已经添加任务调度表");
  }

}
