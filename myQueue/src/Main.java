public class Main {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println("Front: " + q.front());
        System.out.println("Size: " + q.size());

        q.pop();
        System.out.println("After pop, front: " + q.front());

        q.clear();
        System.out.println("Is empty? " + q.empty());

        for (int i = 0; i < 1100; i++)
            q.push(i);
        System.out.println("Size after reallocation: " + q.size());
    }
}
