package arrays.arraylist.exercicios;

import java.util.ArrayList;

class Teste3{
    public static void main(String[] args) {
        ArrayList<String> c = new ArrayList<>();
        c.add("a");
        c.add("a");
        System.out.println(c.remove("a"));
        System.out.println(c.size());
    }
}