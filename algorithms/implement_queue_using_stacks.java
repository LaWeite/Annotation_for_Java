/*
Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

Implement the MyQueue class:
void push(int x) Pushes element x to the back of the queue.
int pop() Removes the element from the front of the queue and returns it.
int peek() Returns the element at the front of the queue.
boolean empty() Returns true if the queue is empty, false otherwise.
Notes:
You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.
*/

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * MyQueue
 */
public class MyQueue {
    private Deque<Integer> in_stk = new ArrayDeque<>();
    private Deque<Integer> out_stk = new ArrayDeque<>();
    // Push element x to the back of queue...
    public void push(int x) {
        in_stk.push(x);
    }
    // Remove the element from the front of the queue and returns it...
    public int pop() {
        peek();
        return out_stk.pop();
    }
    // Get the front element...
    public int peek() {
        if (out_stk.isEmpty())
        while (!in_stk.isEmpty())
            out_stk.push(in_stk.pop());
        return out_stk.peek();
    }
    // Return whether the queue is empty.
    public boolean empty() {
        return in_stk.isEmpty() && out_stk.isEmpty();
    }
}
