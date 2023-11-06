public class Main {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        sms.addStudent(new Student(1, "Tarun", "A+"));
        sms.addStudent(new Student(2, "Millan", "A+"));
        sms.addStudent(new Student(3, "Subrat", "A+"));
        sms.addStudent(new Student(4, "Sarthk", "A+"));
        System.out.println("Students List:");
        sms.viewStudents();
        sms.updateStudent(2, "Robert", "A+");
        System.out.println("\nAfter updating Bob's details:");
        sms.viewStudents();
        System.out.println("\nSearching for Ramesh:");
        Student foundStudent = sms.searchStudentByName("Ramesh");
        System.out.println(foundStudent != null ? foundStudent : "Student not found.");
        sms.deleteStudent(1);
        System.out.println("\nAfter deleting Alice:");
        sms.viewStudents();
    }
}
