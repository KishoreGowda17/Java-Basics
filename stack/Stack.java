package stack;

public class Stack {

    int[] stack;
    int top = -1;
    int size = 0;

    public Stack(int size) {
        this.stack = new int[size];
        this.size = size;
    }

    public void push(int data) {
        if (top == size - 1) {
            return;
        }
        top++;
        stack[top] = data;

    }

    public int pop() {
        if (top == size - 1) {
            return -1;
        }

        int data = stack[top];
        top--;
        return data;

    }

    public int peek() {

    }
}
