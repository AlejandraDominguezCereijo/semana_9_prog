
/**
 * Ejercicio: Perro
 *
 * @author Alejandra Dominguez Cereijo
 * @version 22.11.2022
 */

package Ejercicio7;

import java.util.Scanner;

public class objeto7 {
    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);
        Perro atributo = new Perro();
        Perro perro1=new Perro();
        Perro perro2=new Perro();
        Perro perro3=new Perro();



        perro1.setChip(25);
        perro1.setPelo("sedoso");
        perro1.setColor("blanco");
        perro1.setPeso(20);
        perro1.setAltura(20);

        perro2.setPelo("Liso");
        perro2.setColor("Verde");
        perro2.setChip(8989999);
        perro2.setPeso(1);
        perro2.setAltura(1);

        perro3.setPelo("Liso");
        perro3.setColor("Verde");
        perro3.setChip(8989999);
        perro3.setPeso(34);
        perro3.setAltura(35);

        Perro[] Perros = new Perro[3];
        Perros[0] = perro1;
        Perros[1] = perro2;
        Perros[2] = perro3;


        //System.out.println("El peso de mi perro es: ");
        //perro.setPeso(cubrir.nextInt());
        //System.out.println("La altura de mi perro es: ");
        //perro.setAltura(cubrir.nextInt());

        for (int i = 0; i < Perros.length; i++) {
            System.out.println(Perro.ladrar(Perros[i].getPeso(), Perros[i].getAltura())+" la posicion es "+i);
            }


            //atributo.ladrar();


        }
    }

