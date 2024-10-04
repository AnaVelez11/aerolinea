package iam.aerolinea.controlador;

import iam.aerolinea.modelo.Ruta;
import iam.aerolinea.servicio.RutaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rutas")
public class RutaControlador {

    @Autowired
    private RutaServicio rutaServicio;

    // Listar todas las rutas
    @GetMapping
    public List<Ruta> listarRutas() {
        return rutaServicio.listarTodasLasRutas();
    }

    // Buscar rutas por origen
    @GetMapping("/origen/{origen}")
    public List<Ruta> buscarRutasPorOrigen(@PathVariable String origen) {
        return rutaServicio.buscarRutasPorOrigen(origen);
    }

    // Buscar rutas por destino
    @GetMapping("/destino/{destino}")
    public List<Ruta> buscarRutasPorDestino(@PathVariable String destino) {
        return rutaServicio.buscarRutasPorDestino(destino);
    }

    // Buscar rutas internacionales/nacionales
    @GetMapping("/tipo/{esInternacional}")
    public List<Ruta> buscarRutasPorTipo(@PathVariable boolean esInternacional) {
        return rutaServicio.buscarRutasPorTipo(esInternacional);
    }

    // Guardar una nueva ruta
    @PostMapping
    public Ruta guardarRuta(@RequestBody Ruta ruta) {
        return rutaServicio.guardarRuta(ruta);
    }

    // Buscar una ruta por ID
    @GetMapping("/{id}")
    public Optional<Ruta> buscarRutaPorId(@PathVariable Long id) {
        return rutaServicio.buscarRutaPorId(id);
    }

    // Eliminar una ruta
    @DeleteMapping("/{id}")
    public void eliminarRuta(@PathVariable Long id) {
        rutaServicio.eliminarRuta(id);
    }

}
