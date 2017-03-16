package testOfControl;

class ConstructDog{
	void bark(int a,String str){
		System.out.println(str+",Barking,"+a);
	}
	void bark(String str,int a){
		System.out.println(a+",howling,"+str);
	}
}
public class DogConstructTest {
	public static void main(String args[]){
	ConstructDog dog1=new ConstructDog();
	dog1.bark(3,"haha");
	dog1.bark("haha",3);
	}
	
}
