class MainPoint{
	public static void main(String[] args){
		Point P1 = new Point();
		Point P2 = new Point();
		
		System.out.print("P1 = ");
		P1.print();
		System.out.println("isOrigin P1 = " + P1.isOrigin());
		
		P1.setAbsis(3);
		P1.setOrdinat(4);
		System.out.print("P1 = ");
		P1.print();
		System.out.println("isOrigin P1 = " + P1.isOrigin());
	}
}