package bank.proxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class Logger implements InvocationHandler {
	private Object obj;

	public Logger(Object obj) {
		this.obj = obj;
	}

	public Object invoke(Object proxy, Method m, Object[] args)
			throws Throwable {
		System.out.println("Logger: Invoking " + m.getName());
		return m.invoke(obj, args);
	}
}