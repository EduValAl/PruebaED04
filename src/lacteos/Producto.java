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
public class Producto {

    private String tipo;
    private int cantidad_leche;
    private double peso;

    /**
     * Constructor sin parametros
     */
    public Producto() {
    }

    /**
     *
     * @param tipo_leche
     * @param cantidad_leche
     * @param peso
     */
    public Producto(String tipo_leche, int cantidad_leche, double peso) {
        this.tipo = tipo_leche;
        this.cantidad_leche = cantidad_leche;
        this.peso = peso;
    }

    /**
     *
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     *
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
     * Metodo que nos permite imprimir_cabecera la etiqueta del queso
     */
    public void imprimir_cabecera() {
        System.out.println("QUESERÍA ARTESANA TALAVERA DE LA REINA");
        System.out.println("Registro Sanitario Nº 48/38751");
        System.out.println("Para consultar el lote del producto revise la etiqueta");
        imprimir_detalle();
    }

    private void imprimir_detalle() {
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Tipo de leche: " + this.getTipo());
        System.out.println("Cantidad de leche: " + this.getCantidad_leche());
    }

}
