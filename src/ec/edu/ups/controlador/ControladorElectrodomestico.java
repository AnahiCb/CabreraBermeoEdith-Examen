/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.vista.VistaElectrodomestico;
import ec.edu.ups.idao.IElectrodomesticoDAO;
import ec.edu.ups.modelo.*;
import ec.edu.ups.vista.VistaElectrodomestico;
import java.util.List;
/**
 *
 * @author Anahi
 */
public class ControladorElectrodomestico {
    private VistaElectrodomestico vista;
    private Electrodomestico modelo;
    private IElectrodomesticoDAO dao;

    public ControladorElectrodomestico(VistaElectrodomestico vista, Electrodomestico modelo, IElectrodomesticoDAO dao) {
        this.vista = vista;
        this.modelo = modelo;
    }
    public void registrarTelevision(){
        modelo= vista.ingresarTelevision();
        dao.create(television);
    }
    public void registrarLavadora(){
        modelo= vista.ingresarLavadora();
        dao.create(lavadora);
    }
    public void verLavadoras(){
        List<Lavadora> lavadoras;
        lavadoras=dao.listarLavadora();
        vista.mostrarLavadoras(lavadoras);
    }
    public void verTelevisiones(){
        List<Television> televisiones;
        televisiones=dao.listarTelevision();
        vista.mostrarTelevisiones(televisiones);
    }
}
