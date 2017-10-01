package cn.com;

public class Demo4 {
	
	public static void main(String[] args) {
		
		/*StringBuilder x=new StringBuilder("A");
		StringBuilder y=new StringBuilder("B");
		opreator(x,y);
		System.out.println(x+"  "+y);*/
		int m=10;
		int n=3;
		add(m,n);
		System.out.println(m+" "+n);
	}

	private static void add(int m, int n) {
		m=m-n;
		n=m;
		System.out.println(m+" "+n);
	}

	private static void opreator(StringBuilder x, StringBuilder y) {
		x.append(y);
		y=x;
		System.out.println("2 :"+x+"  "+y);
	}
}
