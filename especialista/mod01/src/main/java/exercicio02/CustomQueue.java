package exercicio02;

public class CustomQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public CustomQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Erro: A fila está cheia!");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Erro: A fila está vazia!");
            return -1;
        }
        int value = queue[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Erro: A fila está vazia!");
            return -1;
        }
        return queue[front];
    }

    public int rear() {
        if (isEmpty()) {
            System.out.println("Erro: A fila está vazia!");
            return -1;
        }
        return queue[rear];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue());
        System.out.println(queue.front());
        System.out.println(queue.rear());
        System.out.println(queue.size());
    }
}
