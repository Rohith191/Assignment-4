package com.icecreamfactory.week4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

public class BaskinRobbinsMenu implements IceCreamMenu{
    IceCream[] products;
    
    public BaskinRobbinsMenu(){
        products = new IceCream[10];
    }

    @Override
	public ArrayIterator createArrayIterator()
    {
    	return new ArrayIterator(products);
    }
    
    @Override
    public ArrayListIterator createArrayListIterator()
    {
    	ArrayList<IceCream> icecreams = new ArrayList<IceCream>();
    	Collections.addAll(icecreams, products);
    	return new ArrayListIterator(icecreams);
    }
	private void AddIceCreamToMenu(int i, String name, String flavour, boolean hasNuts, double price)
    {
        IceCream ice = new IceCream(name, flavour, hasNuts, price);
        UUID uuid = UUID.randomUUID();
        ice.setId(uuid.toString());
        products[i] = ice;
    }
	
    @Override
	public void buildMenu()
    {
    	AddIceCreamToMenu(0, "sundaychocalate", "chocochips", true, 5d);
    	AddIceCreamToMenu(1, "cookiemonster", "oreochip", false, 6d);
    	AddIceCreamToMenu(2, "redvelvet", "cheesecake", false, 7d);
    	AddIceCreamToMenu(3, "blackcurrent", "blackcurrent", true, 8d);
    	AddIceCreamToMenu(4, "blackforest", "chocalate", true, 9d);
    	
    	AddIceCreamToMenu(5, "plain vanilla", "vanilla  ", true, 3.5d);
    	AddIceCreamToMenu(6, "redroaster", "redvelvet", false, 4.99d);
    	AddIceCreamToMenu(7, "scotchribbon", "butterscotch", false, 2.25d);
    	AddIceCreamToMenu(8, "tendercoconut", "coconut  ", true, 3.55d);
    	AddIceCreamToMenu(9, "blueberrycookie", "blueberry", true, 9.99d);
    }
    
	@Override
	public IceCream[] getMenuItems(){
		return products;
    }
}
