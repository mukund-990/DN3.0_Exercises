public class MVCTest {
    public static void main(String[] args) {
        Student model = new Student("Mukund kumar jha", 123, 85.0);
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.displayStudentDetails();

        controller.updateStudentName("Sakshi gupta");
        controller.updateStudentId(456);
        controller.updateStudentGrade(90.0);

        controller.displayStudentDetails();
    }
}