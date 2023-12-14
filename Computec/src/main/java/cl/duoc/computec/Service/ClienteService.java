/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cl.duoc.computec.Service;
import cl.duoc.computec.DTO.ClienteDTO;
import java.util.List;

/**
 *
 * @author Rafa Oteiza
 */
public interface ClienteService {
    void agregarCliente(ClienteDTO clienteDTO);
    ClienteDTO buscarClientePorRut(String rut);
    List<ClienteDTO> obtenerTodosLosClientes();
    // Otros métodos relacionados con clientes
}
