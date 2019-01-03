package Singh_Gursharan_Lab2;

import java.text.NumberFormat;
import java.util.ArrayList;

public class ShoppingCart {
	 private static double totalPrice=0;
	 private static ArrayList<Item> cart=new ArrayList<Item>();
	 
	
	public static ArrayList<Item> getCart(){
		return ShoppingCart.cart;
	}
	
	public static void addToCart(Item item) {
		ShoppingCart.getCart().add(item);
	}
	// calculating total price of all items
	public static double getTotalPrice() {
		ShoppingCart.totalPrice=0;
		int k=0;
		while(cart.size()>k) {
			ShoppingCart.totalPrice += cart.get(k).getPrice()*cart.get(k).getQuantity();
			k++;
		}
		ShoppingCart.totalPrice = Math.round(ShoppingCart.totalPrice*100)/100.0;
		return ShoppingCart.totalPrice;
	}
	
	public static boolean isEmpty() {
		if(ShoppingCart.cart.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	// print statements ** using print f to format the output
	// printf function with Strng , String paramates
	private static void printf(String str1,String str2) {
		System.out.printf(str1,str2);
	}
	// printf function with Strng, Double paramaters
	private static void printf(String str1,double str2) {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		System.out.printf(str1,fmt.format(str2));
	}
	
	public static void printBill() {
		ShoppingCart.printf("%-10s","Shopping Cart" + "\n\n");
		ShoppingCart.printf("%-20s","Items");
		ShoppingCart.printf("%-20s","Unit Price");
		ShoppingCart.printf("%-15s","Quantity");
		ShoppingCart.printf("%-15s","Total");
		System.out.println();
		int k=0;
		while(cart.size()>k) {
			double price = ShoppingCart.cart.get(k).getPrice();
			int quantity = ShoppingCart.cart.get(k).getQuantity();
			double total = Math.round(price*quantity*100)/100.0;
			
			ShoppingCart.printf("%-20s",ShoppingCart.cart.get(k).getName());
			ShoppingCart.printf("%-20s",price);
			ShoppingCart.printf("%-15s",Integer.toString(quantity));
			ShoppingCart.printf("%-15s",total);
			System.out.println();
			k++;
		}
		System.out.println();
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		System.out.println("Total Price:  "+fmt.format(ShoppingCart.getTotalPrice()));
	}
}
