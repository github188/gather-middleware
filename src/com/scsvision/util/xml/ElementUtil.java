package com.scsvision.util.xml;

import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

/**
 * xml Element工具
 * 
 * @author huangbuji
 *         <p />
 *         2012-8-15 上午10:53:10
 */
public class ElementUtil {

	private static SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	/**
	 * 创建一个Element，所有的属性值按照原始obj对象包括父类对象的public get方法生成
	 * 
	 * @param name
	 *            要生成的Element名称
	 * @param obj
	 *            原始对象
	 * @param childProperties
	 *            需要生成为child element的属性
	 * @param excludeProperties
	 *            例外的属性名称
	 * @return
	 */
	public static Element createElement(String name, Object obj,
			List<String> childProperties, List<String> excludeProperties)
			throws Exception {
		Element element = new Element(name);
		Method[] methods = obj.getClass().getMethods();
		for (Method method : methods) {
			String methodName = method.getName();
			// 只关注get方法和is开头的属性值获取相关方法
			if (methodName.startsWith("get") || methodName.startsWith("is")) {
				String key = getPropertyName(methodName);
				if (null != excludeProperties
						&& excludeProperties.contains(key.toLowerCase())) {
					continue;
				}
				if (method.getReturnType().getName().equals("java.util.List")) {
					continue;
				}
				if (method.getReturnType().getName().equals("java.util.Set")) {
					continue;
				}
				if (method.getReturnType().getName().equals("java.lang.Class")) {
					continue;
				}
				if (method.getReturnType().getName()
						.startsWith("com.scsvision")) {
					continue;
				}
				String value = "";
				try {
					Object o = method.invoke(obj);
					if (null != o) {
						value = o.toString();
					}
				} catch (Exception e) {
					e.printStackTrace();
					continue;
				}
				if (null != childProperties
						&& childProperties.contains(key.toLowerCase())) {
					Element child = new Element(key);
					child.setText(value);
					element.addContent(child);
				} else {
					element.setAttribute(key, value);
				}
			}
		}

		return element;
	}

	/**
	 * 创建一个Element，所有的属性值按照原始obj对象包括父类对象的public get方法生成
	 * 
	 * @param name
	 *            要生成的Element名称
	 * @param obj
	 *            原始对象
	 * @return
	 * @throws Exception
	 * @author huangbuji
	 *         <p />
	 *         Create at 2014-8-28 下午3:23:09
	 */
	public static Element createElement(String name, Object obj)
			throws Exception {
		return ElementUtil.createElement(name, obj, null, null);
	}

	/**
	 * 根据对象属性名称获得对应的get方法
	 * 
	 * @param fieldName
	 *            对象属性名称
	 * @return
	 */
	public static String convertGetMethod(String fieldName) {
		return "get" + firstCharToUpperCase(fieldName);
	}

	/**
	 * 根据get或is开头的方法，获取属性的名称，第一个字母大写
	 * 
	 * @param methodName
	 *            get或is开头的属性获取方法
	 * @return 第一个字母大写的属性名称
	 */
	public static String getPropertyName(String methodName) {
		if (methodName.startsWith("get")) {
			return methodName.substring(3);
		} else if (methodName.startsWith("is")) {
			return methodName.substring(2);
		} else {
			return methodName;
		}
	}

	/**
	 * 将名称的第一个字母大写，如：name转换为Name
	 * 
	 * @param name
	 *            要转换的名称
	 * @return
	 */
	public static String firstCharToUpperCase(String name) {
		return name.substring(0, 1).toUpperCase() + name.substring(1);
	}

	/**
	 * XML转换为UTF-8字符串
	 * 
	 * @param doc
	 *            XML对象
	 * @return XML的字符串
	 * @author huangbuji
	 *         <p />
	 *         Create at 2013-9-22 上午11:18:54
	 */
	public static String doc2String(Document doc) {
		Format format = Format.getRawFormat();
		format.setEncoding("UTF-8");
		format.setIndent("  ");
		XMLOutputter out = new XMLOutputter(format);
		return out.outputString(doc);
	}

	public static Integer getInteger(Element e, String name) {
		String value = e.getAttributeValue(name);
		if (StringUtils.isBlank(value)) {
			return null;
		} else {
			try {
				return Integer.valueOf(value);
			} catch (NumberFormatException e1) {
				throw new IllegalArgumentException("parameter name[" + value
						+ "] invalid !");
			}
		}
	}

	public static Short getShort(Element e, String name) {
		String value = e.getAttributeValue(name);
		if (StringUtils.isBlank(value)) {
			return null;
		} else {
			try {
				return Short.valueOf(value);
			} catch (NumberFormatException e1) {
				throw new IllegalArgumentException("parameter name[" + value
						+ "] invalid !");
			}
		}
	}

	public static Long getLong(Element e, String name) {
		String value = e.getAttributeValue(name);
		if (StringUtils.isBlank(value)) {
			return null;
		} else {
			try {
				return Long.valueOf(value);
			} catch (NumberFormatException e1) {
				throw new IllegalArgumentException("parameter name[" + value
						+ "] invalid !");
			}
		}
	}

	public static Timestamp getTimestamp(Element e, String name) {
		String value = e.getAttributeValue(name);
		if (StringUtils.isBlank(value)) {
			return new Timestamp(System.currentTimeMillis());
		} else {
			try {
				Date date = sdf.parse(value);
				return new Timestamp(date.getTime());
			} catch (ParseException e1) {
				throw new IllegalArgumentException("parameter name[" + value
						+ "] invalid !");
			}
		}
	}

}
