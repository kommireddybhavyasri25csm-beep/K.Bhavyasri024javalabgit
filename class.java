class Employee{
// Instance variables
int empId;
String name;
double salary;
// Constructor
Employee(int id,String n,double sal){
empId=id;
name=n;
salary=sal;
}
// Instance method
void display(){
System.out.printf("ID:%d|Name:%s|Salary:%2f%n",empId,name,salary);
}
// static method
static void companyName(){
System.out.println("ANITS");
}
}