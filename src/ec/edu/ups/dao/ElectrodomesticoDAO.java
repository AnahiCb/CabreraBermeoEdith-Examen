/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;
import ec.edu.ups.idao.IElectrodomesticoDAO;
import ec.edu.ups.modelo.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Anahi
 */
public class ElectrodomesticoDAO implements IElectrodomesticoDAO {
    private List<Electrodomestico> listaElectrodomestico;

    public ElectrodomesticoDAO() {
        listaElectrodomestico = new ArrayList<>();
    }
    
    @Override
    public void create(Television television){
        listaElectrodomestico.add(television);
    }
    
    @Override
    public void create(Lavadora lavadora){
        listaElectrodomestico.add(lavadora);
    }
    public List<Lavadora> listarLavadora(){
       
    }
    public List<Television> listarTelevision(){
        
    }
    
}
