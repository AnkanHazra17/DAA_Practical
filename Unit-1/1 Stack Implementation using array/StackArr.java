
class ImpStack<T> {
    private T data[];
    private int top;

    public ImpStack() {
        this.data = (T[]) new Object[10];
        this.top = -1;
    }

    public ImpStack(int capacity) {
        this.data = (T[]) new Object[capacity];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public T peek() {
        return data[top];
    }

    public int size() {
        return top + 1;
    }

    public void push(T ele) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }

        top++;
        data[top] = ele;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }
        T temp = data[top];
        top--;
        return temp;
    }
}

public class StackArr {

    public static void main(String[] args) {
        ImpStack<Integer> ist = new ImpStack<>();

        System.out.println("Stack of int");
        for (int i = 1; i <= 5; i++) {
            ist.push(i);
        }

        System.out.println("Peek element is: " + ist.peek());
        System.out.println("Size of the Stack is: " + ist.size());

        while (!ist.isEmpty()) {
            System.out.println(ist.pop() + " is popped from the stack");
        }

    }
}