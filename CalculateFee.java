// ✅ Interface - enforces calculateFee() for every course
interface Course {
    double calculateFee();
}

class JavaCourse implements Course {
    public double calculateFee() { return 5000.0; }
}

class PythonCourse implements Course {
    public double calculateFee() { return 4000.0; }
}

class MySQLCourse implements Course {
    public double calculateFee() { return 3000.0; }
}

public class CalculateFee {
    public static void main(String[] args) {

        Course[] courses = { new JavaCourse(), new PythonCourse(), new MySQLCourse() };
        String[] names   = { "Java", "Python", "MySQL" };

        for (int i = 0; i < courses.length; i++) {
            System.out.println(names[i] + " Fee → Rs." + courses[i].calculateFee());
        }
    }
}