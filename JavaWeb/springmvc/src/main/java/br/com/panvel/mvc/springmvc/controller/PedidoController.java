package br.com.panvel.mvc.springmvc.controller;

import br.com.panvel.mvc.springmvc.dto.RequisicaoNovoPedido;
import br.com.panvel.mvc.springmvc.model.Pedido;
import br.com.panvel.mvc.springmvc.reposiory.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping("formulario")
    public String formulario(RequisicaoNovoPedido requisicao){
        return "pedido/formulario";
    }

    @PostMapping("novo")
    public String novo(RequisicaoNovoPedido requisicao){
        if(requisicao.validate().hasError()) {
            return "pedido/formulario";
        }



        Pedido pedido = requisicao.toPedido();
        pedidoRepository.save(pedido);
        return "redirect:/home";
    }
}
