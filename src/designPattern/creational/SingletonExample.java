//public class SingletonExample {
//
//	private static SingletonExample singletonExample;
//
//	private SingletonExample(){
//		System.out.println("Connecting to database");
//	}
//
//	public static SingletonExample getInstance(){
//		if(singletonExample == null){
//			singletonExample = new SingletonExample();
//		}
//
//		return singletonExample;
//	}
//
//}
//
//Singleton pattern ensures a class has only one instance and provides a global access point to it.
//
//When to use the Singleton Pattern
//When only one instance of a class should exist across the application.
//When you need centralized configuration, logging, or caching.
//For shared resources like database connections or file systems.