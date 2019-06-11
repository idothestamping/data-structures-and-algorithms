package queueWithStacks;

import stacks_and_queues.Stack;

public class PseudoQueue<T> {

    protected Stack<T> inStack;
    protected Stack<T> outStack;

    //Constructor
    public PseudoQueue(){
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void enqueue(T value){
        inStack.push(value);
    }

    public T dequeue(){
        T result = null;
        if(inStack.getTop() != null) {
            copyStack(inStack, outStack);
            result = outStack.pop();
            copyStack(outStack, inStack);
        }
        return result;
    }

    //Helper method to copy stack
    private void copyStack(Stack<T> from, Stack<T> to){

        while(from.getTop() != null){
            T value = from.pop();
            to.push(value);
        }
    }


}