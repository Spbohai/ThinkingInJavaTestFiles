package testOfControl;

public class generateRandomNums {
	public static void main(String args[]){
		double[] randNums=new double[25];
		for(int i=0;i<=24;i++){
			randNums[i]=Math.random();
			System.out.println(randNums[i]);
			
		}
		int[] randInts=new int[25];
		for(int i=0;i<=23;i++){
			if(randNums[i]>randNums[i+1])
				randInts[i]=1;
			else if(randNums[i]==randNums[i+1])
				randInts[i]=0;
			else
				randInts[i]=-1;
		}
		randInts[24]=(int)randNums[24];
		for(int i=0;i<=24;i++){
			System.out.println(randInts[i]);
		}
		
	}
}
