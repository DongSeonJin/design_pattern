package Chapter11;

public class test {

	public static void main(String[] args) {
		int count = 0;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

		count = Integer.parseInt(args[1]);

		GumballMachine gumballMachine = new GumballMachine(args[0], count);

		GumballMonitor monitor = new GumballMonitor(gumballMachine);



		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		monitor.report();
	}
}
