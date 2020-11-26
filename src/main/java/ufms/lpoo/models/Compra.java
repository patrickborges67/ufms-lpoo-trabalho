package ufms.lpoo.models;

import java.util.List;

public class Compra {

    private Funcionario funcionario;
    private Cliente cliente;
    private List<Produto> produtos;

    public Compra(Funcionario funcionario, Cliente cliente) {
        this.funcionario = funcionario;
        this.cliente = cliente;
    }

    public void adicionarProduto(Produto prod){

        this.produtos.add(prod);
    }
    public void listarCompra(){
        //TODO O método listar compra deverá informar o Funcionário que fez a venda e o cliente que fez a compra
        // Em seguida, deverá listar todos os produtos comprados pelo cliente
        // Ao final mostrar o valor total da compra.

    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}