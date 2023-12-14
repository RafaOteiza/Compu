
package cl.duoc.computec.Implementations;
import cl.duoc.computec.DTO.ClienteDTO;
import cl.duoc.computec.Service.ClienteService;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Rafa Oteiza
 */
public class ClienteServiceImpl implements ClienteService {
    private List<ClienteDTO> clientes;

    public ClienteServiceImpl() {
        this.clientes = new ArrayList<>();
    }

    @Override
    public void agregarCliente(ClienteDTO clienteDTO) {
        clientes.add(clienteDTO);
    }

    @Override
    public ClienteDTO buscarClientePorRut(String rut) {
        for (ClienteDTO cliente : clientes) {
            if (cliente.getRut().equals(rut)) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public List<ClienteDTO> obtenerTodosLosClientes() {
        return new ArrayList<>(clientes);
    }

    // Otros métodos relacionados con clientes
}
