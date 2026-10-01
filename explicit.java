class implicit
{
 public static void main(String[]arg)
 {
 byte b1=10;
 byte b2=20;
 long i=(byte)(short)(int)(double)(b1+b2);
System.out.println(i);
}
} 