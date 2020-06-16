package stream;
class Demo1{

public static void m1() {
	for (int i = 0; i < 10; i++) {
		System.out.println("static child thread");
	}
}

public  void m2() {
	for (int i = 0; i < 10; i++) {
		System.out.println("instace thread");
	}
}

}
public class MethodRefernce {

public static void main(String[] args) {
	Demo1 d=new Demo1();
	Runnable r2=d::m2;
	Runnable r1=Demo1::m1;
	Thread t = new Thread(r1);
	Thread t2 = new Thread(r2);
	
	t.start();
	t2.start();
	for (int i = 0; i < 10; i++) {
		System.out.println("main thread");
	}

}
}


