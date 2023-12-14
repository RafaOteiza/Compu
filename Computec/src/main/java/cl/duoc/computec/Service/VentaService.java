/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cl.duoc.computec.Service;
import cl.duoc.computec.DTO.VentaDTO;
import java.util.List;
/**
 *
 * @author Rafa Oteiza
 */
public interface VentaService {
    void registrarVenta(VentaDTO ventaDTO);
    List<VentaDTO> obtenerTodasLasVentas();
    // Otros métodos relacionados con ventas
}
