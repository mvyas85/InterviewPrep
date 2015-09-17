package stackMinO1;

import java.util.Stack;
// This is the text editor interface. 
// Anything you type or change here will be seen by the other person in real time.



// Design a stack that supports push, pop, and retrieving the minimum element in constant time. 
public class TestStack{
    public static void main (String args[]){
        SpecialStack myStack = new SpecialStack();
        
        System.out.println("is Empty="+ myStack.isEmpty());
        
        myStack.push(1);
        myStack.push(5);
        myStack.push(0);
        myStack.push(4);
        
       System.out.println("Min="+myStack.getMin());
       System.out.println(myStack.pop());//4
       System.out.println( "Min="+ myStack.getMin());
       
       System.out.println(myStack.pop());//0
       
       System.out.println("Min="+myStack.getMin());
       
       System.out.println( myStack.pop());
       
       System.out.println( "Min="+ myStack.getMin());
       System.out.println( myStack.pop());
       
       System.out.println(  "Min="+myStack.getMin());
        
    }
}

class SpecialStack extends Stack<Integer>{
    
    Stack<Integer> min;
    
    SpecialStack(){
        min = new Stack<Integer>();
    }
    
    public void push(int newEle){
        if(isEmpty()){
            super.push(newEle);
            min.push(newEle);
        }
        else{
            int minEle = (int) min.peek();
            if(newEle<minEle){
                min.push(newEle);
            }else {
                min.push(minEle);
            }
            super.push(newEle);
        }
    }
    public Integer pop(){;
        min.pop();
        return super.pop();
        
    }
    public int getMin(){
    	if(min.isEmpty())
    		return -1;
        return  min.peek();
    }
}

//class Stack {
//    int Max;
//    int arr[];
//    int top;
//    
//    Stack(int max){
//        this.Max = max;
//        arr = new int[Max];
//        top = -1;
//    }
//    
//    public void push(int x){
//        if(isFull()){
//            System.out.println("Sorry stack is full !");
//            return;
//        }
//        top ++;
//        arr[top] = x;
//    }
//    public int pop(){
//        if(isEmpty()){
//            System.out.println("Sorry stack is empty !");
//            return -1;
//        }
//        int x = arr[top];
//        top--;
//        return x;
//    }
//    public int peek(){
//    	return arr[top];
//    }
//    
//    public boolean isEmpty(){
//        if(top == -1){
//            return true;
//        }
//        return false;
//
//    }
//    public boolean isFull(){
//        if(top == Max - 1){
//            return true;
//        }
//        return false;
//    }
//}
	