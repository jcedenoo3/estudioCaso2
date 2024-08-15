/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiocaso2;

/**
 *
 * @author jimec
 */
class Habitacion {
    public String tipo, estado;
    public int numero, preciopn;

    public Habitacion(String tipo, String estado, int numero, int preciopn) {
        this.tipo = tipo;
        this.estado = estado;
        this.numero = numero;
        this.preciopn = preciopn;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPreciopn() {
        return preciopn;
    }

    public void setPreciopn(int preciopn) {
        this.preciopn = preciopn;
    }
    
    
    
    
    
}
