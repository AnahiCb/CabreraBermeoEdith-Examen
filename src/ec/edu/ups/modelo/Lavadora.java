/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Anahi
 */
public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora(int codigo) {
        super(codigo);
    }

    public Lavadora() {
    }

    public Lavadora(int carga, int codigo, String descripcion, double precioBase, String color, char consumo, int peso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public double obtenerPrecioFinal() {
        double precio=0;
        if (carga>30){
            precio=precio+50;
        }
        return super.obtenerPrecioFinal();
    }
    

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }
    
}
