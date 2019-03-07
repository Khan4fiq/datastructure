
package tutorial.pkg3;

public class MyArray {

    public static void main(String[] args) {
        Integer[] number = {1,2,3,4,5};
        String[] name = {"Elsa","Eric","Tom"};
        Character[] alpha = {'a','b','c'};
        MyArray.listAll(number);
        MyArray.listAll(name);
        MyArray.listAll(alpha);

    }
    public static <E> void listAll(E[] list){
        for(int i=0; i<list.length;i++){
            System.out.println(list[i]+" ");
        }
        System.out.println();
    }
}
