package oops;

import org.apache.poi.ss.formula.functions.Address;

public class Employee
{
String name;
int age;
Address adr;
Employee(String name, int age, Address adr)
{
this.name = name;
this.age = age;
this.adr = adr;
}
public void display()
{
System.out.println("Name of Employee->" + name);
System.out.println("Age of Employee->" + age);
System.out.println("cityname->" + adr.city);
System.out.println("Statename->" + adr.state);
System.out.println("countryname->" + adr.country);
System.out.println("----------------------------------");

}
public static void main(String[] args)
{
Address adr1 = new Address("Pune", "Maharashtra", "India");
Address adr2 = new Address("Mumbai", "Maharashtra", "India");
Employee e1 = new Employee("sandip", 38, adr1);
Employee e2 = new Employee("Gajanan", 40, adr2);
e1.display();
e2.display();
}
}
