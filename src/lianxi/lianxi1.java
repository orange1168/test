package lianxi;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.google.gson.Gson;


public class lianxi1 {
	
public static void main(String[] args) {
	List nums=new ArrayList();
	for(int i=0;i<5;i++) {
		nums.add(new Random().nextInt(10));
	}
	Collections.sort(nums);
	for(Object i:nums) {
		System.out.print(i+" ");
	}
	/*People people=new People("С��", "��");
	ArrayList<String> books=new ArrayList<>();
	books.add("��ѧ");
	books.add("����");
	people.books=books;
	Gson gson=new Gson();
	String pString=gson.toJson(people);
	System.out.println(pString);
	
	People p2=gson.fromJson(pString, People.class);
	System.out.println(p2.getName());*/
}
}
class Dog{
	
	void eat() {
		System.out.println("����Է���");
	}
	
}


