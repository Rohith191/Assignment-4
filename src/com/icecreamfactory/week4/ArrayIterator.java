package com.icecreamfactory.week4;

public class ArrayIterator implements Iterator {
	IceCream[] items;
	int position = 0;
 
	public ArrayIterator(IceCream[] items) {
		this.items = items;
	}
 
	public IceCream next() {
		IceCream IceCream = items[position];
		position = position + 1;
		return IceCream;
	}
 
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}
