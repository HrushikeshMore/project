import java.util.*;
class NameSort implements Comparator<Item>{
	public int compare(Item l1,Item l2){
		return l1.getitemName().compareTo(l2.getitemName());
	}
}