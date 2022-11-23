package Ejercicio7;

public class Perro {
    /**
     * Atributos.
     * @param pelo,color.
     * @param chip,peso,altura.
     */

    private  String pelo,color;
    private  int  chip,peso,altura;
    /**
     * Getter.
     * @return pelo.
     */

    public String getPelo(){
        return pelo;
    }
    /**
     * Getter.
     * @return color.
     */

    public String getColor(){
        return color;
    }
    /**
     * Getter.
     * @return chip.
     */

    public int getChip(){
        return chip;
    }
    /**
     * Getter.
     * @return peso.
     */

    public int getPeso() {
        return peso;
    }
    /**
     * Getter.
     * @return altura.
     */

    public int getAltura() {
        return altura;
    }
    /**
     * Setter.
     * @param  pelo a definir.
     */

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }
    /**
     * Setter.
     * @param  color a definir.
     */

    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Setter.
     * @param  chip a definir.
     */

    public void setChip(int chip) {
        this.chip = chip;
    }
    /**
     * Setter.
     * @param  peso a definir.
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }
    /**
     * Setter.
     * @param  altura a definir.
     */
    public void setAltura(int altura) {
       this.altura = altura;
    }
    /**
     * Metodo para ladrido (valores a consultar).
     * @param peso,altura.
     * @return ladra.
     */

    public static String ladrar(int peso, int altura){
        String ladra="";
        if (peso>10 && altura>30){
            System.out.println("GUAU!");

        }else {
            System.out.println("guau");
        }
        return ladra;
    }
}
