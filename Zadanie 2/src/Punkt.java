
	public class Punkty {
	     int x;
	     int y;
	 
	     public Punkty(){ }
	 
	     public Punkty(int a, int b){
	         x = a;
	         y = b;
	     }
	 
	     public Punkty(Punkty pkt){
	         x = pkt.x;
	         y = pkt.y;
	     }
	 
	public static void main(String[] args) {
		Punkt punkt1 = new Punkt(10, 15);
 		System.out.println("Wspó³rzêdne 1 to: ");
 		System.out.println("x1: "+punkty1.x);
 		System.out.println("y2: "+punkty1.y);
 
 		Punkt punkt2 = new Punkty(punkt1);
 		System.out.println("Wspó³rzêdne 2 to: ");
 		System.out.println("x2: "+punkty2.x*2);
 		System.out.println("y2: "+punkty2.y*2);
	}}


