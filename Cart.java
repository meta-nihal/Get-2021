package shoppingcart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {
	
	Item i1 = new Item();
    List<Item> items = new ArrayList<Item>();
	public static void main(String[] args) {
		
		System.out.println("This is a shopping cart system");
		System.out.println("1. Show item ");
		System.out.println("2. Add Item in cart");
		System.out.println("3. Remove Item from cart");
		System.out.println("4. Show Cart");
		System.out.println("5. Bill details");
		System.out.println("6. Update cart");
		System.out.println("7. Exit");
		
		System.out.println("Enter your choice:");
		
		Scanner sc = new Scanner(System.in);
		int choice;
		Cart c = new Cart();
		Item i2 = new Item();
	do
	{
		
		choice =sc.nextInt();
		
		switch(choice)
		{
		 case 1 : i2.showItem();
		          break;
		   
		 case 2 : System.out.println("Enter item id and quantity");
                  Integer id =sc.nextInt();
                  Integer qty=sc.nextInt();
	              c.addItem(id,qty);
	              break;
	      
		 case 3 : System.out.println("Enter item id");
		            id =sc.nextInt();
			        c.removeItem(id); 
	                break;
	                
		 case 4 : c.showCart(); 
		           break;
		     
		 case 5 : c.cartBill();
		          break;
		          
		 case 6 : System.out.println("Enter item id and quantity ");
		          id=sc.nextInt();
		          qty=sc.nextInt();
			      c.updateCart(id, qty);
			      break;
			      
		 case 7 : System.out.println("You are out of system");
			      return;         
		          
	     default : System.out.println("Invalid choice");           
		}
		
		System.out.println();
		System.out.println("Enter your choice:");
		
		
	}while(choice!=7);
	
}	
	
	                                                  //method to add item in cart
	public  void addItem(Integer id,Integer qty) {
	   int len=i1.pName.length;
	   if(id>=len)
		   System.out.println("Enter valid item id");
	   else
	   {	   
	   this.items.add(new Item(i1.pid[id],i1.pName[id],i1.prices[id],qty));
	   System.out.println("Item successfully added");
	   }			   
	}
	                                                 //method to remove item from cart
	public void removeItem(Integer id) {
	    int i=id;
		for(Item item : items)
		{
		
			if(item.getId()==i)
			{	 items.remove(item);
			     System.out.println("Item successfully removed");
			     return;
			}
		}
		
		 System.out.println("Item not found in cart");
	}
	                                                 //method to show items in cart
	public void showCart(){
		
		for(Item item :items )
		{
			if (item==null)
				System.out.println("Cart is empty");
			else
				System.out.println(item);
		}
	    
    }
	                                                //method to show bill of cart items
	public void cartBill()
	{
		int totalcost=0;
		
		for(Item item : items)
		{
			totalcost+=item.price*item.quantity;
		}
		System.out.println(totalcost);
	}
	
	public void updateCart(Integer id,int qty)
	{ 
		int i=id;
		for(Item item : items)
		{
			if(item.getId()==i)
			{
			  item.setQuantity(qty);
			}
		}
		System.out.println("Item successfully updated");
	}

}

