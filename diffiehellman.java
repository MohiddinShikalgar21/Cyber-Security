package Test;

public class diffiehellman {
	private static long power(long a, long b, long p)
	{
		if (b == 1)
			return a;
		else
			return (((long)Math.pow(a, b)) % p);
	}
	public static void main(String[] args)
	{
		long P, G, x, a, y, b, ka, kb;
		P = 23;
		System.out.println("The value of P:" + P);
		G = 9;
		System.out.println("The value of G:" + G);
		a = 4;
		System.out.println("The private key a for A:" + a);
		x = power(G, a, P);
		b = 3;
		System.out.println("The private key b for B:" + b);
		y = power(G, b, P);
		ka = power(y, a, P); 
		kb = power(x, b, P); 
		
		System.out.println("Secret key for the A is:" + ka);
		System.out.println("Secret key for the B is:" + kb);
	}
	}


/*

Step 1: Alice and Bob get public numbers P = 23, G = 9

Step 2: Alice selected a private key a = 4 and
        Bob selected a private key b = 3

Step 3: Alice and Bob compute public values
Alice:    x =(9^4 mod 23) = (6561 mod 23) = 6
        Bob:    y = (9^3 mod 23) = (729 mod 23)  = 16

Step 4: Alice and Bob exchange public numbers

Step 5: Alice receives public key y =16 and
        Bob receives public key x = 6

Step 6: Alice and Bob compute symmetric keys
        Alice:  ka = y^a mod p = 65536 mod 23 = 9
        Bob:    kb = x^b mod p = 216 mod 23 = 9

Step 7: 9 is the shared secret.

*/