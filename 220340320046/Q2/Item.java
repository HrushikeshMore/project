class Item implements Comparable<Item>{
private Integer itemId;
private String itemName;
	Item(Integer itemId,String itemName){
	 this.itemId=itemId;
	 this.itemName=itemName;

	}
	public int getitemId(){
		return this.itemId;
	}
	public String getitemName(){
		return this.itemName;
	}
	public void setitemId(Integer itemId){
		 this.itemId=itemId;
	}
	public void setitemName(String itemName){
		this.itemName=itemName;
	}
	@Override
	public String toString(){
		return this.itemId+" " +this.itemName;
	}
	@Override 
	public int hashCode(){
		int prime=17;
		prime=prime+prime*this.itemId.hashCode();
		prime=prime+prime*this.itemName.hashCode();
		return prime;
	}
	@Override
	public boolean equals(Object o){
		
		if(o instanceof Item){
			Item obi=(Item)o;
				if(this.itemId.equals(obi.itemId)&&
				this.itemName.equals(obi.itemName))
				{return true;}
				else
				{return false;}
		
		}	
		else
		{return false;}
		
	}
	
	public int compareTo(Item e){
		return this.itemId.compareTo(e.itemId);
	}
	
	
}	
