package com.icecreamfactory.week4;

public interface IceCreamMenu {
	ArrayIterator createArrayIterator();
	ArrayListIterator createArrayListIterator();
	void buildMenu();
	IceCream[] getMenuItems();
}
