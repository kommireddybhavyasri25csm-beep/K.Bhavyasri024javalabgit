import java.io.*;
interface Employee
{
	String getName();
	double calculatepay();
	void display();
}
class RegularEmployee implements Employee
{
     String name;
     double basic;
     RegularEmployee(String name,double basic)
	 {
         this.name=name;
         this.basic=basic;
	 }
     public double calculatepay()
     {
          return basic+basic*0.1+basic*0.2+basic*0.05;
	 }
     public void display()
	 {
         System.out.println("Name:"+name+" pay:"+calculatepay());
	 }
     public String getName()
	 {
          return name;
	 }
}
class ContractEmployee implements Employee
{
     String name;
	 int month,pay;
     ContractEmployee(String name,int pay,int month)
	 {
         this.name=name;
         this.pay=pay;
		 this.month=month;
		 
	 }  
     public double calculatepay()
     {
          return  pay;
	 }
     public void display()
	 {
         System.out.println("Name:"+name+"Total pay:"+calculatepay());
	 }
     public String getName()
	 {
          return name;
	 }
}
class Vendor implements Employee
{
     String name;
	 int hrs,rate;
     Vendor(String name,int pay,int hrs)
	 {
         this.name=name;
         this.rate=rate;
		 this.hrs=hrs;
		 
	 }  
     public double calculatepay()
     {
          return  rate*hrs;
	 }
     public void display()
	 {
         System.out.println("Name:"+name+"Total pay:"+calculatepay());
	 }
     public String getName()
	 {
          return name;
	 }
}  	 
class Exp8
{
    public static void main(String[] args)
    {
        Console cs=System.console();
        String s=cs.readLine("Enter 1.RegularEmployee 2.ContractEmployee 3.Vendor:");
        int ch=Integer.parseInt(s);
        switch(ch)
        {
             case 1:			
     	          RegularEmployee r=new RegularEmployee("Abhi",20000);
				  r.display();
				  break;
	        case 2:
                 ContractEmployee c=new ContractEmployee("kavi",30000,8);
                 c.display();
                 break;	
            case 3:
                 Vendor v=new Vendor("sai",1000,8);
                 v.display();				 
		    default :		 
			     System.out.println("Invalid choice");
		}
	}
}	