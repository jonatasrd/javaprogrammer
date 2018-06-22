package whileloops.dowhile.exercicios;

class Teste2{
    public static void main(String[] args) {
        if(args.length < 10){
            do {
                if(args.length>2)return;
            } while (true);
        }
        System.out.println("finished");
    }
}

//Compila e entra em loop infinito caso seja passado zero, um ou dois argumentos. 
//Não imprime nada caso 3 a 9 argumentos. Imprime 'finished' caso 10 ou mais argumentos