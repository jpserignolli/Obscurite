package p.i.models;

public class Produto {
     
	private String categoria;
	private String modelo;
	private int id;
	
	public Produto(String categoria, String modelo, int id) {
		this.categoria = categoria;
		this.modelo = modelo;
		this.id = id;
	}
	public String getCategoria() {
		return categoria;
	}
	public String getModelo() {
		return modelo;
	}
	public int getId() {
		return id;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setId(int id) {
		this.id = id;
	}
}
