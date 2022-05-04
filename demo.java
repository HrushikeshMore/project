class demo{
	public static void main(String... args){
		String s="A";
		String s1="A";
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		String a=new String("A,1000");
		String a1=new String("A,1000");
		System.out.println(a==a1);
		System.out.println(a.equals(a1));
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a.hashCode());
		System.out.println(a1.hashCode());
		
		
	}
}