package com.effectivejava.chapter02.item01.demo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {
	// 不可实例化
	private Services() {

	}

	private final static Map<String, Provider> providers = new ConcurrentHashMap<String, Provider>();

	private final static String DEFAULT_PROVIDER_NAME = "<def>";

	// 提供者注册API
	public static void registerDefaultProvider(Provider provider) {
		registerProvider(DEFAULT_PROVIDER_NAME, provider);
	}

	public static void registerProvider(String name, Provider provider) {
		providers.put(name, provider);
	}

	// 服务访问API
	public static Service newInstance() {
		return newInstance(DEFAULT_PROVIDER_NAME);
	}

	public static Service newInstance(String name){
		Provider provider = providers.get(name);
		if(provider==null)
			throw new RuntimeException();
		return provider.newService();
	}

}

/**
 * 服务接口
 *
 */
interface Service {

}

/**
 * 服务提供接口
 *
 */
interface Provider {

	Service newService();

}
