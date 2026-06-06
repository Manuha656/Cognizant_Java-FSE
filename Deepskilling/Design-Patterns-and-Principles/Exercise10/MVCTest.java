package Exercise10;

public class MVCTest {
    public static void main(String[] args) {
        Student student = new Student("Manu", "21", "9.2");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.showStudent();
    }
}
