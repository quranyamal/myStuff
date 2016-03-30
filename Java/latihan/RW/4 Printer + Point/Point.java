class Point{
	private int x, y;
	public Point(){
		x=0; y=0;
	}
	public int getAbsis(){
		return x;
	}
	public int getOrdinat(){
		return y;
	}
	public void setAbsis(int _x){
		x = _x;
	}
	public void setOrdinat(int _y){
		y = _y;
	}
	public void print(){
		Printer.print(x);
		Printer.print(y);
	}
}