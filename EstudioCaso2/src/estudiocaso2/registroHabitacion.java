/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiocaso2;

import javax.swing.JOptionPane;

/**
 *
 * @author jimec
 */
class registroHabitacion {
    Habitacion arregloHabitacion[]= new Habitacion[10];
    private int cantHabitaciones=0;
    
    public registroHabitacion(){
        this.arregloHabitacion[0]= new Habitacion("simple", "libre", 1, 150);
        this.arregloHabitacion[1]= new Habitacion("doble", "libre", 2, 300);
        this.arregloHabitacion[2]= new Habitacion("doble", "ocupada", 3, 350);
        this.arregloHabitacion[3]= new Habitacion("simple", "limpieza", 4, 100);
        this.arregloHabitacion[4]= new Habitacion("simple", "ocupada", 5, 98);
        this.cantHabitaciones=5;
                
    }
    
    public boolean agregar(Habitacion[] habitacion){
        if(cantHabitaciones<this.arregloHabitacion.length){
            for (int i=0;i<this.arregloHabitacion.length;i++){
                if(this.arregloHabitacion[i]==null){
                    this.arregloHabitacion[i]=habitacion;
                    this.cantHabitaciones=cantHabitaciones+1;
                    JOptionPane.showMessageDialog(null, "Registro de habitacion: " + (i + 1));
                    String tipo = JOptionPane.showInputDialog("Ingrese el tipo de habitacion");
                    String estado = JOptionPane.showInputDialog("Ingrese el estado de la habitacion:");
                    int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de habitacion"));
                    int preciopn = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio por noche"));
                    Habitacion[] agregar = null;
                    agregar[i] = new Habitacion(tipo, estado, numero, preciopn);
                    break;
                }
            }
            return true;
        }else{
            return false;
        }
    }
    
    public void mostrarinfo(Habitacion[] arregloHabitacion) {
        for (int i = 0; i < arregloHabitacion.length; i++) {
            JOptionPane.showMessageDialog(null,
                    "Habitacion #" + (i + 1) + ":\n"
                    + "Tipo: " + this.arregloHabitacion[i].tipo + "\n"
                    + "Estado: " + this.arregloHabitacion[i].estado + "\n"
                    + "Numero: " + this.arregloHabitacion[i].numero + "\n"
                    + "Precio por noche: " + this.arregloHabitacion[i].preciopn + "\n");
        }
    }
    
}
