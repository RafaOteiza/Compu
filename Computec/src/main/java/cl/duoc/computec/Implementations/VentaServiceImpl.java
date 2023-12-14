/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.computec.Implementations;
import cl.duoc.computec.DTO.VentaDTO;
import cl.duoc.computec.Service.VentaService;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Rafa Oteiza
 */
public class VentaServiceImpl implements VentaService {
    private List<VentaDTO> ventas;

    public VentaServiceImpl() {
        this.ventas = new ArrayList<>();
    }

    @Override
    public void registrarVenta(VentaDTO ventaDTO) {
        ventas.add(ventaDTO);
    }

    @Override
    public List<VentaDTO> obtenerTodasLasVentas() {
        return new ArrayList<>(ventas);
    }

    // Otros métodos relacionados con ventas
}
