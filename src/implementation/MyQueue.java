package implementation;

import myinterface.QueueADT;

public class MyQueue<E> implements QueueADT<E> {
    private E[] arr;
    private int front;
    private int rear;
    private int size;

    public MyQueue(E[] arr) {
        this.arr = arr;
        front = 0;
        rear = 0;
        size = 0;
    }

    @Override
    public void enqueue(E data) {
        if(size != arr.length ){
            arr[rear] = data;
            size++;
            rear++;
        }
        else{
            System.out.println("queue overflow");
        }
    }

    @Override
    public E dequeue() {
        E response = null;
        if(!isEmpty()){
            response = arr[front];
            front++;
            size--;
        }
        else {
            System.out.println("queue underflow");
        }
        return response;
    }

    @Override
    public E peek() {
        E response = null;
        if(!isEmpty()){
            response = arr[front];
        }
        else{
            System.out.println("invalid state of queue");
        }
        return response;
    }

    @Override
    public boolean isEmpty() {
        return size == 0; // front == rear;
    }

    @Override
    public int size() {
        return size;
    }
    public void traverse(){
        System.out.println("printing queue elements");
        System.out.print("front<--");
        for (int i = front; i < rear; i++) {
            System.out.print(arr[i] + "<--");
        }
        System.out.println("rear");
    }
}
