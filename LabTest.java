package lab.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LabTest {

    public static void main(String[] args) throws FileNotFoundException {
try{
    Scanner s = new Scanner(new FileReader("message-enc.txt"));
        while(s.hasNextLine()){
            String code = s.nextLine();
                String[] word = code.split("[.]");
                    int num = word.length;
                        System.out.println(code);
                            System.out.println("Number of words : " + num);

            for(int i=0;i<word.length;i++){
                System.out.println(word[i]);
            }
            
}
s.close();
}catch(IOException e){
    System.out.println("");
}
}
}


    

