import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int[] numeros = new int[5];
        int contador = 0;

        for (int j = 0; j < 5; j++){
            System.out.println("Ingrese un numero");
            numero = teclado.nextInt();
            numeros[j] = numero;
        }

        do {
            System.out.print(numeros[contador]);
            contador ++;
        }while (contador < numeros.length);

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > mayor){
                mayor = numeros[i];
            } else{
                menor = numeros[i];
            }
        }
        System.out.println("");
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);

        int suma = 0;
        for (contador = 0; contador < numeros.length; contador++){
            suma += numeros[contador];
        }
        System.out.println("El promedio de numeros es: " + suma/(float)numeros.length);

        System.out.println("Esta linea le agregue para probar Git");
    }
}