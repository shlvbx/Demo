package cn.com;

public class Demo3 {
	public static void myAbs(int a) throws MyException{
			if(a>0) throw new MyException();
		System.out.println(Math.abs(a));
	}
	public static void main(String[] args) {
		System.out.println(exceptionResult());
	}
	private static int exceptionResult(){
		try {
			myAbs(-5);
			myAbs(5);
			return 0;
		} catch (MyException e) {
			System.out.println("caught:"+e);
			return 5;
		}finally{
			System.out.println("finllay");
			return 5;
		}
			}
}
class MyException extends Exception{
	public String toString(){
		return "exception";
	}
}
