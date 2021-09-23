package com.icecreamfactory.week4;
import java.util.ArrayList;


public class ArrayListIterator implements Iterator{
    ArrayList<IceCream> icecreams;
    
	int position = 0;
 
	public ArrayListIterator(ArrayList<IceCream> items) {
		this.icecreams = items;
	}
 
	public IceCream next() {
		IceCream item = icecreams.get(position);
		position = position + 1;
		return item;
	}
 
	public boolean hasNext() {
		if (position >= icecreams.size()) {
			return false;
		} else {
			return true;
		}
	}
}
