class Student {
    String name; int id;
    Student(String n, int i) { name = n; id = i; }
}

class StudentView {
    void show(String name, int id) {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

class StudentController {
    Student model;
    StudentView view;
    StudentController(Student m, StudentView v) { model = m; view = v; }
    void updateView() { view.show(model.name, model.id); }
}
