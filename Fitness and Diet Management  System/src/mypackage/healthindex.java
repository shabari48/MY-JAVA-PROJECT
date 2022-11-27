package mypackage;

public class healthindex {
    double bmi, bmr;
    double weight;
    double height;
    int age;
    String gender;

    healthindex(String s1, String s2, String s3, String s4) {
        height = Double.parseDouble(s1);
        weight = Double.parseDouble(s2);
        age = Integer.parseInt(s3);
        gender = s4;
    }

    void findbmi() {
        bmi = weight / (height * height);
        System.out.println(" your bmi is " + bmi + "\n");
    }

    void findbmr() {
        if (gender == "male")
            bmr = 66 + ((13.7) * weight) + 5 * (height * 100) - ((6.8) * age);
        else
            bmr = 655 + ((9.6) * weight) + (1.8) * (height * 100) - ((4.7) * age);
        System.out.println("Your bmr is " + bmr + "\n");
    }
}