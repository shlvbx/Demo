package cn.com.pojo;



import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Person {

	private int age;
	private String username;
	/*{
		System.out.println("构造代码块");
		
	}
	static{
		System.out.println("静态代码块");
	}
	
	public Person(){
		System.out.println("构造方法");
	}*/
}
