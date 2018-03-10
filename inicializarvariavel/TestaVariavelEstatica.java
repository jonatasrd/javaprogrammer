package inicializarvariavel;

class TestaVariavelEstatica{
    
    public static void main(String[] args) {
        Person p = new Person();

        System.out.println(p.count);
        System.out.println(Person.count);

    }

}