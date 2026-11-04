public class Stack {

    private int top = -1;
    private int size = 0;
    private int values[];

    public void Stack(int sizeOfStack) {
        this.values = new int[sizeOfStack];
        this.size = sizeOfStack;
    }

    public void push(int value) {
        this.top++;
        this.values[this.top] = value;
    }

    public int peek() {
        return this.values[this.top];
    }

    public int pop(){
        int index = this.top;
        this.top--;
        return this.values[index];
    }
}