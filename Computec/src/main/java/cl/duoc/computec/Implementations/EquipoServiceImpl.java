
package cl.duoc.computec.Implementations;

import cl.duoc.computec.DTO.EquipoDTO;
import cl.duoc.computec.Service.EquipoService;

import java.util.ArrayList;
import java.util.List;

public class EquipoServiceImpl implements EquipoService {
    private List<EquipoDTO> equipos;

    public EquipoServiceImpl() {
        this.equipos = new ArrayList<>();
    }

    @Override
    public void agregarEquipo(EquipoDTO equipoDTO) {
        equipos.add(equipoDTO);
    }

    @Override
    public EquipoDTO buscarEquipoPorModelo(String modelo) {
        for (EquipoDTO equipo : equipos) {
            if (equipo.getModelo().equals(modelo)) {
                return equipo;
            }
        }
        return null;
    }

    @Override
    public List<EquipoDTO> listarEquiposPorTipo(String tipo) {
        List<EquipoDTO> equiposPorTipo = new ArrayList<>();
        for (EquipoDTO equipo : equipos) {
            if (equipo.getTipo().equals(tipo)) {
                equiposPorTipo.add(equipo);
            }
        }
        return equiposPorTipo;
    }

    @Override
    public List<EquipoDTO> obtenerTodosLosEquipos() {
        return new ArrayList<>(equipos);
    }
    // Otros métodos relacionados con equipos
}
