package iam.aerolinea.repositorio;

import iam.aerolinea.modelo.Cliente;
import iam.aerolinea.modelo.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface VueloRepositorio extends JpaRepository<Vuelo,Long> {

    // Busca vuelos que coincidan con el origen y el destino
    List<Vuelo> findByOrigenAndDestino(String origen, String destino);

    List<Vuelo> findByOrigenAndDestinoAndFechaSalida(String origen, String destino, LocalDate fechaSalida);

    List<Vuelo> findByOrigenAndDestinoAndFechaSalidaAndFechaRegreso(String origen, String destino, LocalDate fechaSalida, LocalDate fechaRegreso);


}
