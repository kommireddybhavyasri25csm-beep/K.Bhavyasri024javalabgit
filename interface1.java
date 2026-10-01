interface I{
public abstract void m();
public static final int a=10;
}
class B implements I
{
    public void m()
	{
	System.out.println("HELLO");
	}
	}
class test{
	public static void main(String[]args)
	{
     I i= new B();
	 System.out.println(I.a);
	 System.out.println(i.a);
	 i.m();
	 }
	 }
	 
	 
	 