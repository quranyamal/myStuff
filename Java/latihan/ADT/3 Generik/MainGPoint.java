class MainGPoint{
	public static void main(String[] args){
		GPoint<Integer> pointOfInt1 = new GPoint();
		GPoint<Integer> pointOfInt2 = new GPoint();
		pointOfInt1.IsEqual(pointOfInt2);
		pointOfInt1.SetAbsis(5);
		pointOfInt1.IsEqual(pointOfInt2);
	}
}