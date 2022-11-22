package Test;

public class euclidsgcd {
    static int gcd(int a,int b) {
    	if(a==0) return b;
    	else return gcd((b%a),a);
    }
    public static void main(String[] args) {
    	int a=1;
    	int b=510;
    	System.out.println(gcd(a,b));
    }
}
