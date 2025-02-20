package exercicio01;

public class CustomStack {
    private int[] stack;
    private int top;
    private int capacity;

    public CustomStack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Erro: A pilha está cheia!");
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Erro: A pilha está vazia!");
            return -1;
        }
        return stack[top--];
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Erro: A pilha está vazia!");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop()); // 30
        System.out.println(stack.top()); // 20
        System.out.println(stack.size()); // 2
    }
}


