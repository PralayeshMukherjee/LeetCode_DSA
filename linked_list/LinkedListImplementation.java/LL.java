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
    public void deleteFirst(){
        head = head.next;
    }
    public void deleteLast(){
        Node currNode = head;
        while(currNode.next.next!=null){
            currNode = currNode.next;
        }
        currNode.next = null;
        return;
    }
    public void addInPos(int data,int position){
        Node node = new Node(data);
        int count = 0;
        Node currNode = head;
        while(currNode!=null && count<position){
            currNode = currNode.next;
            count++;
        }
        node.next = currNode.next.next;
        currNode.next = node;
    }
    public void print(){
        Node currNode = head;
        while (currNode!=null) {
            System.out.println(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(8);
        list.addFirst(9);
        list.addFirst(5);
        list.addFirst(23);
        list.print();
    }
}
