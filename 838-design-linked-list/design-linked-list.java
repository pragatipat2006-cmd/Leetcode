// class MyLinkedList {

//     class Node{
//         int value;
//         Node next;

//         Node(int val){
//             this.value = val;
//             this.next = null;
//         }

//     }

//     Node head;

//     public MyLinkedList() {
//         head = null;
//     }
    
//     public int get(int index) {
//         if(index < 0)
//             return -1;
//         Node temp = head;
//         for(int i = 0 ; i < index; i++){
//             temp = temp.next;
//         }
//         return temp.value;
//     }
    
//     public void addAtHead(int val) {
//         Node newNode = new Node(val);
//         if(head == null)
//             head = newNode;
//         else{
//             newNode.next = head;
//             head = newNode;
//         }
//     }
    
//     public void addAtTail(int val) {
//         Node newNode = new Node(val);
//         if(head == null)
//             head = newNode;
//         else{
//             Node temp = head;
//             while(temp.next != null){
//                 temp = temp.next;
//             }
//             temp.next = newNode;
//         }
//     }
    
//     public void addAtIndex(int index, int val) {
//         Node newNode = new Node(val);
//         if(index<0)
//             return;
//         if (index == 0) {
//             addAtHead(val);
//             return;
//         }
//             Node temp = newNode;
//             for(int i = 0 ; i < index - 1 ; i++){
//                 temp = temp.next;
    
//             newNode.next = temp.next;
//             temp.next = newNode;
//         }
//     }
    
//     public void deleteAtIndex(int index) {
//         if(index<0)
//             return;
//          if (index == 0) {
//             head = head.next;
//             return;
//         }

//         Node temp = head;

//         for (int i = 0; i < index - 1; i++) {
//             temp = temp.next;
//         }

//         temp.next = temp.next.next;
//     }
// }

// /**
//  * Your MyLinkedList object will be instantiated and called as such:
//  * MyLinkedList obj = new MyLinkedList();
//  * int param_1 = obj.get(index);
//  * obj.addAtHead(val);
//  * obj.addAtTail(val);
//  * obj.addAtIndex(index,val);
//  * obj.deleteAtIndex(index);
//  */



class MyLinkedList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    Node head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;

        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }

        if (index == 0) {
            head = head.next;
            size--;
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
    }
}
