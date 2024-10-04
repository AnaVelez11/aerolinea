package iam.aerolinea.servicio;

import iam.aerolinea.modelo.Ruta;
import iam.aerolinea.repositorio.RutaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RutaServicio {

    @Autowired
    private RutaRepositorio rutaRepositorio;

    // Listar todas las rutas
    public List<Ruta> listarTodasLasRutas() {
        return rutaRepositorio.findAll();
    }

    // Buscar rutas por origen
    public List<Ruta> buscarRutasPorOrigen(String origen) {
        return rutaRepositorio.findByOrigen(origen);
    }

    // Buscar rutas por destino
    public List<Ruta> buscarRutasPorDestino(String destino) {
        return rutaRepositorio.findByDestino(destino);
    }

    // Buscar rutas internacionales o nacionales
    public List<Ruta> buscarRutasPorTipo(boolean esInternacional) {
        return rutaRepositorio.findByEsInternacional(esInternacional);
    }

    // Guardar una nueva ruta
    public Ruta guardarRuta(Ruta ruta) {
        return rutaRepositorio.save(ruta);
    }

    // Buscar ruta por ID
    public Optional<Ruta> buscarRutaPorId(Long id) {
        return rutaRepositorio.findById(id);
    }

    // Eliminar una ruta
    public void eliminarRuta(Long id) {
        rutaRepositorio.deleteById(id);
    }


}
