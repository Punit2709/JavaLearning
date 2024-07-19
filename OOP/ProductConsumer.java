import java.lang.*;
import java.util.*;

class Product
{
    private String itemNo;
    private String name;
    private double price;
    private int qty;

    public Product(String itemno)
    {
        itemNo=itemno;
    }
    public Product(String itemno,String name)
    {
        itemNo=itemno;
        this.name=name;
    }
    public Product(String itemno, String name, double price, int qty)
    {
        itemNo=itemno;
        this.name=name;
        setPrice(price);
        setQuantity(qty);
    }

    public String getItemNo(){return  itemNo;}
    public String getName(){return name;}
    public double getPrice(){return price;}
    public int getQuantity(){return qty;}
    
    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setQuantity(int qty)
    {
        this.qty=qty;
    }
}

class Customer
{
    private String custId;
    private String name;
    private String address;
    private String phno;
    
    public Customer(String custId,String name)
    {
        this.custId=custId;
        this.address=name;
    }
    public Customer(String custId,String name,String address,String phno)
    {
        this.custId=custId;
        this.name = name;
        this.address=name;
        setAddress(address);
        setPhno(phno);
    }
    
    public String getCustId(){return custId;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}
    
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
}

public class ProductConsumer
{
    public static void main(String[] args)
    {
        Product p1 = new Product("11A", "Ball", 1500, 10);
       
        System.out.println("Details :- ");
        System.out.println("Item no = "       + p1.getItemNo()   + "\n" +
                            "Product Name = " + p1.getName()     + "\n" +
                            "Price = "        + p1.getPrice()    + "\n" +
                            "Quantity = "     + p1.getQuantity() + "\n" );  


        Customer c1 = new Customer("A11", "Ramesh", "Ahmedabad", "9510483539");
        
        System.out.println("Details :- ");
        System.out.println("Customer id  = "   + c1.getCustId()   + "\n" +
                            "Customer Name = " + c1.getName()     + "\n" +
                            "Address = "       + c1.getAddress()  + "\n" +
                            "Mo No. = "        + c1.getPhno()     + "\n" ); 

    }

}