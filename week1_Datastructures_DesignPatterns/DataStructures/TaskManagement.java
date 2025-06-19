
class Task {

    int id;
    String name, status;
    Task next;

    Task(int i, String n, String s) {
        id = i;
        name = n;
        status = s;
    }
}

public class TaskList {

    static Task head = null;

    static void add(int id, String name, String status) {
        Task t = new Task(id, name, status);
        t.next = head;
        head = t;
    }

    static void show() {
        Task p = head;
        while (p != null) {
            System.out.println(p.name + " " + p.status);
            p = p.next;
        }
    }

    static void remove(int id) {
        if (head != null && head.id == id) {
            head = head.next;
            return;
        }
        Task p = head;
        while (p != null && p.next != null) {
            if (p.next.id == id) {
                p.next = p.next.next;
                return;
            }
            p = p.next;
        }
    }

    public static void main(String[] a) {
        add(1, "Design", "Pending");
        add(2, "Code", "In Progress");
        show();
        remove(1);
        show();
    }
}
