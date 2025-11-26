public class Task3 {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
/*
A. Write a method/function called task3A( ) that takes the head of Singly LinkedList in
its parameter and uses a while loop to print the linked list elements.
 */
    void task3A(Node head){
        while (head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }
//B. Convert the previous task into a recursive function called task3B_recursive().
    void task3B_recursive(Node head){
        if (head==null) return;
        System.out.println(head.val);
        task3B_recursive(head.next);
    }
/*
C. Write a method/function called task3C( ) that takes the head of Singly LinkedList in
its parameter and returns the summation of the elements.
 */
    int task3C(Node head){
        int sum=0;
        while (head!=null){
            sum+=head.val;
            head=head.next;
        }
        return sum;
    }

//D. Convert the previous task into a recursive function called task3C_recursive().
    int task3C_recursive(Node head){
        if (head==null) return 0;
        return head.val+task3C_recursive(head.next);
    }
/*
E. Write a method/function called task3E( ) that takes the head of Singly LinkedList in its parameter .
The function returns the subtraction between the summation of odd elements and multiplication of the even elements.
 */
    int task3E(Node head){
        int sum=0,mul=1;
        while (head!=null){
            if (head.val%2==0)
                mul*= head.val;
            else sum+=head.val;
            head=head.next;
        }
        return sum-mul;
    }
/*
F. Write a function called task3F_recursive() which does the same thing as task3E but utilizes recursion.
Note: You may use helper functions for this task
*/
    int task3F_recursive(Node head){
        return summation(head) - multiplication(head);
    }
    int multiplication(Node head){
        if (head==null) return 1;
        if (head.val%2==0)
            return head.val * multiplication(head.next);
        return multiplication(head.next);
    }
    int summation(Node head){
        if (head==null) return 0;
        if (head.val%2==1)
            return head.val+summation(head.next);
        return summation(head.next);
    }
//\\//\\//\\//\\//\\//\\//\\TESTER//\\//\\//\\//\\//\\//\\//\\
    public static void main(String[] args) {

        Task3 t = new Task3();

        // Create a linked list: 5 -> 2 -> 7 -> 4 -> 9
        Task3.Node head = new Task3.Node(5);
        head.next = new Task3.Node(2);
        head.next.next = new Task3.Node(7);
        head.next.next.next = new Task3.Node(4);
        head.next.next.next.next = new Task3.Node(9);

        System.out.println("===== Task 3A (Print using loop) =====");
        t.task3A(head);

        System.out.println("\n===== Task 3B (Print using recursion) =====");
        t.task3B_recursive(head);

        System.out.println("\n===== Task 3C (Summation using loop) =====");
        System.out.println("Sum = " + t.task3C(head));

        System.out.println("\n===== Task 3C_recursive (Summation using recursion) =====");
        System.out.println("Sum = " + t.task3C_recursive(head));

        System.out.println("\n===== Task 3E (oddSum - evenMul using loop) =====");
        System.out.println("Result = " + t.task3E(head));

        System.out.println("\n===== Task 3F_recursive (oddSum - evenMul using recursion) =====");
        System.out.println("Result = " + t.task3F_recursive(head));
    }
}

