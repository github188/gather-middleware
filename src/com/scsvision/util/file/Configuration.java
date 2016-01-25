package com.scsvision.util.file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

/**
 * Configuration
 * 
 * @author huangbuji
 *         <p />
 *         Create at 2014-9-17 上午11:53:09
 */
public class Configuration {
	private static final Configuration configuration = new Configuration();
	private Map<String, String> map = new Hashtable<String, String>();
	public static final String DEFAULT_FILE_NAME = "config.properties";

	private Configuration() {
		// Singleton
	}

	public static Configuration getInstance() {
		return configuration;
	}

	/**
	 * 从默认配置文件中，查找指定属性的值，缓存读取，不支持动态修改配置文件
	 * 
	 * @param key
	 *            属性
	 * @return 值
	 */
	public String getProperties(String key) {
		if (null == map.get(key)) {
			try {
				String filePath = this.getClass().getClassLoader()
						.getResource(DEFAULT_FILE_NAME).getPath();

				Properties prop = new Properties();
				InputStream in = new BufferedInputStream(new FileInputStream(
						filePath));
				prop.load(in);
				in.close();
				String value = prop.getProperty(key);
				map.put(key, value);
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		return map.get(key);
	}

	/**
	 * 从默认配置文件中，查找指定属性的值,不进行缓存，每次都重新读取，支持动态修改
	 * 
	 * @param key
	 *            属性
	 * @return 值
	 * @author huangbuji
	 *         <p />
	 *         Create at 2013-9-17 下午2:39:02
	 */
	public String loadProperties(String key) {
		try {
			String filePath = this.getClass().getClassLoader()
					.getResource(DEFAULT_FILE_NAME).getPath();

			Properties prop = new Properties();
			InputStream in = new BufferedInputStream(new FileInputStream(
					filePath));
			prop.load(in);
			in.close();
			String value = prop.getProperty(key);
			return value;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
