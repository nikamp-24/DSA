public class LinkedList{

        static class Node {
            int data;
            Node next;


            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }


        Node head;


        public void insert(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }

            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }


        public void delete(int key) {
            Node temp = head, prev = null;

            // If head node itself holds the key
            if (temp != null && temp.data == key) {
                head = temp.next;
                return;
            }


            while (temp != null && temp.data != key) {
                prev = temp;
                temp = temp.next;
            }


            if (temp == null) return;


            prev.next = temp.next;
        }


        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }


        public static void main(String[] args) {
            LinkedList list = new LinkedList();

            list.insert(10);
            list.insert(20);
            list.insert(30);
            list.insert(40);

            System.out.println("Linked List:");
            list.printList();

            list.delete(20);
            System.out.println("After deleting 20:");
            list.printList();
        }

}
