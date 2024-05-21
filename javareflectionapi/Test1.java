package javareflectionapi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Test1 {

	@SuppressWarnings({"rawtypes" })
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class c = Class.forName("javareflectionapi.User");
		Constructor[] constructors = c.getDeclaredConstructors();
		
		for(Constructor constructor : constructors) {
			System.out.println("Name of Constructor : " + constructor);
			System.out.println("Count of constructor Paramter : " + constructor.getParameterCount());
			
			Parameter[] parameters = constructor.getParameters();
			for(Parameter parameter: parameters) {
				System.out.println("Constructor's paramter: " + parameter);
			}
			System.err.println();
		}
		System.out.println();	
		
		Method[] methods = c.getDeclaredMethods();
		System.out.println("Length of method : " + methods.length);
		
		for(Method method : methods) {
			System.out.println("Method Name: \t" + method);
			System.out.println("Method Type: \t" + method.getReturnType());
			System.out.println("Method Paramter count: \t" + method.getParameterCount());
			System.out.println();
			Parameter[] parameters = method.getParameters();
			for( Parameter parameter: parameters) {
				System.out.println("Methods Parameter : " + parameter);
			}
			System.out.println();
		}
		
		Class[] classes = c.getDeclaredClasses();
		for(Class class1 : classes) {
			System.out.println("Class: " + class1);
			System.out.println("Name of class: " + class1.getName());
		}
		
		Annotation[] anno = c.getDeclaredAnnotations();
		for(Annotation annotation: anno) {
			System.out.println("Annotation: " + annotation);
		}
	}

}
