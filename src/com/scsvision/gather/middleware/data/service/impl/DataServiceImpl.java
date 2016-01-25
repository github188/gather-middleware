package com.scsvision.gather.middleware.data.service.impl;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.scsvision.gather.middleware.data.CacheData;
import com.scsvision.gather.middleware.data.service.DataService;
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
 * DataServiceImpl
 * 
 * @author huangbuji
 *         <p />
 *         Create at 2014-9-10 下午4:08:26
 */
@Service
public class DataServiceImpl implements DataService {

	public void writeVd(VehicleDetector vd) {
		CacheData.getInstance().vdData.put(vd.getStandardNumber(), vd);
	}

	public VehicleDetector readVd(String sn) {
		return CacheData.getInstance().vdData.get(sn);
	}

	public Collection<VehicleDetector> listVd() {
		return CacheData.getInstance().vdData.values();
	}

	@Override
	public void writeCms(Cms cms) {
		CacheData.getInstance().cmsData.put(
				cms.getStandardNumber() + cms.getDispText(), cms);
	}

	@Override
	public Cms readCms(String sn) {
		return CacheData.getInstance().cmsData.get(sn);
	}

	@Override
	public Collection<Cms> listCms() {
		return CacheData.getInstance().cmsData.values();
	}

	@Override
	public void writeCovi(Covi covi) {
		CacheData.getInstance().coviData.put(covi.getStandardNumber(), covi);
	}

	@Override
	public Covi readCovi(String sn) {
		return CacheData.getInstance().coviData.get(sn);
	}

	@Override
	public Collection<Covi> listCovi() {
		return CacheData.getInstance().coviData.values();
	}

	@Override
	public void writeFan(Fan fan) {
		CacheData.getInstance().fanData.put(fan.getStandardNumber(), fan);
	}

	@Override
	public Fan readFan(String sn) {
		return CacheData.getInstance().fanData.get(sn);
	}

	@Override
	public Collection<Fan> listFan() {
		return CacheData.getInstance().fanData.values();
	}

	@Override
	public void writeLight(Light light) {
		CacheData.getInstance().lightData.put(light.getStandardNumber(), light);
	}

	@Override
	public Light readLight(String sn) {
		return CacheData.getInstance().lightData.get(sn);
	}

	@Override
	public Collection<Light> listLight() {
		return CacheData.getInstance().lightData.values();
	}

	@Override
	public void writeLil(Lil lil) {
		CacheData.getInstance().lilData.put(lil.getStandardNumber(), lil);
	}

	@Override
	public Lil readLil(String sn) {
		return CacheData.getInstance().lilData.get(sn);
	}

	@Override
	public Collection<Lil> listLil() {
		return CacheData.getInstance().lilData.values();
	}

	@Override
	public void writePushButton(PushButton pb) {
		CacheData.getInstance().pushButtonData.put(pb.getStandardNumber(), pb);
	}

	@Override
	public PushButton readPushButton(String sn) {
		return CacheData.getInstance().pushButtonData.get(sn);
	}

	@Override
	public Collection<PushButton> listPushButton() {
		return CacheData.getInstance().pushButtonData.values();
	}

	@Override
	public void writeRd(Rd rd) {
		CacheData.getInstance().rdData.put(rd.getStandardNumber(), rd);
	}

	@Override
	public Rd readRd(String sn) {
		return CacheData.getInstance().rdData.get(sn);
	}

	@Override
	public Collection<Rd> listRd() {
		return CacheData.getInstance().rdData.values();
	}

	@Override
	public void writeTsl(Tsl tsl) {
		CacheData.getInstance().tslData.put(tsl.getStandardNumber(), tsl);
	}

	@Override
	public Tsl readTsl(String sn) {
		return CacheData.getInstance().tslData.get(sn);
	}

	@Override
	public Collection<Tsl> listTsl() {
		return CacheData.getInstance().tslData.values();
	}

	@Override
	public void writeWindSpeed(WindSpeed ws) {
		CacheData.getInstance().wsData.put(ws.getStandardNumber(), ws);
	}

	@Override
	public WindSpeed readWindSpeed(String sn) {
		return CacheData.getInstance().wsData.get(sn);
	}

	@Override
	public Collection<WindSpeed> listWindSpeed() {
		return CacheData.getInstance().wsData.values();
	}

	@Override
	public void writeWp(Wp wp) {
		CacheData.getInstance().wpData.put(wp.getStandardNumber(), wp);
	}

	@Override
	public Wp readWp(String sn) {
		return CacheData.getInstance().wpData.get(sn);
	}

	@Override
	public Collection<Wp> listWp() {
		return CacheData.getInstance().wpData.values();
	}

	@Override
	public void writeWst(WeatherStat wst) {
		CacheData.getInstance().wstData.put(wst.getStandardNumber(), wst);
	}

	@Override
	public WeatherStat readWst(String sn) {
		return CacheData.getInstance().wstData.get(sn);
	}

	@Override
	public Collection<WeatherStat> listWst() {
		return CacheData.getInstance().wstData.values();
	}

	@Override
	public void writeNo(NoDetector no) {
		CacheData.getInstance().noData.put(no.getStandardNumber(), no);
	}

	@Override
	public NoDetector readNo(String sn) {
		return CacheData.getInstance().noData.get(sn);
	}

	@Override
	public Collection<NoDetector> listNo() {
		return CacheData.getInstance().noData.values();
	}

	@Override
	public void writeFd(FireDetector fd) {
		CacheData.getInstance().fdData.put(fd.getStandardNumber(), fd);
	}

	@Override
	public FireDetector readFd(String sn) {
		return CacheData.getInstance().fdData.get(sn);
	}

	@Override
	public Collection<FireDetector> listFd() {
		return CacheData.getInstance().fdData.values();
	}

	@Override
	public void writeLi(Loli li) {
		CacheData.getInstance().liData.put(li.getStandardNumber(), li);
	}

	@Override
	public Loli readLi(String sn) {
		return CacheData.getInstance().liData.get(sn);
	}

	@Override
	public Collection<Loli> listLi() {
		return CacheData.getInstance().liData.values();
	}

	@Override
	public void writeLo(Loli lo) {
		CacheData.getInstance().loData.put(lo.getStandardNumber(), lo);
	}

	@Override
	public Loli readLo(String sn) {
		return CacheData.getInstance().loData.get(sn);
	}

	@Override
	public Collection<Loli> listLo() {
		return CacheData.getInstance().loData.values();
	}

	@Override
	public void writeColiVd(VehicleDetector coliVd) {
		CacheData.getInstance().coliVdData.put(coliVd.getStandardNumber(),
				coliVd);
	}

	@Override
	public VehicleDetector readColiVd(String sn) {
		return CacheData.getInstance().coliVdData.get(sn);
	}

	@Override
	public Collection<VehicleDetector> listColiVd() {
		return CacheData.getInstance().coliVdData.values();
	}
}
