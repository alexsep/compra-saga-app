package com.confrariadev;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.HashSet;
import java.util.Set;

@ApplicationScoped
public class PedidoService {

    private final Set<Long> pedidos = new HashSet<>();

    public void newPedido(Long id) {
        pedidos.add(id);
    }

    public void cancelPedido(Long id) {
        pedidos.remove(id);
    }

}
