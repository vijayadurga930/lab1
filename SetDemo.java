package Labwork;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		//HashSet<String> set =new HashSet<String>();//
		//LinkedHashSet<String> set =new LinkedHashSet<String>;//
		TreeSet<String> set=new TreeSet<>(); //sorted(ascending)//duplicate not taken 
		 set.add("java");
		 set.add(" spring");
		 set.add(" jee");
		 set.add(" angular");
		 set.add("html");
		 set.add(" spring");
		// set.add("null");
		 System.out.println(set);
	}

}
