package mypackage;

public class healthindex {
    double bmi, bmr;
    User user;

    void findbmi(double height, double weight) {
        bmi = weight / (height * height);
        System.out.println(" your bmi is " + bmi + "\n");
    }

    void findbmr(double height, double weight, int age, String gender) {
        if (gender == "male")
            bmr = 66 + ((13.7) * weight) + 5 * (height * 100) - ((6.8) * age);
        else
            bmr = 655 + ((9.6) * weight) + (1.8) * (height * 100) - ((4.7) * age);
        System.out.println("Your bmr is " + bmr + "\n");
    }
}