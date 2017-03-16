package testOfControl;

public class printPrimeNumber {
	public static void main(String args[]){
//		boolean primeflag=true;
		for(int i=1;i<=100;i++){
			boolean primeflag=true;
			for(int j=1;j<=i;j++){
//				System.out.println(i+","+j);
				if(i%j==0&&j!=1&&j!=i)
				{
//					System.out.println("this is not a prime:"+i);
					primeflag=false;
				}
			}
			if(primeflag){
				System.out.println("this is a prime:"+i);
			}
		}
	}
}
