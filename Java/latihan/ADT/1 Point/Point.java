class Point{
	private int x,y;
	public Point(){
		x=0; y=0;
	}
	public int getAbsis() { return x; }
	public int getOrdinat() { return y; }
	public void setAbsis(int _x) { x = _x; }
	public void setOrdinat(int _y) { y = _y; }

	public int isOrigin() { 
		if(x==0 && y==0) return 1;
		else return 0;
	}
	public int isEqual(Point P){
		if (x==P.x && y==P.y) return 1;
		else return 0;
	}
	public Point add(Point p1, Point p2){
		Point PHasil = new Point();
		PHasil.x = p1.x + p2.x;
		PHasil.y = p1.y + p2.y;
		return PHasil;
	}
	public Point add(Point o){
		o.x += x;
		o.y += y;
		return o;
	}
	public Point add(int x, int y){
		Point PHasil = new Point();
		PHasil.x = x + this.x;
		PHasil.y = y + this.y;
		return PHasil;
	}
	public void addToMe(Point P){
		x += P.x;
		y += P.y;
	}
	public void addToMe(int x, int y){
		this.x += x;
		this.y += y;
	}
	public void mirror(){
		int tmp = x;
		x = y;
		y = tmp;
	}
	public int kuadran(){
		if (x==0 || y==0)
			return 0;
		else{
			if (y>0){
				if (x>0) return 1;
				else return 2; 
			} else{
				if (x<0) return 3;
				else return 4;
			}
		}
	}
	public Point mirrorOfMe(){
		Point PMirror = new Point();
		PMirror.x = y;
		PMirror.y = x;
		return PMirror;
	}
	public void print(){
		System.out.println("(" + x + "," + y + ")");
	}
}