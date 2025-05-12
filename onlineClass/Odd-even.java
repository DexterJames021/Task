package onlineClass;

import java.util.*;
class isOdd{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        
        if(number == 0){
            System.out.println(number + " is Zero");
        }
        else if(number < 0){
            System.out.println(number + " is a negative number");
        }
        else if(number % 2 == 0){
            System.out.println(number + " is Even");

        }
        else {
            System.out.println(number + " is Odd");

        }

        scan.close();
} 
} 