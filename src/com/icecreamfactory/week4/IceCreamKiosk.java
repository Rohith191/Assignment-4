package com.icecreamfactory.week4;

import java.util.HashMap;

public class IceCreamKiosk {
	HashMap<String, IceCreamMenu> brandMenus = new HashMap<String, IceCreamMenu>();
	
	public void addBrandMenu(String brand, IceCreamMenu menu) {
		brandMenus.put(brand, menu);
	}
	
	public void displayFullMenuOfBrand_WithArrayIterator(String brand) {
		IceCreamMenu menu = brandMenus.get(brand);
		ArrayIterator iterator = menu.createArrayIterator();
		printIceCreamMenu(brand, iterator);
	}
	
	public void displayFullMenuOfBrand_WithArrayListIterator(String brand) {
		IceCreamMenu menu = brandMenus.get(brand);
		ArrayListIterator iterator = menu.createArrayListIterator();
		printIceCreamMenu(brand, iterator);
	}
	void printIceCreamMenu(String brand, Iterator iterator) {
		printHeader(brand);
		while (iterator.hasNext()) {
			IceCream ice = iterator.next();
			printRow(ice.getFlavour(), ice.getDescription(), ice.getHasNuts(), ice.getPrice());
		}
		printFooter();
	}
	
	public void displayNonAllergicIceCreamsOfBrand(String brand) {
		IceCreamMenu menu = brandMenus.get(brand);
		ArrayIterator iterator = menu.createArrayIterator();
		printHeader(brand);
		while (iterator.hasNext()) {
			IceCream ice = iterator.next();
			if(!ice.getHasNuts())
				printRow(ice.getFlavour(), ice.getDescription(), ice.getHasNuts(), ice.getPrice());
		}
		printFooter();
	}
	private void printHeader(String brand)
	{
		System.out.println("-------------------------------"+brand+" IceCream Menu -------------------------------------");
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("|	Flavour	 	|	Description	|	Has Nuts	|	Price	|");
		System.out.println("-------------------------------------------------------------------------------------------------");
	}
	private void printRow(String flavour, String description, Boolean hasNuts, Double price) {
		String priceinUsd = "$"+price.toString();
		String hashnutsstr = hasNuts ? "Yes" : "No";
		System.out.println("| 	"+flavour+"	 | 	"+description+"	 | 	"+hashnutsstr+" 		| 	"+priceinUsd+" 	|	");
	}
	private void printFooter()
	{
		System.out.println("-------------------------------------------------------------------------------------------------");
	}
}
