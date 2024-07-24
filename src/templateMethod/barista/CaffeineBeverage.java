package templateMethod.barista;

public interface CaffeineBeverage {
  
	default void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
 
	void brew();
  
	void addCondiments();
 
	default void boilWater() {
		System.out.println("Boiling water");
	}
  
	default void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
