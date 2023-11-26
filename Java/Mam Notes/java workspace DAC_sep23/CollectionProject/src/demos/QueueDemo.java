package demos;
import java.util.*;
public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> words = new PriorityQueue<>();
		words.add("welcome");
		words.add("hi");
		words.add("object");
		words.add("html");
		words.add("jquery");
		words.add("bootstrap");
		words.add("css");
		words.add("ajax");
		words.add("nodejs");
		words.add("expressjs");
		words.add("reactjs");
		words.add("javascript");
		String str="";
		
		
		for(String s : words)
			System.out.println(s);
		
		System.out.println("***************");
		System.out.println("Size : "+words.size());
		//words.pe
		while(words.size() > 0)
		{
			System.out.println(words.poll()+" : "+words.size());
		}
				
		

	}

}
