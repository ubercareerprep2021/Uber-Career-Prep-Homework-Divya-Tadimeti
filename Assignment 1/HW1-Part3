class Stack {

  private int stack_arr[];

  private int stack_capacity;

  private int top_of_stack;

  Stack(int size) {
    stack_arr = new int[size];
    top_of_stack = -1;
  }
  public void push(int i) {
    if (!isFull()) {
      top_of_stack++:
      stack_arr[top_of_stack] = i;
    }
  }

  public int pop() {
    if (!isEmpty()) {
      top_of_stack--;
      return stack_arr[top_of_stack];
    }
  }

  public int top() {
    return stack_arr[top_of_stack];
  }

  public int size() {
    return top_of_stack + 1;
  }

  public boolean isEmpty() {
    return top_of_stack == -1;
  }

  public boolean isFull() {
    return top_of_stack == size - 1;
  }
}


class Queue {

  private int q_arr[];
  private int q_front;
  private int q_rear;
  private int q_count;

  Queue(int size) {
    q_arr = new int[size];
    q_front = 0;
    q_rear = -1;

  }
  public void enqueue() {

  }

  public int dequeue() {

  }

  public int rear() {
    
  }

  public int front() {
    if (!isEmpty()) {
      return q_arr[q_front];
    }
  }

  public int size() {
    return count;
  }

  public boolean isEmpty() {
    return size() == 0;
  }

  public boolean isFull() {
    return size() == size;
  }

}
