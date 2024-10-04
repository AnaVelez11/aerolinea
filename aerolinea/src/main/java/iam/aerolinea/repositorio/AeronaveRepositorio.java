package iam.aerolinea.repositorio;

import iam.aerolinea.modelo.Aeronave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AeronaveRepositorio extends JpaRepository<Aeronave,Long> {
}
