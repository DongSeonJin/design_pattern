package Chapter3;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		double cost = beverage.cost();
		if (beverage.getSize() == Beverage.Size.TALL) {
			cost += .10;
		} else if (beverage.getSize() == Beverage.Size.GRANDE) {
			cost += .15;
		} else if (beverage.getSize() == Beverage.Size.VENTI) {
			cost += .20;
		}
		return cost;
	}
}
