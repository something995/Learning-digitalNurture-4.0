import java.util.*;

class Order {
    int id;
    String name;
    double price;
    Order(int i, String n, double p) {
        id = i; name = n; price = p;
    }
}

public class SortOrders {
    static void bubble(Order[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (a[j].price > a[j+1].price) {
                    Order t = a[j]; a[j] = a[j+1]; a[j+1] = t;
                }
    }

    static void quick(Order[] a, int l, int h) {
        if (l >= h) return;
        double p = a[h].price;
        int i = l;
        for (int j = l; j < h; j++) {
            if (a[j].price < p) {
                Order t = a[i]; a[i] = a[j]; a[j] = t;
                i++;
            }
        }
        Order t = a[i]; a[i] = a[h]; a[h] = t;
        quick(a, l, i - 1); quick(a, i + 1, h);
    }

    public static void main(String[] args) {
        Order[] o = {
            new Order(1, "A", 800),
            new Order(2, "B", 200),
            new Order(3, "C", 500)
        };
        bubble(o);
        for (Order x : o) System.out.print(x.price + " ");
        System.out.println();
        quick(o, 0, o.length - 1);
        for (Order x : o) System.out.print(x.price + " ");
    }
}
