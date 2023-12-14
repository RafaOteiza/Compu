/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.computec.DTO;
import java.util.Date;
/**
 *
 * @author Rafa Oteiza
 */
public class VentaDTO {
    private ClienteDTO clienteDTO;
    private EquipoDTO equipoDTO;
    private Date fechaHora;

    // Constructores
    public VentaDTO() {
    }

    public VentaDTO(ClienteDTO clienteDTO, EquipoDTO equipoDTO, Date fechaHora) {
        this.clienteDTO = clienteDTO;
        this.equipoDTO = equipoDTO;
        this.fechaHora = fechaHora;
    }

    // Getters y setters
    public ClienteDTO getClienteDTO() {
        return clienteDTO;
    }

    public void setClienteDTO(ClienteDTO clienteDTO) {
        this.clienteDTO = clienteDTO;
    }

    public EquipoDTO getEquipoDTO() {
        return equipoDTO;
    }

    public void setEquipoDTO(EquipoDTO equipoDTO) {
        this.equipoDTO = equipoDTO;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
}