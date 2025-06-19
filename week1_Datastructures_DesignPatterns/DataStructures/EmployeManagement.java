import java.util.*;

class Employee {
    int id; String name, role; double sal;
    Employee(int i, String n, String r, double s) {
        id = i; name = n; role = r; sal = s;
    }
}

public class EmployeeSys {
    static Employee[] list = new Employee[100];
    static int count = 0;
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        while (true) {
            int c = s.nextInt();
            if (c == 1) {
                int id = s.nextInt(); s.nextLine();
                String n = s.nextLine();
                String r = s.nextLine();
                double sal = s.nextDouble();
                list[count++] = new Employee(id, n, r, sal);
            } else if (c == 2) {
                int id = s.nextInt();
                for (int i = 0; i < count; i++)
                    if (list[i].id == id)
                        System.out.println(list[i].name + " " + list[i].role + " " + list[i].sal);
            } else if (c == 3) {
                for (int i = 0; i < count; i++)
                    System.out.println(list[i].name);
            } else if (c == 4) {
                int id = s.nextInt();
                for (int i = 0; i < count; i++) {
                    if (list[i].id == id) {
                        for (int j = i; j < count - 1; j++)
                            list[j] = list[j + 1];
                        count--; break;
                    }
                }
            } else break;
        }
    }
}
