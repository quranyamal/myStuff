class GPoint<T>{
    private T x;
    private T y;

    public GPoint() { x=null; y=null;}
    public T GetAbsis() { return x; }
    public T GetOrdinat() { return y; }
    public void SetAbsis(T newx) { x = newx; }
    public void SetOrdinat(T newy) { y = newy; }
    public int IsEqual(GPoint P) {
        if (x==P.x && y==P.y) return 1;
        else return 0;
    }
}