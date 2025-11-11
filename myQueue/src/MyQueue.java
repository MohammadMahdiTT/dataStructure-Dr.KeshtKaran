public class MyQueue {
    private int capacity = 1000;
    private int[] queue = new int[capacity];
    private int first = 0;
    private int last = -1;
    private int count = 0;     // useful for size

    public void push(int x)
    {
        if (count == capacity)
        {
            capacity += 1000;
            int[] newQueue = new int[capacity];
            for (int i = 0; i < count; i++)
            {
                newQueue[i] = queue[(first + i) % count];
            }
            queue = newQueue;
            first = 0;
            last = count - 1;
            System.out.println("Queue resized to " + capacity);
        }

        last = (last + 1) % capacity;
        queue[last] = x;
        count++;
    }

    public int pop()
    {
        if (empty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = queue[first];
        first = (first + 1) % capacity;
        count--;
        return value;
    }

    public int front()
    {
        if (empty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[first];
    }

    public int size()
    {
        return count;
    }

    public boolean empty()
    {
        return count == 0;
    }

    public void clear()
    {
        first = 0;
        last = -1;
        count = 0;
    }
}
