import java.util.Scanner;
public class Task1 { /*
Task 1:
    (a)Write a method/function called task1A() that uses a while loop to print from 1 to 10.*/
    static void task1A() {
        int i = 1;
        while (i <= 10)
            System.out.println(i++);
    }
    //(b)Convert the previous task into a recursive function called task1B_recursive().
    static void task1B_recursive(int i){
        if (i==11) return;
        System.out.println(i);
        task1B_recursive(++i);
    }
    /*(c)Write a method/function called task1C() that uses a while loop
     to print from 1 to N, here N is a user input.      */
    static void task1C(int N){
        int i=1;
        while(i<=N)
            System.out.println(i++);
    }
    //(d)Convert the previous task into a recursive function called task1D_recursive().
    static void task1D_recursive(int N,int i){
        if (i>N) return;
        System.out.println(i);
        task1D_recursive(N,++i);
    }
    //Tester
    public static void main(String[] args) {
        System.out.println("Task 1A:");
        task1A();

        System.out.println("\nTask 1B Recursive:");
        task1B_recursive(1);

        System.out.println("\nTask 1C:");
        task1C(10);

        System.out.println("\nTask 1D Recursive:");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter N for recursive task: ");
        int N = sc.nextInt();
        task1D_recursive(N, 1);
    }
}
