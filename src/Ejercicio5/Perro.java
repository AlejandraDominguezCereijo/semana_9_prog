package Ejercicio5;

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

    public void setPelo(String pelo) {
            this.pelo = pelo;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setChip(int chip) {
            this.chip = chip;
        }

    public static void setPeso(int peso) {
        Perro.peso = peso;
    }

    public static void setAltura(int altura) {
        Perro.altura = altura;
    }
}

