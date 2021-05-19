/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacteos;

/**
 *
 * @author Eduardo
 */
public class Queso {

    String tipo_leche;
    int cantidad_leche;
    double peso;

    /**
     * Constructor sin parametros
     */
    public Queso() {
    }

    /**
     *
     * @param tipo_leche
     * @param cantidad_leche
     * @param peso
     */
    public Queso(String tipo_leche, int cantidad_leche, double peso) {
        this.tipo_leche = tipo_leche;
        this.cantidad_leche = cantidad_leche;
        this.peso = peso;
    }

    /**
     *
     * @return
     */
    public String getTipo_leche() {
        return tipo_leche;
    }

    /**
     *
     * @param tipo_leche
     */
    public void setTipo_leche(String tipo_leche) {
        this.tipo_leche = tipo_leche;
    }

    /**
     *
     * @return
     */
    public int getCantidad_leche() {
        return cantidad_leche;
    }

    /**
     *
     * @param cantidad_leche
     */
    public void setCantidad_leche(int cantidad_leche) {
        this.cantidad_leche = cantidad_leche;
    }

    /**
     *
     * @return
     */
    public double getPeso() {
        return peso;
    }

    /**
     *
     * @param peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Metodo que nos permite imprimir la etiqueta del queso
     */
    public void imprimir() {
        System.out.println("QUESERÍA ARTESANA TALAVERA DE LA REINA");
        System.out.println("Registro Sanitario Nº 48/38751");
        System.out.println("Para consultar el lote del producto revise la etiqueta");
        System.out.println("Peso: " + this.peso);
        System.out.println("Tipo de leche: " + this.tipo_leche);
        System.out.println("Cantidad de leche: " + this.cantidad_leche);
    }

}
