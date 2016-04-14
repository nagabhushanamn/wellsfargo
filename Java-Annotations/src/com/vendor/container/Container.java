package com.vendor.container;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.dev.comps.ComponentA;
import com.vendor.annotations.RequestMapping;

public class Container {

	public void processReq(String req) {

		try {

			Class clazz = Class.forName("com.dev.comps.ComponentA");
			Object comp = clazz.newInstance();

			Method[] methods = clazz.getMethods();
			for (Method method : methods) {
				RequestMapping rm = method.getAnnotation(RequestMapping.class);
				if (rm != null) {
					String url = rm.url();
					if (req.equals(url)) {
						method.invoke(comp, new Object[] {});
					}
				}
			}

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}

	}

}
