package com.Sayan;

public class MyStack {
    static final int Max = 7;
    int top;
    int a[] = new int[Max];

    MyStack ()
    {
        top = -1;
    }
    boolean push (int data){
        if(top >= (Max-1))
        {
            System.out.println ("Stack Overflow ");
            return false;
        }
        else {
            top = top+1;
            a[top] = data;
            System.out.println ("Data added to stack");
            return true;

        }
    }
    int pop(){
        if (top==-1){
            System.out.println ("Stack is empty");
            return 0;

        }
        else {
            int x = a[top];
            top = top -1;
            return x;
        }
    }
    int peek() {
        if (top == -1){
            System.out.println ("Stack is empty");
            return 0;
        }
        else {
            int x = a[top];
            return x;
        }
    }
    boolean isEmpty(){
        return (top<0);
    }
    boolean isFull(){
        return (top>=Max-1);
    }
    int size (){
        return (top+1);

    }
}
