package testOfControl;

public class fibonacciFunction {
	public static void fibonacci(int n){
		int []fibonacci=new int[100];
	    fibonacci[0]=1;
	    fibonacci[1]=1;
		int sum=0;
		while(sum<n){
			System.out.println(fibonacci[sum]);
//			System.out.println(y);
			fibonacci[sum+2]=fibonacci[sum+1]+fibonacci[sum];
			
			sum+=1;
		}
	}
	public static void main(String args[]){
		fibonacci(5);
	}
}
