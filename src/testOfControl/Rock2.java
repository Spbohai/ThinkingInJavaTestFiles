package testOfControl;
class RockClass{
	RockClass(int i){
		System.out.println(i);
	}
}
public class Rock2 {
	public static void main(String args[]){
		for(int i=0;i<10;i++){
			new RockClass(i);
		}
	}

}
