package Chapter5.multiThreadSafe;

public class Singleton {
	private static Singleton uniqueInstance;
 
	private Singleton() {}
 
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
	public String getDescription() {
		return "쓰레드 세잎!";
	}
}
