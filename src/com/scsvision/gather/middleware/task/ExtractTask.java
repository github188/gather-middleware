package com.scsvision.gather.middleware.task;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.scsvision.gather.middleware.data.service.DataService;
import com.scsvision.gather.middleware.sqlserver.dao.CmsDAO;
import com.scsvision.gather.middleware.sqlserver.dao.ColiVdDAO;
import com.scsvision.gather.middleware.sqlserver.dao.CoviDAO;
import com.scsvision.gather.middleware.sqlserver.dao.FanDAO;
import com.scsvision.gather.middleware.sqlserver.dao.FireDetectorDAO;
import com.scsvision.gather.middleware.sqlserver.dao.LiDAO;
import com.scsvision.gather.middleware.sqlserver.dao.LightDAO;
import com.scsvision.gather.middleware.sqlserver.dao.LilDAO;
import com.scsvision.gather.middleware.sqlserver.dao.LoDAO;
import com.scsvision.gather.middleware.sqlserver.dao.NoDetectorDAO;
import com.scsvision.gather.middleware.sqlserver.dao.PushButtonDAO;
import com.scsvision.gather.middleware.sqlserver.dao.RdDAO;
import com.scsvision.gather.middleware.sqlserver.dao.TslDAO;
import com.scsvision.gather.middleware.sqlserver.dao.VehicleDetectorDAO;
import com.scsvision.gather.middleware.sqlserver.dao.WeatherStatDAO;
import com.scsvision.gather.middleware.sqlserver.dao.WindSpeedDAO;
import com.scsvision.gather.middleware.sqlserver.dao.WpDAO;
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
 * 数据采集任务
 * 
 * @author huangbuji
 *         <p />
 *         Create at 2014-9-18 下午3:52:01
 */
@Component
public class ExtractTask {

	private static Logger logger = Logger.getLogger(ExtractTask.class);
	@Autowired
	private DataService dataService;
	@Autowired
	private VehicleDetectorDAO vdDAO;
	@Autowired
	private CoviDAO coviDAO;
	@Autowired
	private CmsDAO cmsDAO;
	@Autowired
	private FanDAO fanDAO;
	@Autowired
	private FireDetectorDAO fireDetectorDAO;
	@Autowired
	private LiDAO liDAO;
	@Autowired
	private LightDAO lightDAO;
	@Autowired
	private LilDAO lilDAO;
	@Autowired
	private LoDAO loDAO;
	@Autowired
	private NoDetectorDAO noDetectorDAO;
	@Autowired
	private PushButtonDAO pushButtonDAO;
	@Autowired
	private RdDAO rdDAO;
	@Autowired
	private TslDAO tslDAO;
	@Autowired
	private WeatherStatDAO weatherStatDAO;
	@Autowired
	private WindSpeedDAO windSpeedDAO;
	@Autowired
	private WpDAO wpDAO;
	@Autowired
	private ColiVdDAO coliVdDAO;

	private Callable<List<VehicleDetector>> vdCall;

	private Callable<List<Covi>> coviCall;

	private Callable<List<Cms>> cmsCall;

	private Callable<List<Fan>> fanCall;

	private Callable<List<FireDetector>> fdCall;

	private Callable<List<Loli>> liCall;

	private Callable<List<Light>> lightCall;

	private Callable<List<Lil>> lilCall;

	private Callable<List<Loli>> loCall;

	private Callable<List<NoDetector>> noCall;

	private Callable<List<PushButton>> pbCall;

	private Callable<List<Rd>> rdCall;

	private Callable<List<Tsl>> tslCall;

	private Callable<List<WeatherStat>> wstCall;

	private Callable<List<WindSpeed>> wsCall;

	private Callable<List<Wp>> wpCall;

	private Callable<List<VehicleDetector>> coliVdCall;

	@Scheduled(cron = "0 0/1 * * * ?")
	public void extract() {
		try {
			logger.info("do extract...");
			ExecutorService executor = Executors.newFixedThreadPool(17);

			// 初始化线程任务
			initCall();
			// 提交执行
			Future<List<VehicleDetector>> vdFuture = executor.submit(vdCall);
			Future<List<Covi>> coviFuture = executor.submit(coviCall);
			Future<List<Cms>> cmsFuture = executor.submit(cmsCall);
			Future<List<Fan>> fanFuture = executor.submit(fanCall);
			Future<List<FireDetector>> fdFuture = executor.submit(fdCall);
			Future<List<Loli>> liFuture = executor.submit(liCall);
			Future<List<Light>> lightFuture = executor.submit(lightCall);
			Future<List<Lil>> lilFuture = executor.submit(lilCall);
			Future<List<Loli>> loFuture = executor.submit(loCall);
			Future<List<NoDetector>> noFuture = executor.submit(noCall);
			Future<List<PushButton>> pbFuture = executor.submit(pbCall);
			Future<List<Rd>> rdFuture = executor.submit(rdCall);
			Future<List<Tsl>> tslFuture = executor.submit(tslCall);
			Future<List<WeatherStat>> wstFuture = executor.submit(wstCall);
			Future<List<WindSpeed>> wsFuture = executor.submit(wsCall);
			Future<List<Wp>> wpFuture = executor.submit(wpCall);
			Future<List<VehicleDetector>> coliVdFuture = executor
					.submit(coliVdCall);

			List<VehicleDetector> vds = vdFuture.get();
			if (null != coliVdFuture.get()) {
				vds.addAll(coliVdFuture.get());
			}
			List<Covi> covis = coviFuture.get();
			List<Cms> cmss = cmsFuture.get();
			// Set<Cms> setCms = new HashSet<Cms>();
			// if (null != cmss) {
			// setCms.addAll(cmss);
			// }
			List<Fan> fans = fanFuture.get();
			List<FireDetector> fds = fdFuture.get();
			List<Loli> lis = liFuture.get();
			List<Light> lights = lightFuture.get();
			List<Lil> lils = lilFuture.get();
			List<Loli> los = loFuture.get();
			List<NoDetector> nos = noFuture.get();
			List<PushButton> pbs = pbFuture.get();
			List<Rd> rds = rdFuture.get();
			List<Tsl> tsls = tslFuture.get();
			List<WeatherStat> wsts = wstFuture.get();
			List<WindSpeed> wss = wsFuture.get();
			List<Wp> wps = wpFuture.get();
			executor.shutdown();

			// 写入缓存
			if (null != vds) {
				for (VehicleDetector vd : vds) {
					dataService.writeVd(vd);
				}
			}
			if (null != covis) {
				for (Covi covi : covis) {
					dataService.writeCovi(covi);
				}
			}
			if (null != cmss) {
				for (Cms cms : cmss) {
					dataService.writeCms(cms);
				}
			}
			// if (null != setCms) {
			// Iterator<Cms> ite = setCms.iterator();
			// while (ite.hasNext()) {
			// dataService.writeCms(ite.next());
			// }
			// }
			if (null != fans) {
				for (Fan fan : fans) {
					dataService.writeFan(fan);
				}
			}
			if (null != fds) {
				for (FireDetector fd : fds) {
					dataService.writeFd(fd);
				}
			}
			if (null != lights) {
				for (Light light : lights) {
					dataService.writeLight(light);
				}
			}
			if (null != lis) {
				for (Loli li : lis) {
					dataService.writeLi(li);
				}
			}
			if (null != lils) {
				for (Lil lil : lils) {
					dataService.writeLil(lil);
				}
			}
			if (null != los) {
				for (Loli lo : los) {
					dataService.writeLo(lo);
				}
			}
			if (null != nos) {
				for (NoDetector no : nos) {
					dataService.writeNo(no);
				}
			}
			if (null != pbs) {
				for (PushButton pb : pbs) {
					dataService.writePushButton(pb);
				}
			}
			if (null != rds) {
				for (Rd rd : rds) {
					dataService.writeRd(rd);
				}
			}
			if (null != tsls) {
				for (Tsl tsl : tsls) {
					dataService.writeTsl(tsl);
				}
			}
			if (null != wsts) {
				for (WeatherStat wst : wsts) {
					dataService.writeWst(wst);
				}
			}
			if (null != wss) {
				for (WindSpeed ws : wss) {
					dataService.writeWindSpeed(ws);
				}
			}
			if (null != wps) {
				for (Wp wp : wps) {
					dataService.writeWp(wp);
				}
			}
			logger.info("extract success!");
		} catch (InterruptedException e) {
			logger.error(null, e);
		} catch (ExecutionException e) {
			logger.error(null, e);
		} catch (Exception e) {
			logger.error(null, e);
		}
	}

	private void initCall() {
		// 车检器采集
		vdCall = new Callable<List<VehicleDetector>>() {
			@Override
			public List<VehicleDetector> call() throws Exception {
				return vdDAO.extract();
			}
		};
		// covi采集
		coviCall = new Callable<List<Covi>>() {
			@Override
			public List<Covi> call() throws Exception {
				return coviDAO.extract();
			}

		};
		// cms采集
		cmsCall = new Callable<List<Cms>>() {
			@Override
			public List<Cms> call() throws Exception {
				return cmsDAO.extract();
			}
		};
		// fan采集
		fanCall = new Callable<List<Fan>>() {
			@Override
			public List<Fan> call() throws Exception {
				return fanDAO.extract();
			}
		};
		// 火灾检测器采集
		fdCall = new Callable<List<FireDetector>>() {
			@Override
			public List<FireDetector> call() throws Exception {
				return fireDetectorDAO.extract();
			}
		};
		// li采集
		liCall = new Callable<List<Loli>>() {
			@Override
			public List<Loli> call() throws Exception {
				return liDAO.extract();
			}
		};
		// light采集
		lightCall = new Callable<List<Light>>() {
			@Override
			public List<Light> call() throws Exception {
				return lightDAO.extract();
			}
		};
		// lil采集
		lilCall = new Callable<List<Lil>>() {
			@Override
			public List<Lil> call() throws Exception {
				return lilDAO.extract();
			}
		};
		// lo采集
		loCall = new Callable<List<Loli>>() {
			@Override
			public List<Loli> call() throws Exception {
				return loDAO.extract();
			}
		};
		// no采集
		noCall = new Callable<List<NoDetector>>() {
			@Override
			public List<NoDetector> call() throws Exception {
				return noDetectorDAO.extract();
			}
		};
		// pushButton 采集
		pbCall = new Callable<List<PushButton>>() {
			@Override
			public List<PushButton> call() throws Exception {
				return pushButtonDAO.extract();
			}
		};
		// rd采集
		rdCall = new Callable<List<Rd>>() {
			@Override
			public List<Rd> call() throws Exception {
				return rdDAO.extract();
			}
		};
		// tsl采集
		tslCall = new Callable<List<Tsl>>() {
			@Override
			public List<Tsl> call() throws Exception {
				return tslDAO.extract();
			}
		};
		// wst采集
		wstCall = new Callable<List<WeatherStat>>() {
			@Override
			public List<WeatherStat> call() throws Exception {
				return weatherStatDAO.extract();
			}
		};
		// ws采集
		wsCall = new Callable<List<WindSpeed>>() {
			@Override
			public List<WindSpeed> call() throws Exception {
				return windSpeedDAO.extract();
			}
		};
		// wp采集
		wpCall = new Callable<List<Wp>>() {
			@Override
			public List<Wp> call() throws Exception {
				return wpDAO.extract();
			}
		};
		// coliVd采集
		coliVdCall = new Callable<List<VehicleDetector>>() {
			@Override
			public List<VehicleDetector> call() throws Exception {
				return coliVdDAO.extract();
			}
		};
	}
}
