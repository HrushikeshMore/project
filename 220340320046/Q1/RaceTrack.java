class RaceTrack{
	public static void main(String[] args){
		car c=new car(2022,"Tata",250.0d);
		System.out.println(c.getYear());
		System.out.println(c.getMake());
		System.out.println(c.getSpeed());
		c.accelerate();
		System.out.println(c.getSpeed());
}
}