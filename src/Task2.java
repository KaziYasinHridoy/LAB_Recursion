public class Task2 {
/*
A. Write a method/function called task2A( ) that takes an array in its parameter and
uses a while loop to print the array elements.
 */
    static void task2A(int [] arr){
        int i=0;
        while(i<arr.length)
            System.out.println(arr[i++]);
    }
// B. Convert the previous task into a recursive function called task2B_recursive().
    static void task2B_recursive(int []arr,int i){
        if (i==arr.length) return;
        System.out.println(i++);
        task2B_recursive(arr,i);
    }
/*
C. Write a method/function called task2C( ) that
takes an array in its parameter and returns the summation of the elements.
 */
    static int task2C(int []arr){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        return sum;
    }
// D. Convert the previous task into a recursive function called task2D_recursive().
    static int task2D_recursive(int[] arr, int i){
        if (i==arr.length) return 0;
        return arr[i]+task2D_recursive(arr,++i);
    }
/*
E. Write a method/function called task2E( ) that takes an array in its parameter.
The function returns the subtraction between the multiplication of odd elements and
summation of the even elements.
 */
    static int task2E(int[] arr){
        int sum=0,mul=1;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]%2==0)sum+=arr[i];
            else mul*=arr[i];
        }
        return mul-sum;
    }
/*
F. Write a function called task2F_recursive() which does the same thing as task2E
but utilizes recursion. The task2F_recursive() doesn’t have to be recursive if
the helper function uses recursion.
Note: You may use helper functions for this task. i.e. one helper function may
do the summation and another function may do the multiplication then
the task2F_recursive() would just call them and return the subtraction.
 */
    static int task2F_recursive(int[] arr){
        return odd_multiplication(arr,0)-even_summation(arr,0);
    }
    static int odd_multiplication(int arr[],int i){
        if (i==arr.length) return 1;
        if (arr[i]%2==1)  return arr[i]*odd_multiplication(arr,++i);
        else  return odd_multiplication(arr,++i);//ignoring even number by leaving it without any operation.
    }
    static int even_summation(int arr[],int i){
        if (i==arr.length) return 0;
        if (arr[i]%2==0)   return arr[i]+even_summation(arr,++i);
        else  return even_summation(arr,++i);
    }

}
