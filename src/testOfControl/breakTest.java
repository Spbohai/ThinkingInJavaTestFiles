package testOfControl;

public class breakTest {
	public static void main(String args[]){
		for(int i=1;i<=100;i++){
			if(i==99){
				return;
			}
			System.out.println(i);
		}
		
	}
}
