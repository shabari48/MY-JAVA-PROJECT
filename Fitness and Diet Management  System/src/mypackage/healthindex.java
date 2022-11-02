package mypackage;

public class healthindex {
    double bmi, bmr;
    User u1 = new User();

    void findbmi(double height, double weight) {
        bmi = weight / (height * height);
        System.out.println(u1.username + " your bmi is " + bmi);
    }

}
