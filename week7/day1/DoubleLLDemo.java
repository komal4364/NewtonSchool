public class DoubleLLDemo {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.AddNodeAtHead(4);
        dll.AddNodeAtHead(3);
        dll.AddNodeAtHead(2);
        dll.print();
        System.out.println(dll.Size());
        dll.AddNodeAtHead(1);
        dll.print();
        System.out.println(dll.Size());
    }
}
