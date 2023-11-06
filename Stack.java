public class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if(top < maxSize - 1) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack is full. Can't push " + value);
        }
    }

    public int pop() {
        if(top >= 0) {
            return stackArray[top--];
        } else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
    public static void main(String[] args) {
        Stack stack = new Stack(10);

        // Push elements
        for(int i = 0; i < 11; i++) {
            stack.push(i);
        }

        // Pop elements
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

