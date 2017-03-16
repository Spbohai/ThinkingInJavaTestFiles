package testOfControl;

public class LeafThisPassTest {
	int i=0;
	LeafThisPassTest increment(){
		i++;
		return this;
	}
	void print(){
		System.out.println("i="+i);
	}
	public static void main(String[] args){
		LeafThisPassTest leaf1=new LeafThisPassTest();
		leaf1.increment().increment().increment().print();		
		
	}
}