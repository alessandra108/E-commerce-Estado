package com.senai.ecommerce.dto;

import java.time.Instant;

import com.senai.ecommerce.enuns.StatusDoPedido;

public record PedidoDTO(Instant moemento, StatusDoPedido status) {

}
