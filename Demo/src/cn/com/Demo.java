package cn.com;

public class Demo {
	static boolean foo(char c){
		System.out.println(c);
		return true;
	}
	public static void change(String str){
		str="1111";
	}
	public static void main(String[] args) {
		/*int i=0;
		for(foo('A');foo('B')&&i<2;foo('C')){
			i++;
			foo('D');
		}*/
		
		String str="22222";
		change(str);
		System.out.println(str);
	}

}
