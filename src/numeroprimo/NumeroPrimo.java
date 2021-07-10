package numeroprimo;


public class NumeroPrimo {
    public static void main(String[] args){
        if(esPrimo(70)){
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
    
    static boolean esPrimo(int numero) {
        int contador = 0;
        
        int[] numeros = new int[numero];
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i+1;
        }
        for(int num: numeros){
            if(num == 1 || num == numero){
                continue;
            }
            if(numero % num == 0){
                contador++;
            }
        }
        
        return contador == 0;
    }
    
}
