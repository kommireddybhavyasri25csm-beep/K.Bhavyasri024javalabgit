class A
{
	static int m=90;
	int i;
	int j;
	A(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
}
class oop9
{
    public static void main(String[] args)
	{
		A a=new A(10,20);
		A a1=new A(30,40);
		A a2=new A(50,60);
		System.out.println(a1.i);
		System.out.println(a2.j);
		System.out.println(a2.m);
    }
}	
		