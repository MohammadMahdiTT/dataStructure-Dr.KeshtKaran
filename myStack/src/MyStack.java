public class MyStack {
    private int capacity = 1000;
    private int[] stack = new int[capacity];
    private int last = -1;

    public void push(int x)
    {
        if (last == capacity - 1)
        {
            capacity += capacity;
            int[] newStack = new int[capacity];
            for (int i = 0; i <= last; i++) {
                newStack[i] = stack[i];
            }
            stack = newStack;
            System.out.println("Stack resized to " + capacity);
        }
        stack[++last] = x;
    }

    public int pop() {
        if (last == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[last--];
    }

    public int top()
    {
        if (last == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[last];
    }

    public int size()
    {
        return last + 1;
    }

    public boolean empty()
    {
        return last == -1;
    }

    public void clear()
    {
        last = -1;
    }
}
