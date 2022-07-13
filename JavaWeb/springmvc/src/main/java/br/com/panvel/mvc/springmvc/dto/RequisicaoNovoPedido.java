package br.com.panvel.mvc.springmvc.dto;

import br.com.panvel.mvc.springmvc.model.Pedido;
import br.com.panvel.mvc.springmvc.model.PedidoValidator;

import javax.validation.constraints.Size;


public class RequisicaoNovoPedido {

    @Size(min = 3, max = 50, message = "nome invalido")
    private String nomeProduto;

    private String urlImagem;
    private String descricao;
    private String urlProduto;

    private boolean testError = true;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Pedido toPedido() {
        return new Pedido(nomeProduto, urlProduto, urlImagem, descricao);
    }

    public PedidoValidator validate()
    {
        PedidoValidator response = new PedidoValidator();

        if(nomeProduto.isBlank())
            response.addError("Campo \"Nome do produto\" não pode ser vazio.");
        if(urlImagem.isBlank())
            response.addError("Campo \"Url da imagem\" não pode ser vazio.");
        if(urlProduto.isBlank())
            response.addError("Campo \"Url do produto\" não pode ser vazio.");
        if(descricao.isBlank())
            response.addError("Campo \"Descrição\" não pode ser vazio.");

        return response;
    }
}
