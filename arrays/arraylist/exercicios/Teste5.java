package arrays.arraylist.exercicios;

import java.util.ArrayList;

class Teste5{
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("a"); 
        l.add("b");
        l.add(1, "amor"); 
        l.add(3, "love"); 

        System.out.println(l);

        String[] array = l.toArray();
        System.out.println(array[2]);
        
    }
}