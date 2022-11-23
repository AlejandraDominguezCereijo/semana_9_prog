package Ejercicio6;

public class Perro {
        private static String pelo,color;
        private static int  chip,peso,altura;



        public String getPelo(){
            return pelo;
        }

        public String getColor(){
            return color;
        }

        public int getChip(){
            return chip;
        }

        public static int getPeso() {
            return peso;
        }

        public static int getAltura() {
            return altura;
        }

        public static void setPelo(String pelo) {
            Perro.pelo = pelo;
        }

        public static void setColor(String color) {
            Perro.color = color;
        }

        public static void setChip(int chip) {
           Perro.chip = chip;
        }

        public static void setPeso(int peso) {
            Perro.peso = peso;
        }

        public static void setAltura(int altura) {
           Perro.altura = altura;
        }

        public String ladrar(){
            String ladra="";
            if (peso>10 && altura>30){
                System.out.println("GUAU!");

            }else {
                System.out.println("guau");
            }
            return ladra;
        }
}
