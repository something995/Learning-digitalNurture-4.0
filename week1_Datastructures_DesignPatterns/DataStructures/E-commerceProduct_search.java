
import java.util.*;

class Product {

    int id;
    String name, cat;

    Product(int i, String n, String c) {
        id = i;
        name = n;
        cat = c;
    }
}

public class ProductSearch {

    static Product[] items = {
        new Product(1, "Shirt", "Clothing"),
        new Product(2, "Phone", "Electronics"),
        new Product(3, "Laptop", "Electronics"),
        new Product(4, "Book", "Stationery")
    };

    static int linear(String name) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].name.equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    static int binary(String name) {
        Arrays.sort(items, Comparator.comparing(p -> p.name));
        int l = 0, r = items.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            int cmp = items[m].name.compareToIgnoreCase(name);
            if (cmp == 0) {
                return m; 
            }else if (cmp < 0) {
                l = m + 1; 
            }else {
                r = m - 1;
            }
        }
        return -1;
    }

    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();
        int i = linear(x);
        if (i != -1) {
            System.out.println("Linear: " + items[i].name);
        }
        i = binary(x);
        if (i != -1) {
            System.out.println("Binary: " + items[i].name);
        }
    }
}
