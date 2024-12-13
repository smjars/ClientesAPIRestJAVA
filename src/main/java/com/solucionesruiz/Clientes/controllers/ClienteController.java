package com.solucionesruiz.Clientes.controllers;

import com.solucionesruiz.Clientes.domain.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
public class ClienteController {
    // creo una lista de clientes ficticia (deberia estar en la base de datos y extraido en otro paquete)
    private final List<Cliente> clientes = new ArrayList<>(Arrays.asList(
            new Cliente(111, "Alfredo", "ALF", "Estoy vivo!!"),
            new Cliente(112, "Angel", "ANG", "Quiero volar"),
            new Cliente(113, "Goku", "KKorto", "Kamehamehaaaaa"),
            new Cliente(114, "Josue", "Jruiz", "Lo estoy haciendo"),
            new Cliente(115,"Vegeta", "VGT", "Maldito insecto!!")
    ));

    // metodo encargado de revolver la lista completa de clientes
    @GetMapping("clientes")
    public List<Cliente> getClientes()
    {
        return clientes;
    }
    // retorno el cliente si el paremetro username existe en la lista, en caso de no encontrarlo devuelvo null(esto es por mientras)
    @GetMapping("clientes/{username}")
    public Cliente getCliente(@PathVariable String username){
        for (Cliente c : clientes){
            if (c.getUsername().equalsIgnoreCase(username)){
                return c;
            }
        }
        return null;
    }
}
