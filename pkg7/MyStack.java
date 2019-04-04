
package week.pkg7;

import java.util.Stack;

public class MyStack<E> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();
    
    public int getSize(){
        return list.size();
    }
    
    public E peek(){
        return list.get(getSize()-1);
    }
    
    public void push(E o){
        list.add(o);
    }
    
    public E pop(){
        E o = list.get(getSize()-1);
        list.remove(getSize()-1);
        return o;
    }
    
    public  String search(E o){
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals(o)){
                return "The character "+"["+o+"]"+" is exist";
            }
        }
    return "The character does not exist ";        
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    public String toString(){
        return "Stack: "+list.toString();
    }
}
