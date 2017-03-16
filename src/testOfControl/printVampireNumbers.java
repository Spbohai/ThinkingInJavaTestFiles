package testOfControl;

public class printVampireNumbers {
	
	static int comTwoNum(int a,int b){
		return  a*10+b;
	}
	
	static int[] comTwoArray(int m[],int n[]){
		int count=m.length+n.length;
		int comArray[]=new int[count];
		for(int i=0;i<m.length;i++){
			comArray[i]=m[i];
		}
		for(int j=0;j<n.length;j++){
			comArray[j+m.length]=n[j];
		}
		return comArray;
	}
	static int[] decomNum4(int m){
		int ListNum[]=new int[4];
		int flag=0;
		while(m!=0){
			ListNum[flag]=m%10;
			m=m/10;
			flag++;
		}
		return ListNum;
		
	}
	static int[] decomNum2(int m){
		int ListNum[]=new int[2];
		ListNum[0]=m%10;
		ListNum[1]=m/10;
		return ListNum;
	}
	
	public static int[] sortNums(int m[]){
		for(int i=0;i<m.length-1;i++){
			for(int j=i+1;j<m.length;j++){
				if(m[i]>m[j]){
					int temp=m[i];
					m[i]=m[j];
					m[j]=temp;
				}
			}
		}
		return m;
	}
	public static boolean equalArray(int m[],int n[]){
		if(m.length!=n.length){
			return false;
		}
		else
		{
			for(int i=0;i<m.length;i++){
				if(m[i]!=n[i]){
					return false;
				}
			}
			return true;
		}
		
	}
	public static void printNums(int m[]){
		for(int i=0;i<m.length;i++){
			System.out.println(m[i]);
		}
	}
	public static int[] extractVampireArray(int m[],int n){
		int[] extNum=new int[n];
		int tt=0;
		for(int i=0;i<m.length;i++){
			if(m[i]!=0){
				extNum[tt]=m[i];
				i++;
				tt++;
			}
		}
		return extNum;
		
	}
	
	
	public static void main(String args[]){
		int[] num0=new int[4];
		int[] num1=new int[2];
		int[] num2=new int[2];
		int[] num3=new int[4];
		int countVampire=0;
		int[] vampireNum=new int[100];
		for(int i=10;i<=99;i++)
		{
			for(int j=i+1;j<=99;j++)
			{
				if(i*j>=1001&&i*j<=9999&&((i*j)%100!=0))
				{
//					int com1=i*j;
					num0=decomNum4(i*j);
					num1=decomNum2(i);
					num2=decomNum2(j);
//					printNums(num1);
//					printNums(num2);
					num3=comTwoArray(num1,num2);
					sortNums(num0);
					sortNums(num3);
//					printNums(num0);
//					printNums(num3);
					if(equalArray(num0,num3)){
						System.out.println("this is a Vampire number:"+i*j);
						System.out.println(i+"*"+j+"="+i*j);
						countVampire++;
						vampireNum[countVampire]=i*j;
					}
				}
			}
		}
//	
			
		System.out.println("the count of Vampire Number is:"+countVampire);
//		sortNums(vampireNum);
////		printNums(vampireNum);
//		int []extractVam=new int[countVampire/2];
//		extractVam=extractVampireArray(vampireNum,countVampire/2);
//		printNums(extractVam);
		
	}
}
