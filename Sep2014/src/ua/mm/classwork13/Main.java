package ua.mm.classwork13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
//фигурки в абстракт
public class Main {
/*
	public void divVars(int a, int b) throws MyException{
		if (b==0){
			MyException ex= new MyException();
			throw ex;
		}
		else System.out.println(a/b);
	}

	public static void main(String[] args) {

		Main c = new Main();
		
		try{
			c.divVars(10, 0);
		}
		catch (MyException e){
			e.someException();
		
		//int a = 10;
		//int b = 0;
		int a[]={0,4,5,5};
		
		try{
		System.out.println(a[1]/a[2]);
		a[4]=4;
		}
		catch(ArithmeticException e){
			System.out.println("ZERO");
			}
			catch (ArrayIndexOutOfBoundsException e){
				System.out.println("OOB");
		
		
		}
	}
}*/
	
	
	
	
	
	public static void main (String [] args){
	
	/*ArrayList d = new ArrayList();
	System.out.println(d.isEmpty());
	d.add(71);
	d.add(new Boolean("true"));
	d.add("Java");
	System.out.println(d.size());
	System.out.println(d.isEmpty());
	for(Object ob:d)System.out.println("list="+ob);
	System.out.println(d.get(2));
	System.out.println(d.indexOf(71));*/
		
		
		
		
		/*LinkedList d = new LinkedList();
		d.add("15");
		d.add(75);
		d.add("Java");
		d.add("Java");
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
		d.add(1, "sd");
		for (Object ob: d)System.out.println(ob);
		d.remove("Java");
		System.out.println(Arrays.toString(d.toArray()));
		d.clear();*/
		
		
		HashMap d = new HashMap();
		for (int i=11; i<15; i++)
			d.put(i, i+"J");
			System.out.println(d);
			d.put(11, "Java");
			System.out.println(d);
		
		
}
}