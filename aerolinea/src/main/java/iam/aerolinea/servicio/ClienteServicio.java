package iam.aerolinea.servicio;

import iam.aerolinea.modelo.Cliente;
import iam.aerolinea.repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServicio implements IClienteServicio {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

}
