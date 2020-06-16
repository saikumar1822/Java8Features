package stream;
@FunctionalInterface
interface interf12{
	public void m1();
}

interface interf1{
	public void m1(int a,int b);
}


class Demo implements interf12{

	@Override
	public void m1() {
		System.out.println("wellcome to functional interface");
	}
	
}
public class FunctionalInterfaceExample {
	public static void main(String ... args) {
		Demo d=new Demo();
		d.m1();
		
		interf12 i=()->System.out.println("welcome to demo");
		i.m1();
		interf1 i1=(a,b)->System.out.println(a+b);
		i1.m1(10, 20);
	}

}
