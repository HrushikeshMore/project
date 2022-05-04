import java.util.*;

class ArrayListDemo{
public static void main(String[] args){
	ArrayList<Item> list =new ArrayList<>();
	Item l1=new Item(3,"tyre");
	Item l2=new Item(2,"wheel");
	Item l3=new Item(1,"oil");
	
	list.add(l1);
	list.add(l2);
	list.add(l3);
	Collections.sort(list);
	System.out.println(list);
	NameSort na=new NameSort();
	Collections.sort(list ,na);
	System.out.println(list);
	Item l4=new Item(3,"tyre");
	
	if(l4.equals(l3)||l4.equals(l2)||l4.equals(l1))
	{
		;
	}
	else{
		list.add(l4);
	}
	System.out.println(list);
}
}