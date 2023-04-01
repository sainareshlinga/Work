abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    double subject1, subject2, subject3;

    A(double s1, double s2, double s3) {
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
    }

    @Override
    double getPercentage() {
        return (subject1 + subject2 + subject3) / 3;
    }
}

class B extends Marks {
    double subject1, subject2, subject3, subject4;

    B(double s1, double s2, double s3, double s4) {
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
        subject4 = s4;
    }

    @Override
    double getPercentage() {
        return (subject1 + subject2 + subject3 + subject4) / 4;
    }
}
