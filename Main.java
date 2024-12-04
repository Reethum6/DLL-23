class Dll {
    node head;
    class node {
        int data;
        node next;
        node prev;

        node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }
    public void InsertIntoBegin(int data) {
        node newNode = new node(data);  
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }
    public void printAllNodes() {
        node temp = head;    
        while (temp != null) {
            System.out.print(temp.data + " "); 
            temp = temp.next; 
        }
        System.out.println(); 
    }
}
public class Main {
    public static void main(String[] args) {
        Dll list = new Dll();
        list.InsertIntoBegin(100);
        list.InsertIntoBegin(200);
        list.InsertIntoBegin(300);
        list.printAllNodes();
    }
}