package com.effectivejava.chapter05.item33.demo;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Favourites {

	public static void main(String[] args) {
		Favourites f = new Favourites();
		f.putFavorite(String.class, "java");
		f.putFavorite(Integer.class, 0xcafebabe);
		f.putFavorite(Class.class, Favourites.class);
		String str = f.getFavorite(String.class);
		int intd = f.getFavorite(Integer.class);
		Class<?> fclass = f.getFavorite(Class.class);
		System.out.printf("%s %x %s%n", str, intd, fclass.getName());

	}

	private Map<Class<?>, Object> favorites = new HashMap<>();

	public <T> void putFavorite(Class<T> type, T instance) {
		favorites.put(Objects.requireNonNull(type), type.cast(instance));
	}

	public <T> T getFavorite(Class<T> type) {
		return type.cast(favorites.get(type));
	}

	static Annotation getAnnotation(AnnotatedElement element, String annotationTypeName) {
		Class<?> annotationType = null;
		try {
			annotationType = Class.forName(annotationTypeName);
		} catch (ClassNotFoundException e) {
			throw new IllegalArgumentException(e);
		}
		return element.getAnnotation(annotationType.asSubclass(Annotation.class));

	}
}
