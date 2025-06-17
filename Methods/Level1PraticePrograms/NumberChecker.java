package Methods.Level1PraticePrograms;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int result = check(number);
        System.out.println(result);
        
    input.close();
    }   
    public static int check(int number){
        if(number<0){
            return -1;
        }else if(number>0){
            return 1;
        }else{
            return 0;
        }
        

    }

}
