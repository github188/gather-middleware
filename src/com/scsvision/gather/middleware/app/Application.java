package com.scsvision.gather.middleware.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.scsvision.gather.middleware.task.DeviceSyncTask;

/**
 * Application
 * 
 * @author huangbuji
 *         <p />
 *         Create at 2014-9-18 上午11:19:48
 */
public class Application {

	public static ApplicationContext context = new FileSystemXmlApplicationContext(
			"classpath:applicationContext.xml");

	/**
	 * 程序入口
	 * 
	 * @param args
	 * @author huangbuji
	 *         <p />
	 *         Create at 2014-9-18 上午11:20:03
	 */
	public static void main(String[] args) {
		// 同步机构
		DeviceSyncTask task = Application.context.getBean(DeviceSyncTask.class);
		task.organSync();
		// 同步设备
		task.deviceSync();
	}
}
