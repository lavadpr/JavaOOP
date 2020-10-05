import model.Student;

public class PrintStudent {
    public static void main(String[] args) {
        Student student = new Student("Prince Mohammad Andrew Lavadia", 22, "Male", 201410526);
        System.out.println("Name: " + student.getName() + "\nAge: " + student.getAge() + "\nGender: " + student.getGender() + "\nId Number: ");
    }
}
