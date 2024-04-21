/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_session04;

/**
 *
 * @author Leo
 */
public class Cliente extends Persona{
    
    private String codCliente;
    private int cantCompras;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int edad, String codCliente, int cantCompras) {
        super(nombre, apellido, edad);
        this.codCliente = codCliente;
        this.cantCompras = cantCompras;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public int getCantCompras() {
        return cantCompras;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public void setCantCompras(int cantCompras) {
        this.cantCompras = cantCompras;
    }
    
}
