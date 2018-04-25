package arrays.arraylist.exercicios;

import java.util.ArrayList;
import java.util.Iterator;

class Teste9{

    public static void main(String[] args) {

        ArrayList<String> ss = new ArrayList<>();

        ss.add("a"); 
        ss.add("b"); 
        ss.add("c");
        ss.add("d");

        for(String s:ss){
            if(s.equals("c")) s = "b";
            else if(s.equals("b"))s = "c";
        }

        for (String s : ss) System.out.println(s);       
    }
}