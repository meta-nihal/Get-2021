package shoppingcart;
public class Item {

	

	Integer id;
	String pname;
	Integer price;
	Integer quantity;
	
	public Integer [] pid = {0,1,2,3};
	
    public String [] pName = {"Laptop" , "Mouse", "Bag" , "Headphone"};
	
	public Integer [] prices = {50000,200,1000,1500};
	
	public Integer [] quantities = {5 , 10, 5 , 10 };
	
	public Item()
	{
		
	}
	
	public Item(Integer id , String name,Integer  price , Integer quantity)
	{
		this.id = id;
		this.pname=name;
		this.price=price;
		this.quantity=quantity;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	void showItem()
	{
		int total=pName.length;
		for(int i=0;i<total;i++)
		{
			System.out.println("Item id:"+pid[i]+ " Item name:"+ pName[i] +"Item quantity:"+quantities[i]);
		}
	}
	
   @Override	
   public String toString()
   {
	   return "Item[pid=" + id + " ,  itemName=" + pname + " , itemPrice=  "+ price + " , itemQuantiy= " + quantity + "]";
   }
}
