/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cl.duoc.computec.Service;
import cl.duoc.computec.DTO.EquipoDTO;
import java.util.List;
/**
 *
 * @author Rafa Oteiza
 */
public interface EquipoService {
    void agregarEquipo(EquipoDTO equipoDTO);
    EquipoDTO buscarEquipoPorModelo(String modelo);
    List<EquipoDTO> listarEquiposPorTipo(String tipo);
    List<EquipoDTO> obtenerTodosLosEquipos();
    // Otros métodos relacionados con equipos
}
