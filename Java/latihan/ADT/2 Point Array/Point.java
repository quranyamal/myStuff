class Point{
	private int[] p;

	public Point(){
		p = new int[2];
		p[0]=0; p[1]=0;
	}


	public int getAbsis() { return p[0]; }
	public int getOrdinat() { return p[1]; }
	public void setAbsis(int _x) { p[0] = _x; }
	public void setOrdinat(int _y) { p[1] = _y; }

	public int isOrigin() { 
		if(p[0]==0 && p[1]==0) return 1;
		else return 0;
	}
	public int isEqual(Point P){
		if (p[0]==P.p[0] && p[1]==P.p[1]) return 1;
		else return 0;
	}
	public Point add(Point p1, Point p2){
		Point PHasil = new Point();
		PHasil.p[0] = p1.p[0] + p2.p[0];
		PHasil.p[1] = p1.p[1] + p2.p[1];
		return PHasil;
	}
	public Point add(Point o){
		o.p[0] += p[0];
		o.p[1] += p[1];
		return o;
	}
	public Point add(int x, int y){
		Point PHasil = new Point();
		PHasil.p[0] = x + this.p[0];
		PHasil.p[1] = y + this.p[1];
		return PHasil;
	}

	public void addToMe(Point P){
		p[0] += P.p[0];
		p[1] += P.p[1];
	}
	public void addToMe(int x, int y){
		p[0] += x;
		p[1] += y;
	}
	public void mirror(){
		int tmp = p[0];
		p[0] = p[1];
		p[1] = tmp;
	}
	public int kuadran(){
		if (p[0]==0 || p[1]==0)
			return 0;
		else{
			if (p[1]>0){
				if (p[0]>0) return 1;
				else return 2; 
			} else{
				if (p[0]<0) return 3;
				else return 4;
			}
		}
	}
	public Point mirrorOfMe(){
		Point PMirror = new Point();
		PMirror.p[0] = p[1];
		PMirror.p[1] = p[0];
		return PMirror;
	}
	public void print(){
		System.out.println("(" + p[0] + "," + p[1] + ")");
	}
}