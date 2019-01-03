package Singh_Gursharan_Lab2;

public class ShoppingCartTest {

	public static void main(String[] args) {
		//creating items
		Item item1=new Item("Milk",4.66,2);
		Item item2=new Item("eggs",5.2,3);
		Item item3=new Item("Apple",1.66,4);
		
		//adding items to shopping cart
		ShoppingCart.addToCart(item1);
		ShoppingCart.addToCart(item2);
		ShoppingCart.addToCart(item3);
		
		//printing the shopping cart
		ShoppingCart.printBill();

	}

}
