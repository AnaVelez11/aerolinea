package iam.aerolinea.modelo;

import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Ruta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String origen;
    private String destino;
    private String duracion;
    private String horaSalida;
    private boolean esInternacional;

    @ManyToOne
    private Aerolinea aerolinea;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Vuelo> listaVuelos = new ArrayList<>();

}

