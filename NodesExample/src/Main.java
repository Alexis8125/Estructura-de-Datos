import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lista I  = new Lista();
        int num = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero diferente a (o)");
        while (num !=0){
            num = sc.nextInt();
            I.IngresarDato(num);
        }

        System.out.println("Los numeros digitados fueron:");
        I.desplegar();

        //TAREA: Que hariamos en este ejericicio, para que imprima en el orden que ingresan los datos, es decir si primero entro el 5 sea el primero en imprimir en pantalla
    }
}