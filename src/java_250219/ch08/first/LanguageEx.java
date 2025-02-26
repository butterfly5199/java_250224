package java_250219.ch08.first;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class LanguageEx {

	public static void main(String[] args) {
		
//		ArrayList<String> friends = new ArrayList<>();
		List<String> friends = new ArrayList<>();
//		List<String> friends = new Vector<>(); 
		
		System.out.println("test.size(): " + friends.size()); //collection을 쓸 때는 보통 '복수형'을 쓴다.
		
		friends.add("Tony");
		friends.add("Tiffany");
		friends.add("Jeniffer");
		friends.add("John");
		friends.add("Tom");
		friends.add("Andrew");
		friends.add("Tiger");
		friends.add("Selly");
		
//		test.remove("Selly");
		
		System.out.println("test.size(): " + friends.size());
		System.out.println("==================");
		
		for(int i=0; i<friends.size();i++) {
			System.out.println("test.get[i]: " + friends.get[i]);
		}
		
		//test.remove(0);
		
		System.out.println("==================");
		
		
		for(String friend: friends) {  
	   //for(String '단수변수명': collection) {   ==> * 향상된 for문에서 관례적인 작성법 *
			System.out.println("a: " + friend);
		}
		
//		System.out.println(test);
		
//		test.remove(0);
//		test.remove(0);
//		test.remove(0);
//		test.remove(0);
//		test.remove(0);
//		test.remove(0);
//		test.remove(0);
//		
//		System.out.println("test.size(): " + test.size());		

	}
	
	
}
