package arrays.arraylist.exercicios;

import java.util.ArrayList;

class Teste6{
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();

        b.add("a"); c.add("c");
        b.add("b"); c.add("d");

        a.addAll(b);
        a.addAll(c);

        System.out.println(a.get(0));
        System.out.println(a.get(3));
        
    }
}