package arrays.arraylist.exercicios;

import java.util.ArrayList;

class Teste4{
    public static void main(String[] args) {
        ArrayList<String> c = new ArrayList<>();
        c.add("a"); c.add("b");
        c.add("a"); c.add("c");
        c.add("a"); c.add("b");
        c.add("a"); 
        System.out.println(c.lastIndexOf("b"));
        
    }
}