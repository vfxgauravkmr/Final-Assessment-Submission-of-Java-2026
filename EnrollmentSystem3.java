import java.util.*;

public class EnrollmentSystem3 {

    // ✅ Thread-safe collection
    List<String> enrollmentList = Collections.synchronizedList(new ArrayList<>());

    // ✅ Synchronized method - only 1 thread at a time
    synchronized void enroll(String student) {
        enrollmentList.add(student);
        System.out.println(Thread.currentThread().getName() + " enrolled: " + student);
    }

    void displayAll() {
        System.out.println("\n===== Enrolled Students =====");
        for (String s : enrollmentList) {
            System.out.println("→ " + s);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        EnrollmentSystem sys = new EnrollmentSystem();

        // Multiple threads enrolling simultaneously
        Thread t1 = new Thread(() -> sys.enroll("Riya"),  "Thread-1");
        Thread t2 = new Thread(() -> sys.enroll("Arjun"), "Thread-2");
        Thread t3 = new Thread(() -> sys.enroll("Sneha"), "Thread-3");

        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to finish
        t1.join();
        t2.join();
        t3.join();

        sys.displayAll();
    }
}