package main.java.Stack;

public class Stack {
    int top;
    int stackArray[];
    int maxSize;
    Stack(int s){
        this.maxSize = s;
        top = -1;
        stackArray = new int[maxSize];
    }
    public void push(int data){
        if(isFull()){
            System.out.println("Stack overflow");
            return;
        }
        //top = -1 Size = 2
        //index = 0, top = 0
        //index = 1, top = 1

        top = top +1;
        stackArray[top] = data;
    }
    public  boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(top == maxSize-1){
            return true;
        }
        return false;
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return;
        }
        System.out.println("element at the top "+stackArray[top]);
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return 0;
        }
//        top = top -1;
        //top =2
        //stackArray[1] top =1
        return stackArray[top--];
    }
    public static void main(String[] args) {
        Stack stack = new Stack(2);
        stack.push(1);
        stack.push(2);
        stack.peek();
        System.out.println("popped element: "+ stack.pop());
        stack.peek();
    }
}
