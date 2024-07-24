package templateMethod.barista;

public class Tea implements CaffeineBeverage {

	@Override
	public void brew() {
		System.out.println("Steeping the tea");

	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}
}
