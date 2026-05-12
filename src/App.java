public class App {
    public static void main(String[] args) throws Exception {
        Ejercicios ejercicios=new Ejercicios();
        System.out.println("Ejercicio 1");
        int rest1 = ejercicios.sumaConsecutivos( 5);
        System.out.println(rest1);


        int resultadosdos= ejercicios.sumaConsecutivosPasos(5);
        System.out.println(resultadosdos);


        System.out.println("Ejercicios 2");
        int result2=ejercicios.getPotencia(2, 5);
        System.out.println(result2);


        System.out.println("Ejercicio 3");
        int resultado3=ejercicios.SumaDigitos(456);
        System.out.println(resultado3);
    }





}
