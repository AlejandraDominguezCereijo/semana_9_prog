package Ejercicio6;

import java.util.Scanner;

public class objeto6 {
    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);
        Perro atributo= new Perro();


        System.out.println("El peso de mi perro es: ");
        Perro.setPeso(cubrir.nextInt());
        System.out.println("La altura de mi perro es: ");
        Perro.setAltura(cubrir.nextInt());


        atributo.ladrar();
    }
}
