public class MaxHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.size=0;
        heap = new int[capacity+1];
    }

    public void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap is full");
        }

        size++;
        heap[size]=value;

        UpHeapify(size);
    }

    private void UpHeapify(int index) {
        while (index > 1 && heap[index] > heap[index/2]) {
            Swap(index,index/2);
            index = index/2;
        }
    }

    private void Swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public int extractMax() {
        if (size == 0) {
            System.out.println("Heap is empty");
        }

        int max = heap[1];
        heap[1] = heap[size];
        size--;

        DownHeapify(1);
        return max;
    }

    private void DownHeapify (int index) {
        while (2 * index <= size) {
            int left = 2 * index;
            int right = 2 * index + 1;

            int largest = left;

            if (right <= size && heap[right] > heap[left]) {
                largest = right;
            }
            if (heap[index] >= heap[largest]) {break;}

            Swap(index, largest);
            index = largest;
        }
    }

    public int Peek()
    {
        if (size == 0) {
            System.out.println("Heap is empty");
        }
        return heap[1];
    }
}
