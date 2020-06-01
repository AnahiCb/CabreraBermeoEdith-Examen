/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;
import ec.edu.ups.modelo.*;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Anahi
 */
public class VistaElectrodomestico {
    private Scanner entrada;

    public VistaElectrodomestico() {
        entrada= new Scanner(System.in);
    }
    public Television ingresarTelevision(){
        entrada= new Scanner(System.in);
        System.out.println("Ingrese el codigo");
        int codigo= entrada.nextInt();
        System.out.println("Ingrese la descripcion");
        String descripcion= entrada.next();
        System.out.println("Ingrese el precio base");
        double precioBase= entrada.nextDouble();
        System.out.println("Ingrese el color");
        String color= entrada.next();
        System.out.println("Ingrese el consumo energetico");
        String consumoEnergetico= entrada.next();
        char consumo=consumoEnergetico.charAt(0);
        System.out.println("Ingrese el peso");
        int peso=entrada.nextInt();
        System.out.println("Ingrese la resolucion");
        int resolucion=entrada.nextInt();
        System.out.println("¿Tiene puerto HDMI?");
        boolean puertoHDMI=entrada.hasNext();
        
        return new Television(resolucion, puertoHDMI, codigo,descripcion,precioBase,color,consumo,peso);
    }
    public Lavadora ingresarLavadora(){
        entrada= new Scanner(System.in);
        System.out.println("Ingrese el codigo");
        int codigo= entrada.nextInt();
        System.out.println("Ingrese la descripcion");
        String descripcion= entrada.next();
        System.out.println("Ingrese el precio base");
        double precioBase= entrada.nextDouble();
        System.out.println("Ingrese el color");
        String color= entrada.next();
        System.out.println("Ingrese el consumo energetico");
        String consumoEnergetico= entrada.next();
        char consumo=consumoEnergetico.charAt(0);
        System.out.println("Ingrese el peso");
        int peso=entrada.nextInt();
        System.out.println("Ingrese la carga");
        int carga=entrada.nextInt();
        
        return new Lavadora(carga, codigo,descripcion,precioBase,color,consumo,peso);
    }
    
    public void mostrarLavadoras(List <Lavadora> lavadoras){
        for(Lavadora lavadora: lavadoras){
            System.out.println("Lavadora: "+lavadora);
        }
    }
    public void mostrarTelevisiones(List <Television> televisiones){
        for(Television television: televisiones){
            System.out.println("Television: "+television);
        }
    }
    
}
