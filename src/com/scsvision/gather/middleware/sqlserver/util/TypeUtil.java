package com.scsvision.gather.middleware.sqlserver.util;

import org.apache.log4j.Logger;

/**
 * 类型转换工具
 * 
 * @author huangbuji
 *         <p />
 *         Create at 2014-9-22 下午2:37:07
 */
public class TypeUtil {

	private static Logger logger = Logger.getLogger(TypeUtil.class);

	/**
	 * 视频服务器
	 */
	public static final int DEVICE_TYPE_DVR = 1;
	/**
	 * 摄像头
	 */
	public static final int DEVICE_TYPE_CAMERA = 2;
	/**
	 * 车辆检测器
	 */
	public static final int DEVICE_TYPE_VD = 10;
	/**
	 * 风速风向检测器
	 */
	public static final int DEVICE_TYPE_WS = 11;
	/**
	 * 气象检测器
	 */
	public static final int DEVICE_TYPE_WST = 12;
	/**
	 * 光强检测器
	 */
	public static final int DEVICE_TYPE_LOLI = 13;
	/**
	 * 火灾检测器
	 */
	public static final int DEVICE_TYPE_FD = 14;
	/**
	 * 一氧化碳/能见度检测器
	 */
	public static final int DEVICE_TYPE_COVI = 15;
	/**
	 * 氮氧化物检测器
	 */
	public static final int DEVICE_TYPE_NOD = 16;
	/**
	 * 可变信息标志
	 */
	public static final int DEVICE_TYPE_CMS = 17;
	/**
	 * 风机
	 */
	public static final int DEVICE_TYPE_FAN = 18;
	/**
	 * 照明回路
	 */
	public static final int DEVICE_TYPE_LIGHT = 19;
	/**
	 * 防火卷帘门
	 */
	public static final int DEVICE_TYPE_RD = 20;
	/**
	 * 水泵
	 */
	public static final int DEVICE_TYPE_WP = 21;
	/**
	 * 栏杆机
	 */
	public static final int DEVICE_TYPE_RAIL = 22;
	/**
	 * 电光诱导标志
	 */
	public static final int DEVICE_TYPE_IS = 23;
	/**
	 * 手动报警按钮
	 */
	public static final int DEVICE_TYPE_PB = 24;
	/**
	 * 交通信号灯
	 */
	public static final int DEVICE_TYPE_TSL = 25;
	/**
	 * 车道指示灯
	 */
	public static final int DEVICE_TYPE_LIL = 26;
	/**
	 * 箱变电力监控
	 */
	public static final int DEVICE_TYPE_BT = 28;
	/**
	 * 能见度仪
	 */
	public static final int DEVICE_TYPE_VI_DETECTOR = 29;
	/**
	 * 路面检测器
	 */
	public static final int DEVICE_TYPE_ROAD_DETECTOR = 30;
	/**
	 * 桥面检测器
	 */
	public static final int DEVICE_TYPE_BRIDGE_DETECTOR = 31;
	/**
	 * 紧急电话
	 */
	public static final int DEVICE_TYPE_EMERGENCY_PHONE = 32;
	/**
	 * 太阳能电池
	 */
	public static final int DEVICE_TYPE_SOLAR_BATTERY = 33;

	public static int switchType(int type) {
		int myCenterType = 0;
		switch (type) {
		case 1:
			myCenterType = DEVICE_TYPE_LIL;
			break;
		case 2:
			myCenterType = DEVICE_TYPE_TSL;
			break;
		case 3:
			myCenterType = DEVICE_TYPE_RD;
			break;
		case 4:
			myCenterType = DEVICE_TYPE_CMS;
			break;
		case 6:
			myCenterType = DEVICE_TYPE_FAN;
			break;
		case 7:
			myCenterType = DEVICE_TYPE_COVI;
			break;
		case 8:
			myCenterType = DEVICE_TYPE_WS;
			break;
		case 9:
			myCenterType = DEVICE_TYPE_LOLI;
			break;
		case 10:
			myCenterType = DEVICE_TYPE_LIGHT;
			break;
		case 12:
			myCenterType = DEVICE_TYPE_VD;
			break;
		case 13:
			myCenterType = DEVICE_TYPE_PB;
			break;
		case 14:
			myCenterType = DEVICE_TYPE_FD;
			break;
		case 15:
			myCenterType = DEVICE_TYPE_EMERGENCY_PHONE;
			break;
		case 17:
			myCenterType = DEVICE_TYPE_VD;
			break;
		case 18:
			myCenterType = DEVICE_TYPE_WST;
			break;
		case 19:
			myCenterType = DEVICE_TYPE_VI_DETECTOR;
			break;
		case 24:
			myCenterType = DEVICE_TYPE_IS;
			break;
		case 25:
			myCenterType = DEVICE_TYPE_RD;
			break;
		case 26:
			myCenterType = DEVICE_TYPE_CAMERA;
			break;
		case 29:
			myCenterType = DEVICE_TYPE_WP;
			break;
		case 30:
			myCenterType = DEVICE_TYPE_BT;
			break;
		case 32:
			myCenterType = DEVICE_TYPE_ROAD_DETECTOR;
			break;
		case 33:
			myCenterType = DEVICE_TYPE_SOLAR_BATTERY;
			break;
		default:
			logger.error("Type[" + type + "] invalid !");
			myCenterType = type;
			break;
		}
		return myCenterType;
	}

	public static int switchXZType(int type) {
		int myCenterType = 0;
		switch (type) {
		case 1:
			myCenterType = DEVICE_TYPE_CMS;
			break;
		case 2:
			myCenterType = DEVICE_TYPE_FD;
			break;
		case 3:
			myCenterType = DEVICE_TYPE_COVI;
			break;
		case 4:
			myCenterType = DEVICE_TYPE_LIL;
			break;
		case 5:
			myCenterType = DEVICE_TYPE_LOLI;
			break;
		case 6:
			myCenterType = DEVICE_TYPE_LOLI;
			break;
		case 7:
			myCenterType = DEVICE_TYPE_TSL;
			break;
		case 8:
			myCenterType = DEVICE_TYPE_FAN;
			break;
		case 9:
			myCenterType = DEVICE_TYPE_COVI;
			break;
		case 10:
			myCenterType = DEVICE_TYPE_PB;
			break;
		case 16:
			myCenterType = DEVICE_TYPE_EMERGENCY_PHONE;
			break;
		case 17:
			myCenterType = DEVICE_TYPE_LIGHT;
			break;
		case 19:
			myCenterType = DEVICE_TYPE_FD;
			break;
		case 21:
			myCenterType = DEVICE_TYPE_CMS;
			break;
		case 22:
			myCenterType = DEVICE_TYPE_VD;
			break;
		case 23:
			myCenterType = DEVICE_TYPE_EMERGENCY_PHONE;
			break;
		default:
			logger.error("Type[" + type + "] invalid !");
			myCenterType = type;
			break;
		}
		return myCenterType;
	}
}
