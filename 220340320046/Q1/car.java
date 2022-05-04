class car{
	private int year ;
	private String make;
	private double Speed;
	car(int year, String make, double Speed ){
	this.year=year;
	this.make=make;
	this.Speed=Speed;
	}
	public int getYear(){
		return this.year;
	}
	public String getMake(){
		return this.make;
	}
	public double getSpeed(){
		return this.Speed;
	}
	public void accelerate(){
		this.Speed+=1;
	}
}