
package tutorial.pkg3;

public class Tutorial3 {

    public static void main(String[] args) {
        Container<String> strContainer = new Container<String>();
        Container<Integer> intContainer = new Container<Integer>();

            strContainer.add(new String("Java"));
            intContainer.add(new Integer(50));

                System.out.println("String Value : " + strContainer.retrieve());
                System.out.println("Integer Value : " + intContainer.retrieve());

    }
    
    public static class Container<T>{
        
            private T t;
    
    public void add(T t){
        this.t = t;
    }
    
    public T retrieve(){
        return t;
    }
}
    
}