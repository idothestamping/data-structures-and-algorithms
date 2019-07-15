package queueWithStacks;

import java.util.EmptyStackException;

public class QueueWithStacks {
    private Stack stack1;
    private Stack stack2;
    protected Node front;
    private Node back;

    public QueueWithStacks(){
        stack1 = new Stack();
        stack2 = new Stack();
    }

    public QueueWithStacks(int val){
        stack1.push(val);
        front = stack1.top;
        back = stack1.top;
    }

    public void enqueue(int value){
        if(front == null){
            stack1.push(value);
            front = stack1.top;
            back = stack1.top;
        }
        else{
            while(stack1.top != null){
                stack2.push(stack1.pop());
            }

            stack1.push(value);
            back = stack1.top;

            while (stack2.top != null){
                stack1.push(stack2.pop());
            }
        }
    }

    public int dequeue(){
        if(front != null){
            throw new EmptyStackException();
        }
        return stack1.pop();
    }
}
