package cn.com;

import java.util.Collection;
import java.util.LinkedList;

import com.sun.javafx.collections.MappingChange.Map;

public class Demo5 {
	private static Demo5 demo=null;
	
	private Demo5() {}
	public  static synchronized Demo5 get() {
		if(demo==null) {
			demo=new Demo5();
		}
			Collection c;
		String s;
		LinkedList l;
		StringBuilder sb;
		return demo;
				
	}
}
