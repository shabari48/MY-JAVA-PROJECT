package mypackage;

import java.util.Scanner;

public class mymain {

    public static void main(String[] args) {
        String name, gender;
        int age;
        double height, weight;

        User user = new User();
        healthindex hi = new healthindex();

        System.out.println("\t\tWELCOME TO DIET AND FITNESS MANAGEMENT SYSTEM\n\n");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER YOUR NAME");
            name = sc.next();
            user.setname(name);
            System.out.println("\n");

            System.out.println("ENTER YOUR AGE");
            age = sc.nextInt();
            user.setage(age);
            System.out.println("\n");

            System.out.println("ENTER YOUR GENDER");
            gender = sc.next();
            user.setgender(gender);
            System.out.println("\n");

            System.out.println("ENTER YOUR HEIGHT");
            height = sc.nextDouble();
            user.setheight(height);

            System.out.println("ENTER YOUR WEIGHT");
            weight = sc.nextDouble();
            user.setweight(weight);
        }
        hi.findbmi(height, weight);
        hi.findbmr(height, weight, age, gender);

    }
}
