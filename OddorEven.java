//Write a Java program to determine if a number entered by the user is odd or even.(Assume that the user will enter a positive integer only).
//
//        1) Print out "The number entered is even" if the number entered is even
//
//        2) Print out "The number entered is odd" if the entered number if odd
        import java.util.*;
        public class OddorEven {

            public static void main(String[] args) {

                int n;
                Scanner input= new Scanner(System.in);
                System.out.print("ENTER A NUMBER:");
                n=input.nextInt();
                //write your code here
                if(n % 2 == 0){
                    System.out.println("The number entered is even");
                }
                else {
                    System.out.println("The number entered is odd");
                }
            }
        }
