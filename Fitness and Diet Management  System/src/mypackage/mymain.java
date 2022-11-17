package mypackage;

import java.util.Scanner;
import javax.swing.*;

public class mymain {

    public static void main(String[] args) {
        // local variables
        String name, gender;
        int age, choice;
        double height, weight;

        // variables for other purpose
        User user = new User();
        healthindex hi = new healthindex();

        try {
            // create instance of the CreateLoginForm
            MyFrame f = new MyFrame();
            f.setSize(320, 700); // set size of the frame
            f.setVisible(true); // make form visible to the user
        } catch (Exception e) {
            // handle exception
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        System.out.println("\n\t\t********WELCOME TO DIET AND FITNESS MANAGEMENT SYSTEM***********\n\n");
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
            System.out.println("\n");

            System.out.println("ENTER YOUR WEIGHT");
            weight = sc.nextDouble();
            user.setweight(weight);
            System.out.println("\n");
            while (true) {
                System.out.println(
                        "\nChoose any option\n1)Choose plans \n2)Free workout and Diet plans\n3)Check my health indexes\n");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        break;
                    case 2:
                        workout workout1 = new workout();
                        break;
                    case 3:
                        hi.findbmi(height, weight);
                        hi.findbmr(height, weight, age, gender);
                        break;
                    default:
                        break;
                }

            }
        }
    }

}
