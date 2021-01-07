import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class ProductManagement {
    private final String OUTPUT_LINK = "object.dat";
    private List<Product> listProduct;

    public ProductManagement() {
        this.listProduct = new LinkedList<>();
//        try {
//            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(OUTPUT_LINK));
//            Product product = null;
//            while ((product = (Product) inputStream.readObject()) != null) {
//                listProduct.add(product);
//            }
//        } catch (Exception e) {
//            System.out.println("Can not open the file");
//        }
    }

    public void addProduct (Product product) {
        try {
            listProduct.add(product);
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(OUTPUT_LINK));
            for (Product p : listProduct) {
                outputStream.writeObject(p);
            }
            outputStream.close();

        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }

    public void searchByName (String name) {
        for (Product p :
                listProduct) {
            if (p.getProductName().equals(name)) {
                System.out.println(p.toString());
            }
        }
    }

    public void searchByBrand (String brand) {
        for (Product p :
                listProduct) {
            if (p.getBrand().equals(brand)) {
                System.out.println(p.toString());
            }
        }
    }


    public void showProducts() {
        for (Product p : listProduct) {
            System.out.println(p.toString());
        }
    }
}
