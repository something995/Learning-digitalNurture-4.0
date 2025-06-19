import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private int quantity;
    private double price;

    public Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void update(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void show() {
        System.out.println("ID: " + id + " | Name: " + name + " | Qty: " + quantity + " | ₹" + price);
    }
}

public class InventorySystem {
    private static final ArrayList<Product> list = new ArrayList<>();

    private static Product find(int id) {
        for (Product p : list) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    private static void add(Scanner sc) {
        int id = sc.nextInt(); sc.nextLine();
        String name = sc.nextLine();
        int qty = sc.nextInt();
        double pr = sc.nextDouble();
        list.add(new Product(id, name, qty, pr));
    }

    private static void retrieve(Scanner sc) {
        int id = sc.nextInt();
        Product p = find(id);
        if (p != null) p.show();
        else System.out.println("Not found");
    }

    private static void update(Scanner sc) {
        int id = sc.nextInt(); sc.nextLine();
        Product p = find(id);
        if (p != null) {
            String name = sc.nextLine();
            int qty = sc.nextInt();
            double pr = sc.nextDouble();
            p.update(name, qty, pr);
        } else {
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int ch = sc.nextInt();
            switch (ch) {
                case 1: add(sc); break;
                case 2: retrieve(sc); break;
                case 3: update(sc); break;
                case 4: return;
                default: System.out.println("Invalid");
            }
        }
    }
}
