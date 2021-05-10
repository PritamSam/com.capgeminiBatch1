package com.capgemini.AnnonymousClass;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Greet g = new Greet() {
@Override
public void wish (String n) {
	System.out.println("Hello"+n);
}
};

g.wish("Pritam");
System.out.println("-------");
g.wish("Nishant");
	}

}
interface Greet{
	void wish(String n);
}
