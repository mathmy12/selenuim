package while_loop;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		int count =0;
		while(i<=n/2) {
			if (n%i==0) {
			count++;
			}
			i++;
		if (count==1) {
			System.out.println("The prime no is :"+n);
		}
		else 
			System.out.println("this is not a prime no");
			}
			}
		}
	
