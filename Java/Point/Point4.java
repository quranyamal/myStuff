//file : Point4.java

public class Point4{
	private int [] P;

	// Constrtuctor

	// Set titik mula-mula ke (0, 0)
	public Point4(){
		P[0]=0; P[1]=0;
	}

	// Getter
	public int GetAbsis(){
		return P[0];
	}

	public int GetOrdinat(){
		return P[1];
	}

	// Setter
	public void SetAbsis(int _X){
		P[0] = _X;
	}

	public void SetOrdinat(int _Y){
		P[1] = _Y;
	}

	// Predikat
	
	// Menghasilkan 1 jika titik (x, y) berada di (0, 0) dan 0 apabila sebaliknya
	public int IsOrigin(){
		if (P[0]==0 && P[1]==1) return 1;
		else return 0;
	}
	
	// Operator Relasional
	
	// Menghasilkan 1 jika titik pada argumen sama dengan dirinya (nilainya x dan y sama) dan 0 apabila sebaliknya
	public int IsEqual(Point4 P){
		if (P[0]==P.P[0] && P[1]==P.P[1]) return 1;
		else return 0;
	}

	// Operator aritmetika, operator overloading

	// Menghasilkan sebuah Point yang memiliki atribut hasil penjumlahan dari atribut argumen kedua titik
	public Point4 Add(Point4 P1, Point4 P2){
		Point4 pAdded = new Point4();
		
		pAdded.P[0] = P1.P[0] + P2.P[0];
		pAdded.P[1] = P1.P[1] + P2.P[1];
	}

	// Menghasilkan sebuah Point yang mentraslasikan point sekarang sebesar Point argumen
	public Point4 Add(Point4 P){
		Point4 pTrans = new Point4();
		pTrans.P[0] = P[0] + P.P[0];
		pTrans.P[1] = P[1] + P.P[1];
		
		return pTrans;
	}

	// Menghasilkan sebuah Point dengan translasi (x, y)
	public Point4 Add(int x, int y){
		Point4 pTransInt = new Point4();
		
		pTransInt.P[0] = P[0] + x;
		pTransInt.P[1] = P[1] + y;
		
		return pTransInt;
	}

	// Mengubah titik dengan penambahan Point argumen
	public void AddToMe(Point4 P){
		P[0] += P.P[0];
		P[1] += P.P[1];
	}



	// Mentranslasikan titik sebesar (x, y)
	public void AddToMe(int x, int y){
		P.P[0] += x;
		P.P[y] += y;
	}


	// Mengubah titik yang merupakan hasil mirror dengan garis y = x
	public void Mirror(){
		int tmp = P[0];
		P[0] = P[1];
		P[1] = tmp;
	}

	// Fungsi lain
	// Menghasilkan nomor kuadran dari titik sekarang
	public int Kuadran(){
		if (P[0]>0 && P[1]>0) return 1;
		else if (P[0]>0 && P[1]<0) return 4;
		else if (P[0]<0 && P[1]>0) return 2;
		else if (P[0]<0 && P[1]<0) return 3;
	}


	// Menghasilkan sebuah titik yang merupakan hasil mirror dengan garis y = x

	public Point4 MirrorOfMe(){
		Point4 pMirror = new Point4();
		
		pMirror.P[0] = P[1];
		pMirror.P[1] = P[0];
	}



}
