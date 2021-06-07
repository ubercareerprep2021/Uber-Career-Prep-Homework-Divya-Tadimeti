
class Node {
  int data_elem;
  Node next;

  public Node(int data) {
      data_elem = data;
      next = null;
  }

  public Node (int data, Node n) {
      data_elem = data;
      next = n;
  }
}

class LinkedList {
  Node head;

  public LinkedList() {
      head = null;
  }


  public void push(int data) {
      if (head != null) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);

      } else {
          head = new Node(data);
      }
  }

  public Node pop() {
      if (head != null) {
        Node temp = head;
        Node prev = null;

        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }

        Node popNode = temp;
        prev.next = temp.next;
        return popNode;

      } else {
          return null;
      }
  }

  public void insert(int index, Node node) {

  }

  public void remove(int index) {

  }


  public Node elementAt(int index) {

  }

  public int size() {
      int size = 0;
      Node temp = head;

      while (temp != null) {
          size++;
          temp = temp.next;
      }
      return size;
  }

  public void printList() {
      String listString = "";
      Node temp = head;


      while (temp != null) {
          listString = listString + temp.data_elem;
          if (temp.next != null) {
              listString = listString + "->";
          }
          temp = temp.next;
      }
      System.out.println(listString);
  }
