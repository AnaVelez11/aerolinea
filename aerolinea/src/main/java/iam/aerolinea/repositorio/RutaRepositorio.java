package iam.aerolinea.repositorio;

import iam.aerolinea.modelo.Ruta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RutaRepositorio extends JpaRepository<Ruta, Long>{

    List<Ruta> findByOrigen(String origen);
    List<Ruta> findByDestino(String destino);
    List<Ruta> findByEsInternacional(boolean esInternacional);

}
