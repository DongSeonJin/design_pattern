package templateMethod.barista;

public class Coffee implements CaffeineBeverage {

	@Override
	public void brew() {
		System.out.println("Dripping Coffee through filter");

	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
}
