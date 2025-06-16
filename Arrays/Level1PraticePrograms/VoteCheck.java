package Arrays.Level1PraticePrograms;

import java.util.Scanner;

public class VoteCheck {
    public static void main(String[] args) {
       // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);
        // inilize an array of length 10
        int [] studentsAge =  new int[10];

        for(int i=0; i<10; i++){
            studentsAge[i] = input.nextInt();// take input from user
        }

        for(int i=0; i<10; i++){ // loop for check age for vote
            if(studentsAge[i]<18){ // check age
                System.out.println("The Student with the age "+ studentsAge[i]+" cannot vote");
            }else if (studentsAge[i]<=0) { //check age
                System.out.println("Invalid age");
                
            }else{
                System.out.println("The Student with the age of "+ studentsAge[i]+" can vote");
            }
        }

        input.close(); // close input

    }
}