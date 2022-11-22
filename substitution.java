package Test;
import java.nio.charset.Charset;
import java.util.*;
import java.util.HashMap;
public class substitution {
	static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
    	HashMap<Character,Character> map= new HashMap<>();
    	String s= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	//System.out.println("Enter the 26 character key:");
    	//String key= sc.nextLine();
    	String key= "QWERTYUIOPMNBVCXZASDFGHJKL";
    	for(int i=0;i<26;i++) {
    		map.put(key.charAt(i),s.charAt(i));
    	}
    	System.out.println("Enter text");
    	String s1= sc.nextLine();
    	System.out.print("The Cipher Text for the above Plain Text is:  ");
    	for(int i=0;i<s1.length();i++) {
    		if(s1.charAt(i)==' ') System.out.print(" ");
    		else {
    		  char c= s1.charAt(i);
    		  char c1= map.get(c);
    		  System.out.print(c1);
    		}
    	}
    }
}