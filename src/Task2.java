public class Task2 {
    static void task2A(int [] arr){
        int i=0;
        while(i<arr.length)
            System.out.println(arr[i++]);
    }
    static void task2B_recursive(int []arr,int i){
        if (i>arr.length) return;
        System.out.println(i++);
        task2B_recursive(arr,i);
    }
    static int task2C(int []arr){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    static int task2D_recursive(int[] arr, int i){
        if (i==arr.length) return 0;
        return arr[i]+task2D_recursive(arr,++i);

    }
}
