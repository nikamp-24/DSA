public class LinkedList{

        // Node class (each node holds data and a reference to the next node)
        static class Node {
            int data;
            Node next;

            // Constructor
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        // Head node of the list
        Node head;

        // Insert a node at the end
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

        // Delete a node by value
        public void delete(int key) {
            Node temp = head, prev = null;

            // If head node itself holds the key
            if (temp != null && temp.data == key) {
                head = temp.next;
                return;
            }

            // Search for the key to be deleted
            while (temp != null && temp.data != key) {
                prev = temp;
                temp = temp.next;
            }

            // If key was not present
            if (temp == null) return;

            // Unlink the node
            prev.next = temp.next;
        }

        // Display the linked list
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }

        // Main method for testing
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
