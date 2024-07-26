package Chapter9.iterator;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;


public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;

     
  
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
   
	public void printMenu() {
		Iterator panccakeIterator = pancakeHouseMenu.createIterator();
	}
   
	void printMenu(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}  
