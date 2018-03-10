package javabasics.structurejavaclass.exercicios;

import java.util.*;

class Test1{

    public static void main(String[] args) {
        ArrayList<String> existing = new ArrayList<String>();

       for (String arg : args) {
            if (new E().exists(arg))
                existing.add(arg);
        }
    }
}

import java.io.*; //esse import no meio do NADAS

class E {
    public boolean exists(String name) {
        File f = new File(name);
        return f.exists();
    }
}

//não compila