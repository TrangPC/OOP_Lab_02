import java.util.*;
public class Cart {
public static final int MAX_NUMBERS_ORDERED=20;
private DigitalVideoDisc itemsOrdered[]= new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
private DigitalVideoDisc qtyOrdered;


public void setQtyOrdered(DigitalVideoDisc qtyOrdered) {
	this.qtyOrdered = qtyOrdered;
}

public DigitalVideoDisc getQtyOrdered() {
	return qtyOrdered;
}

public void addDigitalVideoDisc(DigitalVideoDisc disc)
{
	if (qtyOrdered <= MAX_NUMBERS_ORDERED)
	{
		itemsOrdered.add(disc);
		qtyOrdered++;
		System.out.println("Add "+ disc.getTitle() +" successfully");
	}
	else 
		System.out.println("Cart is full. Can't add "+ disc.getTitle + " into");
	}
public void removeDigitalVideoDisc(DigitalVideoDisc disc)
{
	if(!(itemsOrdered.contains(disc))) 
		System.out.println(disc.getTitle()+" doesn't exit");
	else {
		itemsOrdered.remove(disc);
		qtyOrdered--;
		System.out.println("Remove "+ disc.getTitle() + "successfully");
	}
	}
// sort by title
public boolean titleComp(DigitalVideoDisc disc1, DigitalVideoDisc disc 2)
{
	if (disc1.getTitle().compareTo(disc2.getTitle()< 0 )
		return true;
	return false;
	}
public void sortByTitle()
{
	itemsOrdered.sort(titleComp);
	}

//sort by category
public boolean categoryComp(DigitalVideoDisc disc1, DigitalVideoDisc disc 2)
{
	if (disc1.getCategory().compareTo(disc2.getCategory()< 0 )
		return true;
	return false;
	}
public void sortByCategory()
{
	itemsOrdered.sort(categoryComp);
	}
// sort by price
public boolean costComp(DigitalVideoDisc disc1, DigitalVideoDisc disc 2)
{
	if (disc1.getCost().compareTo(disc2.getCost()< 0 )
		return true;
	return false;
	}
public void sortByCost()
{
	itemsOrdered.sort(costComp);
	dislayCart()
	}

public double totalCost()
{
	double sum=0;
	for(DigitalVideoDisc i:itemsOrdered)
		sum += i.getCost();
	return sum;
	}
public void displayCart() {
	for(DigitalVideoDisc i : itemsOrdered )
		System.out.println("Title: "+i.getTitle() +"\tCategory: "+i.getCategory()+ "\tDirector: "+ i.getDirector()+ "\tLength: "+i.getLength()+"\tCost: "+ i.getCost() );
	
}
}
