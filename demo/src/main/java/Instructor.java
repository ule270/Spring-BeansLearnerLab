public class Instructor extends Person implements Teacher {

    public Instructor(long id, String name) {
        super(id, name);

    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        int count = 0;
        for (Learner learns : learners) {
            count++;
        }
        for (Learner learns : learners) {
            learns.learn(numberOfHours / count);
        }

    }

}
