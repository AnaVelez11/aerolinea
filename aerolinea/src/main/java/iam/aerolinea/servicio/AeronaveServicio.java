package iam.aerolinea.servicio;

import iam.aerolinea.modelo.Aeronave;
import iam.aerolinea.modelo.Vuelo;
import iam.aerolinea.repositorio.AeronaveRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AeronaveServicio implements IAeronaveServicio {

    @Autowired
    private AeronaveRepositorio aeronaveRepositorio;

    @Override
    public List<Aeronave> listarAeronaves(){
        return this.aeronaveRepositorio.findAll();

    }
    // Método para listar los vuelos de una aeronave específica
    public List<Vuelo> listarVuelosDeAeronave(Long aeronaveId) {
        Aeronave aeronave = aeronaveRepositorio.findById(aeronaveId)
                .orElseThrow(() -> new RuntimeException("Aeronave no encontrada con ID: " + aeronaveId));
        return aeronave.getListaVuelos();
    }

}
