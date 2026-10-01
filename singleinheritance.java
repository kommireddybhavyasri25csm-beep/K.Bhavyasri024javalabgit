class A
{
	void m1()
	{
		System.out.println("A");
	}

	int i=10;
}
class B extends A
{
	void m2()
	{
		System.out.println("B");
	}
}
class test
{
	public static void main(String[]args)
	{
		B b=new B();
		System.out.println(b.i);
		b.m1();
		b.m2();
	}
}