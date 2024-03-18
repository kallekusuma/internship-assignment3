import java.io.*;

class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int id;
    private String name;
    private String category;
    private double price;


    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }




    public void displayDetails() {
        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        
        try {
            
            Product product = new Product(101, "Laptop", "Electronics", 1200.50);


            FileOutputStream fileOut = new FileOutputStream("product.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(product);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in product.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

   
        try {
           
            FileInputStream fileIn = new FileInputStream("product.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Product product = (Product) in.readObject();
            in.close();
            fileIn.close();


            System.out.println("\nDeserialized Product:");
            product.displayDetails();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
