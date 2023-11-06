import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void viewStudents() {
        students.forEach(System.out::println);
    }

    public void updateStudent(int id, String newName, String newGrade) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(newName);
                s.setGrade(newGrade);
                break;
            }
        }
    }

    public void deleteStudent(int id) {
        students.removeIf(s -> s.getId() == id);
    }

    public Student searchStudentByName(String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }
}