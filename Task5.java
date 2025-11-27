public class Task5 {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
/*
A. Write a method/function called findMax_recursive( ) that takes the head of a Singly LinkedList in its
parameter and returns the maximum number from the linked list. You may use helper functions.
For the two Task5B and Task5C below we’ll be simulating nested loops into recursive functions.
It’s easier to solve these problems if you dedicate one recursive function/method to do the tasks of one loop.
*/
    static int findMax_recursive(Node head){
        if (head.next==null) return head.val;
        int max=findMax_recursive(head.next);
        if (head.val>=max)
            return head.val;
        return max;
    }
/*
B. Write a method/function called sortLL_recursive( ) that takes the head of Singly LinkedList in its parameter.
The function would sort the linked list using the selection sorting algorithm and finally return the updated head.
Note: You can just swap the values of the nodes, no need to connect/disconnect nodes.
You can also use helper functions and utilize the previous function to solve this.
*/
    static Node  sortLL_recursive(Node head ){
        if (head.next==null||head.next.next==null) return head;
         sortLL_recursive(sort_one_node(head,head).next);
         return head;//the head passed and returned here is always the same...no matter what the recursion does😗 hahaha...
    }
    static Node sort_one_node(Node head, Node min){
        if (head.next==null)return head;
        Node n=sort_one_node(head.next,min);
        if (min.val>n.val){
            int temp=min.val;
            min.val=n.val;
            n.val=temp;
        }
        return head;
    }
/*
C. Write a recursive method/function called findDup( ) that takes the head of Singly LinkedList in its parameter and
then print each value and  the indices where the duplicates are found.
Note: You can use helper functions to solve this.
*/
    void findDup(Node head ){
        printing(head,head);
    }
    void printing(Node head, Node cur){
        if (cur==null) return;
        String idx= each_node_status(head, cur, "", 0);
        if (idx=="") idx+="No Duplicate";
        System.out.println(cur.val+": "+idx);
        printing(head,cur.next);
    }
    String each_node_status(Node head, Node cur, String idx, int count){
        if (head==null) return idx;
        if (head!=cur && head.val==cur.val){
            if (idx.equals("")) idx+=count;
            else idx+=", "+count;
        }
        return each_node_status(head.next, cur, idx, ++count);
    }

//\\//\\//\\//\\//\\//\\//\\GENERATED TESTER METHOD//\\//\\//\\//\\//\\//\\//\\
    public static void main(String[] args) {
        // Tester method created with a little help from AI for speed
        // -------- Create Linked List of 9 nodes --------
        Task5.Node head = new Task5.Node(10);
        head.next = new Task5.Node(22);
        head.next.next = new Task5.Node(13);
        head.next.next.next = new Task5.Node(20);
        head.next.next.next.next = new Task5.Node(22);
        head.next.next.next.next.next = new Task5.Node(23);
        head.next.next.next.next.next.next = new Task5.Node(10);
        head.next.next.next.next.next.next.next = new Task5.Node(22);
        head.next.next.next.next.next.next.next.next = new Task5.Node(5);

        // Create Task5 object for calling non-static method findDup()
        Task5 obj = new Task5();

        System.out.println("Original Linked List:");
        printList(head);
        System.out.println();

        // -------- Test Task A --------
        System.out.println("Max Value = " + Task5.findMax_recursive(head));
        System.out.println();

        // -------- Test Task B (Recursive Selection Sort) --------
        Task5.sortLL_recursive(head);
        System.out.println("Sorted Linked List:");
        printList(head);
        System.out.println();

        // -------- Test Task C (Find Duplicates) --------
        System.out.println("Duplicates Report:");
        obj.findDup(head);
    }

    // Helper to print the list
    static void printList(Task5.Node head) {
        Task5.Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }


}
