package cn.com;

public class Demo2 {
	
	public static Demo2 test =new Demo2();
	public static int a=1;
	public Demo2(){
		a=2;
	}
	public static void main(String[] args) {
	
		System.out.println(test.a);
		a=3;
		System.out.println(test.a);
		Demo2 t=new Demo2();
		System.out.println(test.a);
	}
}
