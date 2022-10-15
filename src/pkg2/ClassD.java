package pkg2;

public class ClassD {

	public static void main(String[] args) {
		ClassA k=new ClassA();
		ClassB b = k.demo1();
		ClassC c = b.demo2();
		c.Maximize();
		c.Minimize();
		k.demo1().demo2().Maximize();  
		k.demo1().demo2().Minimize();
	}

}
