// custom exception
class InvalidFeeException extends Exception {
    InvalidFeeException(String message) {
        super(message);
    }
}

// course enrollment
public class CourseEnrollment {

    void setCourseFee(String course, double fee) throws InvalidFeeException {
        if (fee < 0) {
            throw new InvalidFeeException("❌ Invalid Fee for " + course + ": Rs." + fee);
        }
        System.out.println("✅ " + course + " Fee Set: Rs." + fee);
    }

    public static void main(String[] args) {

        CourseEnrollment obj = new CourseEnrollment();

        String[] courses = {"Java", "Python", "MySQL"};
        double[] fees    = {5000, -500, 3000};  // -500 is invalid

        for (int i = 0; i < courses.length; i++) {
            try {
                obj.setCourseFee(courses[i], fees[i]);
            } catch (InvalidFeeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}