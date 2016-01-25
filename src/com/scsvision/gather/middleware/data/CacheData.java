package com.scsvision.gather.middleware.data;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.scsvision.gather.middleware.sqlserver.model.Cms;
import com.scsvision.gather.middleware.sqlserver.model.Covi;
import com.scsvision.gather.middleware.sqlserver.model.Fan;
import com.scsvision.gather.middleware.sqlserver.model.FireDetector;
import com.scsvision.gather.middleware.sqlserver.model.Light;
import com.scsvision.gather.middleware.sqlserver.model.Lil;
import com.scsvision.gather.middleware.sqlserver.model.Loli;
import com.scsvision.gather.middleware.sqlserver.model.NoDetector;
import com.scsvision.gather.middleware.sqlserver.model.PushButton;
import com.scsvision.gather.middleware.sqlserver.model.Rd;
import com.scsvision.gather.middleware.sqlserver.model.Tsl;
import com.scsvision.gather.middleware.sqlserver.model.VehicleDetector;
import com.scsvision.gather.middleware.sqlserver.model.WeatherStat;
import com.scsvision.gather.middleware.sqlserver.model.WindSpeed;
import com.scsvision.gather.middleware.sqlserver.model.Wp;

/**
 * 采集缓存数据
 * 
 * @author huangbuji
 *         <p />
 *         Create at 2014-9-10 下午3:56:46
 */
public class CacheData {
	private static CacheData instance = new CacheData();
	public Map<String, VehicleDetector> vdData = new ConcurrentHashMap<String, VehicleDetector>();
	public Map<String, Cms> cmsData = new ConcurrentHashMap<String, Cms>();
	public Map<String, Covi> coviData = new ConcurrentHashMap<String, Covi>();
	public Map<String, Fan> fanData = new ConcurrentHashMap<String, Fan>();
	public Map<String, Light> lightData = new ConcurrentHashMap<String, Light>();
	public Map<String, Lil> lilData = new ConcurrentHashMap<String, Lil>();
	public Map<String, PushButton> pushButtonData = new ConcurrentHashMap<String, PushButton>();
	public Map<String, Rd> rdData = new ConcurrentHashMap<String, Rd>();
	public Map<String, Tsl> tslData = new ConcurrentHashMap<String, Tsl>();
	public Map<String, WindSpeed> wsData = new ConcurrentHashMap<String, WindSpeed>();
	public Map<String, Wp> wpData = new ConcurrentHashMap<String, Wp>();
	public Map<String, WeatherStat> wstData = new ConcurrentHashMap<String, WeatherStat>();
	public Map<String, NoDetector> noData = new ConcurrentHashMap<String, NoDetector>();
	public Map<String, FireDetector> fdData = new ConcurrentHashMap<String, FireDetector>();
	public Map<String, Loli> liData = new ConcurrentHashMap<String, Loli>();
	public Map<String, Loli> loData = new ConcurrentHashMap<String, Loli>();
	public Map<String, VehicleDetector> coliVdData = new ConcurrentHashMap<String, VehicleDetector>();

	private CacheData() {

	}

	public static CacheData getInstance() {
		return instance;
	}
}
