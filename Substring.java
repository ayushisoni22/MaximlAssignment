import java.util.Scanner;
public class Substring
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String S = sc.nextLine();
	    String result ="";
	    
	    for(int i=0;i<S.length();i++){
	      if(S.charAt(i)>='a' && S.charAt(i)<='z'){
	         if(result.indexOf(S.charAt(i))==-1){
	           result += S.charAt(i);
	         }
	      }
	    }
		 
	    System.out.println(result.length());
	}
}
