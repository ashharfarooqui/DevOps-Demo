import java.util.*;
class Person 
{
	String name,address;
	
   public void getdetails(String name, String address) {
	this.name=name;
	this.address=address;
   }
   public void print()
   {
	System.out.print("Customer Name:",this.name);
	System.out.print("Customer Address:",this.address);
   }
}

public class customer extends Person 
{
	String product;
	int qty,price,mobile;
	public void getcustomer(String product,int qty,int price,int mobile)
	{
		this.product=product;
		this.qty=qty;
		this.price=price;
		this.mobile=mobile;
	}
	public void printdetials()
   	{
		System.out.println("Mobile number of Person",this.mobile_number);
		System.out.println("Purchased Product:",this.product);
		System.out.println("Purchased Qty:",this.qty);
		System.out.println("Price of Product:",this.price);
   	}
	public void totalPrice()
	{
		System.out.println("Total Amount:",(this.qty*this.price));
	}
}
public static void main(String args[]) 
   {
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter Name:");
      String name=scn.nextLine();
      System.out.println("Enter Address:");
      String address=scn.nextLine();
      System.out.println("Enter Mobile number:");
      String mobile=scn.nextInt();
      System.out.println("Enter Product Name:");
      String product=scn.nextLine();
      System.out.println("Enter Qty purchase:");
      String qty=scn.nextInt();
      System.out.println("Enter Price of product:");
      String price=scn.nextInt();       
      customer demo = new customer();
      demo.getdetails(name,address);
      demo.getcustomer(product,qty,price,mobile);
      demo.print();
      demo.printdetails();
      demo.totalPrice();
   }
}