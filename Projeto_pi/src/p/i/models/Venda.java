package p.i.models;

public class Venda {
 private int cpf;
 private String produto;
 private int quantidade;
 
 public Venda(int cpf,String produto, int quantidade){
	 this.cpf = cpf;
	 this.produto = produto;
	 this.quantidade = quantidade;
 }
 public int getCpf() {
	return cpf;
}
 public String getProduto() {
	return produto;
}
 public int getQuantidade() {
	return quantidade;
}
 public void setCpf(int cpf) {
	this.cpf = cpf;
}
 public void setProduto(String produto) {
	this.produto = produto;
}
 public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}
}
