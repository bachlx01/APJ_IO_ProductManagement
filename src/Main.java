import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProductManagement listProduct = new ProductManagement();

        int choice = -1;
        while (choice != 0) {
            System.out.println("1. Add new product");
            System.out.println("2. Show products list");
            System.out.println("3. Search product by name");
            System.out.println("4. Search product by brand");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    addProduct(listProduct);
                    break;
                case 2:
                    listProduct.showProducts();
                    break;
                case 3:
                    System.out.print("Enter the product's name: ");
                    String name = new Scanner(System.in).nextLine();
                    listProduct.searchByName(name);
                    break;
                case 4:
                    System.out.print("Enter brand: ");
                    String brand = new Scanner(System.in).nextLine();
                    listProduct.searchByBrand(brand);
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

    private static void addProduct(ProductManagement listProduct) {
        System.out.print("Product ID: ");
        String productID = new Scanner(System.in).nextLine();
        System.out.print("Product name: ");
        String productName = new Scanner(System.in).nextLine();
        System.out.print("Product brand: ");
        String productBrand = new Scanner(System.in).nextLine();
        System.out.print("Price: ");
        int productPrice = new Scanner(System.in).nextInt();
        listProduct.addProduct(new Product(productID, productName, productBrand, productPrice));
    }
}
