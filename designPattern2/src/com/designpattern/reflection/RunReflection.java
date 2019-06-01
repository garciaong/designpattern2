package com.designpattern.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunReflection {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		// Reflection slowed down JVM performance, use sparingly
		String className = Computer.class.getName();
		System.out.println("Class name : " + className);
		Class classObj = Class.forName(className);
		Object object = classObj.newInstance();
		// Invoke setName()
		Class[] setNameParams = new Class[] { String.class };
		Object[] setNameValues = new Object[] { new String("Dell Ultrabook") };
		Method setNameMethod = classObj.getDeclaredMethod("setName", setNameParams);
		setNameMethod.invoke(object, setNameValues);
		// Invoke setPrice()
		Class[] setPriceParams = new Class[] { Double.TYPE };
		Object[] setPriceValues = new Object[] { new Double(4699.00) };
		Method setPriceMethod = classObj.getDeclaredMethod("setPrice", setPriceParams);
		setPriceMethod.invoke(object, setPriceValues);
		// Invoke toString()
		Method toStringMethod = classObj.getDeclaredMethod("toString", null);
		String result = (String)toStringMethod.invoke(object, null);
		System.out.println(result);
	}

}
