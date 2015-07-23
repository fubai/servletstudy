package com.fubai.zhang.task;

import java.util.Timer;
import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * ClassName:TaskListener <br/>
 * Description: 定时任务的监听 <br/>
 * 
 * @author fubai.zhang
 */
public class TaskListener implements ServletContextListener {

	private static Logger logger = Logger.getLogger(TaskListener.class
			.getName());
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
		timer.schedule(new UserTask(), 0, 60 * 60 * 1000);// 每隔1小时
		logger.info("已经添加任务调度表");
	}

}
