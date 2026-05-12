public class Ejercicios {
    public Ejercicios(){

    }
    //Suma de enteros consecutivos
    public int sumaConsecutivos(int num){//5
        //Caso base
        System.out.println("El num es "+ num);
        if(num ==0){//cuando tiene una sola linea desues del if se puede no poner llaves
            
            return num;


        }
        //Parte recursiva
        return num + sumaConsecutivos( num -1);
    }


    public int sumaConsecutivosPasos(int num){//5
        //Caso base
        System.out.println("El num es "+ num);
        if(num ==1){//cuando tiene una sola linea desues del if se puede no poner llaves
            return num;


        }
        //Parte recursiva
        int resultadoRecursivo=sumaConsecutivosPasos( num -1);
        int resultadoOperacion= num + resultadoRecursivo;
        System.out.println("resultadoOp= " + resultadoOperacion +  "= " + num + "+ " +  "sumaConsecutivosPasos(" + (num -1) + ")");
        return resultadoOperacion;
    }
    


    //Potencia de una numero: Escribe una funcion recuersiva que 
    // calcule la potenciaq de un numero base elevado a un exponente entero
    // por ejemplo, si base es 2 y expoonete es 3,
    // la funcion debe devolver 2¨3=8

    public int getPotencia(int base, int exponente){
        if(exponente==1)
            return base;
        return base * getPotencia(base, exponente-1);
    }



    public int SumaDigitos(int num){
        //Mi caso base

        if(num<10)
            return num;

        //Caso recuersivo
        return (num%10) + SumaDigitos(num/10);

        
    }
}
