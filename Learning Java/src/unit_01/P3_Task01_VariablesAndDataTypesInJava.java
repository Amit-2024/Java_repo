 
package unit_01;
/*
 * types of variables 
 * -- There are 3 types of variables.
 *  local variable - declared inside the body of a method
 *  
 *  Instance variable - instance variable are defined without the ' Static ' Keyword.
 *  - They are defined outside a method declaration.
 *  - They are object specific and are known as instance variable.
 *  
 *  Static Variable - 
 *  - static variable are defined with the Static keyword
 *  - static variable are initialized only once, at the start of
 the program execution.
 *  - these static variable should be initialized first, before the initialization of any;
 */


public class P3_Task01_VariablesAndDataTypesInJava {
	
	static int x=6;
	int y=5;
	
	public void AccessThroughAnotherPackage()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		
		int a,b,c;			//declaration of variables in java
		float x;
		double d;
		char z;
		
		// initialization of variables
		
		a = 9;
		x = 0.55f;
		d = 90.43333;
		z = 'd';
		
		System.out.println(a);
		System.out.println(x);
		System.out.println(d);
		System.out.println(z);
		
		// Java Variable type conversion & type casting
		
		double n;
		int q=20;		//double to integer type casting
		n=q;
		
		
		double dd=5;
		int j;
		j=(int )dd;			// double to integer type casting
		
		System.out.println(n);
		System.out.println(q);
		System.out.println(dd);
		System.out.println(j);
		
		byte k=5;	//1 byte
		boolean l = true ;		// true & false only(1 bit)
		long m = 4L;
		float s = 1.2f;
		double o = 1.34d;
		
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println(s);
		System.out.println(o);
		
		System.out.println(A.k);		// data + functions/method
		//A.display();
		A obj1 = new A();
		System.out.println(obj1.i++);
		System.out.println(obj1.i);
		
		A obj2 = new A();
		System.out.println(obj2.i);
		
		System.out.println(A.k++);
		System.out.println(A.k);
		
		A.typeConversionAndTypeCasting();
	}
	
	int w=4;
	
	void display()
	{
		int x=5;
		System.out.println(" Display method ");
	}

}

class A
{
	static int k=20;
	int i=5;
	
	static void display()
	{
		int a=5;
		
		System.out.println("Display method inside class A");
		System.out.println(a);
	}
	
	
	static void typeConversionAndTypeCasting()
	{
		/*double f; 8 bytes = 64bits/slots int i=10 4 bytes=32 bits/slots f=i ; // TypeConversion System.out.println(f);
		 * 
		 * double g=10 ; 64 int j; 32 j=(int g) ; 
		 * 
		 * */
		
		double f ; //64 slots
		int i=10 ; //32 slots
		f=i ; //type conversions
		System.out.println(f);
		
		double g=10 ; //64 slots
		int j ; //32
		j=(int) g ; //Type Casting
		
		//32 bits = 64 bits
		
		System.out.println(i);
		System.out.println(j);
	}
}