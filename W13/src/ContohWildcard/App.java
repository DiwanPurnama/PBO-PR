/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContohWildcard;
import java.util.ArrayList;

/**
 *
 * @author Windows 10
 */
public class App {
    public static void main(String[] args) {
		
		ArrayList<Machine> list1 = new ArrayList<Machine>();
		
		list1.add(new Machine());
		list1.add(new Machine());
		
		ArrayList<Camera> list2 = new ArrayList<Camera>();
		
		list2.add(new Camera());
		list2.add(new Camera());
		
		
		showList(list1);
		showList1(list2);
		showList2(list2);
		
		showList1(list1);
		showList2(list1);
		
		showList4(list2);
		
	}
		
	
////USING WILDCARDS//////
			
public static void showList(ArrayList<? extends Machine> list){
	
	for(Machine value: list){
		System.out.println(value);
		value.start();
		//can't access Camera methods but only Machine's
		//value.snap();
	}
	
}


public static void showList4(ArrayList<? extends Camera> list){
	
	for(Camera value: list){
		System.out.println(value);
		//can access both Machine and Camera methods.
		value.start();
		value.snap();
	}
	
}


public static void showList1(ArrayList<?> list){
	
	for(Object value: list){
		System.out.println(value);
		//can't access specific Object methods
		//value.start();
	}
	
}


public static void showList2(ArrayList<? super Camera> list){
	
	for(Object value: list){
		System.out.println(value);
		//can't access Object methods
		//value.snap();
		
	}
	
}
}
