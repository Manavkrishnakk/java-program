import java.util.*;

class Product {
    int p_code;
    String name;  
    int price; 
    void assign(int a, String b, int c)
     {  
        p_code = a;
        name = b;
        price = c;
    }
    void display() 
    {
        System.out.println(p_code);
        System.out.println(name);
        System.out.println(price);
    }

  
    static void calculate(Product p1, Product p2, Product p3) 
    {
        if (p1.price < p2.price && p1.price < p3.price) 
        {
            System.out.println(p1.name + " has the lowest price: " + p1.price);
        } else if (p2.price < p1.price && p2.price < p3.price) 
        {
            System.out.println(p2.name + " has the lowest price: " + p2.price);
        } else 
        {
            System.out.println(p3.name + " has the lowest price: " + p3.price);
        }
    }
}

class proclass
{
    public static void main(String args[]) 
    {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("Product details are:");
        p1.assign(1, "computer", 2000);
        p1.display();
        p2.assign(2, "mobile phone", 1000);
        p2.display();
        p3.assign(3, "laptop", 3000);
        p3.display();
        System.out.println("Product with the lowest price is:");
        Product.calculate(p1, p2, p3); 
}
}

