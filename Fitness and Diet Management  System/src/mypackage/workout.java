package mypackage;

import java.util.*;
import java.io.File;

class exercise {
    String name;
    int reps;
    int sets;

     void exercise() {
        Scanner ex = new Scanner(System.in);
        System.out.println("enter the name of exercise");
        name = ex.nextLine();
        System.out.println("enter the number of reps");
        reps = ex.nextInt();
        System.out.println("enter the number of sets");
        sets = ex.nextInt();
    }

    void display() {
        System.out.println("Let's start the workout.Press one or two");
    }

}

class cardio extends exercise {
    long start, end;
    double tim;

    void count() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type any character to start the stopwatch");
        char s = sc.next().charAt(0);
        start = System.currentTimeMillis();
        System.out.println("Type any character to stop the stopwatch");
        char m = sc.next().charAt(0);
        end = System.currentTimeMillis();
        tim = (end - start) / 1000.0;

    }

    void display() {

        System.out.println("you have  done " + name + " for " + tim + "seconds");
    }
}

class strength extends exercise {
    strength() {
        String muscle;
        int load;
        Scanner sq = new Scanner(System.in);
        System.out.println("Enter the name of muscle");
        muscle = sq.nextLine();

        System.out.println("Enter the number of kgs");
        load = sq.nextInt();

        System.out.println("You have lifted " + load + " kg's for " + reps + " reps of " + sets + " sets to activate "
                + muscle + " muscle");
    }

}

public class workout {
    workout() {
        cardio ex1 = new cardio();
        strength ex2 = new strength();
        exercise ex3 = new exercise();
        int choice;
        Scanner ch = new Scanner(System.in);
        System.out.println("\n\t\tWELCOME TO WORKOUT SECTION\n");
        System.out.println("SELECT YOUR CHOICE OF EXERCISE\n1)Cardio workouts2)Strength training ");
        choice = ch.nextInt();
        if (choice == 1) {
            ex1.exercise();
            ex1.count();
            ex1.display();

        } else if (choice == 2) {
            ex2.exercise();
            ex2.display();

        } else
            ex3.display();
    }

}