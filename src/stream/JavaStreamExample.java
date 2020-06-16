package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}  
    
}  
public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f)); 
        
        long count=productsList.stream().filter(i->i.price>=35).count();
    	System.out.println("  count"+" "+count);
		
    	List<Product> compareTo=productsList.stream().sorted((i1,i2)->-i2.name.compareTo(i1.name)).collect(Collectors.toList());
		System.out.println("compareTo"+"   "+compareTo);
      
		 Set<Float> productPriceList = productsList.stream().filter(i->i.price < 30000).map(i->i.price).collect(Collectors.toSet());
		 System.out.println("list to set"+ "  "+productPriceList);
	List<Float> UpatedPrice=productsList.stream().map(i->i.price+5).collect(Collectors.toList());
	System.out.println(" map"+ " "+UpatedPrice);
	
	 Product productA = productsList.stream()  
             .max((product1, product2)->   
             product1.price > product2.price ? 1: -1).get();  

System.out.println(productA.price);  
Product productB = productsList.stream().max((product1, product2)-> product1.price < product2.price ? 1:- 1).get();  
System.out.println(productB.price);  

    
    }  
}  