public class LL {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        if(head==null){
            return;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        if(head==null) return;
        Node newNode = new Node(data);
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.next = null;
    }
    public void size(){
        Node curNode = head;
        int count = 0;
        while (curNode!=null) {
            count++;
            curNode = curNode.next;
        }
        System.out.println("the size of the array is:=> "+count);
    }
    public static void main(String[] args) {
        
    }
}
