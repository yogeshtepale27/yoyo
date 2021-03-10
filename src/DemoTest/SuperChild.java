package DemoTest;

public class SuperChild  extends SuperKey{

	int a=30;
	int b=40;
	void m1(int a,int b) {
		System.out.println(a+b);//local variable
		System.out.println(this.a+this.b);//current class variable addition
		System.out.println(super.a+super.b);//super class variable addition
	}
	
	public static void main(String[] args) {
		new SuperChild().m1(1000,2000);
		

	}

}
