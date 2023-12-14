/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.computec.DTO;

/**
 *
 * @author Rafa Oteiza
 */
public class EquipoDTO {
    private String nombre;
    private String modelo;
    private String descripcion;
    private String cpu;
    private int tamanoDiscoDuroMB;
    private int ramGB;
    private double precio;
    private String tipo; // "Laptop" o "Desktop"
    private String potenciaFuente;
    private String factorForma;
    private double tamanoPantalla; // Solo para laptops
    private int cantidadPuertosUSB; // Solo para laptops

    // Constructores
    public EquipoDTO() {
    }

    public EquipoDTO(String nombre, String modelo, String descripcion, String cpu,
                     int tamanoDiscoDuroMB, int ramGB, double precio, String tipo,
                     String potenciaFuente, String factorForma, double tamanoPantalla,
                     int cantidadPuertosUSB) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.cpu = cpu;
        this.tamanoDiscoDuroMB = tamanoDiscoDuroMB;
        this.ramGB = ramGB;
        this.precio = precio;
        this.tipo = tipo;
        this.potenciaFuente = potenciaFuente;
        this.factorForma = factorForma;
        this.tamanoPantalla = tamanoPantalla;
        this.cantidadPuertosUSB = cantidadPuertosUSB;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getTamanoDiscoDuroMB() {
        return tamanoDiscoDuroMB;
    }

    public void setTamanoDiscoDuroMB(int tamanoDiscoDuroMB) {
        this.tamanoDiscoDuroMB = tamanoDiscoDuroMB;
    }

    public int getRamGB() {
        return ramGB;
    }

    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
        
        // Si es una Desktop, deshabilitar los campos específicos de Laptop
        if ("Desktop".equals(tipo)) {
            this.tamanoPantalla = 0; // O algún valor por defecto
            this.cantidadPuertosUSB = 0; // O algún valor por defecto
        }
    }

    public String getPotenciaFuente() {
        return potenciaFuente;
    }

    public void setPotenciaFuente(String potenciaFuente) {
        this.potenciaFuente = potenciaFuente;
    }

    public String getFactorForma() {
        return factorForma;
    }

    public void setFactorForma(String factorForma) {
        this.factorForma = factorForma;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public int getCantidadPuertosUSB() {
        return cantidadPuertosUSB;
    }

    public void setCantidadPuertosUSB(int cantidadPuertosUSB) {
        this.cantidadPuertosUSB = cantidadPuertosUSB;
    }
}
