public class Task4 {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }

// Task 4A: Print elements in reverse order
    void task4A_recursive(Node head){
        if (head==null) return;
        task4A_recursive(head.next);
        System.out.println(head.val);
    }

// Task 4B: Reverse the linked list and return new head
    Node task4B_recursive(Node head){
        if (head==null||head.next==null){
            return head;
        }
        Node nh=task4B_recursive(head.next);
        head.next.next=head;
        head.next=null;
        return nh;
    }
//\\//\\//\\//\\//\\//\\//\\TESTER//\\//\\//\\//\\//\\//\\//\\
    public static void main(String[] args){
        Task4 t = new Task4();

        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("===== Original List =====");
        t.printList(head);

        System.out.println("\n===== Task 4A Recursive (Print Reverse) =====");
        t.task4A_recursive(head);

        System.out.println("\n===== Task 4B Recursive (Reverse List) =====");
        head = t.task4B_recursive(head);

        System.out.println("===== Reversed List =====");
        t.printList(head);
    }
    void printList(Node head){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
