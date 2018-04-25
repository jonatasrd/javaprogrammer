package arrays.arraylist.exercicios;

import java.util.ArrayList;
import java.util.Iterator;

class Teste8{

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();

        a.add(0, "b"); 
        a.add(0, "a"); 

        for (Iterator<String> i = a.iterator(); i.hasNext(); i.next()){
            String element = i.next();
            System.out.println(element);
        }
        
    }
}