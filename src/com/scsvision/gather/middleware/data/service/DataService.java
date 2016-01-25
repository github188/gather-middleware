package com.scsvision.gather.middleware.data.service;

import java.util.Collection;

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
 * DataService
 * 
 * @author huangbuji
 *         <p />
 *         Create at 2014-9-10 下午4:07:48
 */
public interface DataService {
	public void writeVd(VehicleDetector vd);

	public VehicleDetector readVd(String sn);

	public Collection<VehicleDetector> listVd();

	public void writeCms(Cms cms);

	public Cms readCms(String sn);

	public Collection<Cms> listCms();

	public void writeCovi(Covi covi);

	public Covi readCovi(String sn);

	public Collection<Covi> listCovi();

	public void writeFan(Fan fan);

	public Fan readFan(String sn);

	public Collection<Fan> listFan();

	public void writeLight(Light light);

	public Light readLight(String sn);

	public Collection<Light> listLight();

	public void writeLil(Lil lil);

	public Lil readLil(String sn);

	public Collection<Lil> listLil();

	public void writePushButton(PushButton pb);

	public PushButton readPushButton(String sn);

	public Collection<PushButton> listPushButton();

	public void writeRd(Rd rd);

	public Rd readRd(String sn);

	public Collection<Rd> listRd();

	public void writeTsl(Tsl tsl);

	public Tsl readTsl(String sn);

	public Collection<Tsl> listTsl();

	public void writeWindSpeed(WindSpeed ws);

	public WindSpeed readWindSpeed(String sn);

	public Collection<WindSpeed> listWindSpeed();

	public void writeWp(Wp wp);

	public Wp readWp(String sn);

	public Collection<Wp> listWp();

	public void writeWst(WeatherStat wst);

	public WeatherStat readWst(String sn);

	public Collection<WeatherStat> listWst();

	public void writeNo(NoDetector no);

	public NoDetector readNo(String sn);

	public Collection<NoDetector> listNo();

	public void writeFd(FireDetector fd);

	public FireDetector readFd(String sn);

	public Collection<FireDetector> listFd();

	public void writeLi(Loli li);

	public Loli readLi(String sn);

	public Collection<Loli> listLi();

	public void writeLo(Loli lo);

	public Loli readLo(String sn);

	public Collection<Loli> listLo();

	public void writeColiVd(VehicleDetector coliVd);

	public VehicleDetector readColiVd(String sn);

	public Collection<VehicleDetector> listColiVd();

}
