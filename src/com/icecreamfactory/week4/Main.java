package com.icecreamfactory.week4;

public class Main {

	public static void main(String[] args) {
		
		BaskinRobbinsMenu br_menu = new BaskinRobbinsMenu();
		br_menu.buildMenu();
		
		IceCreamKiosk kiosk = new IceCreamKiosk();
		kiosk.addBrandMenu("Baskin Robbins", br_menu);
		
		kiosk.displayFullMenuOfBrand_WithArrayIterator("Baskin Robbins");
		//kiosk.displayFullMenuOfBrand_WithArrayListIterator("Baskin Robbins");
		
		kiosk.displayNonAllergicIceCreamsOfBrand("Baskin Robbins");
	}

}
