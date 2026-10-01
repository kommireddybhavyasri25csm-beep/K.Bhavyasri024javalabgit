interface I{
 void m();
int a=10;
}
abstract class B implements I
{
      void m1()
	{
	System.out.println("HELLO");
	}
	}
class C extends B
{
     public void m()
	 {
	 System.out.println("HI");
	 }
	 }
class test{
	public static void main(String[]args)
	{
     C c= new C();
	 System.out.println(c.a);
	 c.m();
	 c.m1();
	 }
	 }
	 
	 