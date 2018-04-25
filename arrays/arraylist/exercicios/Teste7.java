package arrays.arraylist.exercicios;

import java.util.ArrayList;

class Teste7{

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();

        a.add("a", 0); 
        a.add("b", 0); 
        a.add("c", 0);
        a.add("d", 0);

        System.out.println(a.get(0));
        System.out.println(a.get(1));
        System.out.println(a.get(2));
        System.out.println(a.get(3));
        
    }
}