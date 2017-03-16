package testOfControl;

class Lab{
	Lab(){
		System.out.println("I am a default construct");
	}
	Lab(String str){
		System.out.println("print the message:"+str);
	}
}
public class DefaultConstructorTest {
	public static void main(String args[]){
		Lab ant1=new Lab();
		Lab ant2=new Lab("ssd");
	}
}
