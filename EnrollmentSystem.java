import java.util.*;

public class EnrollmentSystem {

    HashMap<String, ArrayList<String>> map = new HashMap<>();

    void enroll(String student, ArrayList<String> courses) {
        map.put(student, courses);
    }

    void lookup(String student) {
        System.out.println("\n" + student + " → " + map.get(student));
    }

    void displayAll() {
        System.out.println("\n===== All Enrollments =====");
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        EnrollmentSystem sys = new EnrollmentSystem();

        sys.enroll("Riya",  new ArrayList<>(Arrays.asList("Java", "MySQL", "Python")));
        sys.enroll("Arjun", new ArrayList<>(Arrays.asList("HTML", "CSS")));
        sys.enroll("Sneha", new ArrayList<>(Arrays.asList("Java", "Spring")));

        sys.lookup("Riya");
        sys.lookup("Arjun");

        sys.displayAll();
    }
}