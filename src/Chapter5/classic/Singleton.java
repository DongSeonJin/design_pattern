package Chapter5.classic;

public class Singleton {
    private static Singleton uniqueSingleton;
    private Singleton(){}

    public static Singleton getInstance(){
        if (uniqueSingleton == null){
            uniqueSingleton = new Singleton();
        }
        return uniqueSingleton;
    }
}
