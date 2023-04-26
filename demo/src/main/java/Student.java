public class Student extends Person implements Learner {
    double totalStudytime;

    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudytime = totalStudytime + numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudytime;
    }

}
