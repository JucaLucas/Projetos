package caixeiro_viajante;
import java.util.List;


public class McDonalds {
	
	
		public McDonalds(String nome, int id) {
		        this.id = id;
		        this.nome = nome;
		}
		        
		    
	    
    public McDonalds() {
			// TODO Auto-generated constructor stub
		}



	public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double[] getLocalizacao() {
			return localizacao;
		}
		public void setLocalizacao(double[] localizacao) {
			this.localizacao = localizacao;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
	 	public List<Entrega> getEntregas() {
			return entregas;
		}
		public void setEntregas(List<Entrega> entregas) {
			this.entregas = entregas;
		}
	private int id;
    private String nome;
    private double[] localizacao;
    private String endereco;
    private List<Entrega> entregas;
    
}

	class Entrega {
    public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getDestinatario() {
			return destinatario;
		}
		public void setDestinatario(String destinatario) {
			this.destinatario = destinatario;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public double[] getLocalizacao() {
			return localizacao;
		}
		public void setLocalizacao(double[] localizacao) {
			this.localizacao = localizacao;
		}
		public List<Produto> getProdutos() {
			return produtos;
		}
		public void setProdutos(List<Produto> produtos) {
			this.produtos = produtos;
		}
		public boolean isPago() {
			return pago;
		}
		public void setPago(boolean pago) {
			this.pago = pago;
		}
	private int id;
    private String destinatario;
    private String endereco;
    private double[] localizacao;
    private List<Produto> produtos;
    private double total_entrega;
    public double getTotal_entrega() {
		return total_entrega;
	}
	public void setTotal_entrega(double total_entrega) {
		this.total_entrega = total_entrega;
	}
	private double total_desconto;
    public double getTotal_desconto() {
		return total_desconto;
	}
	public void setTotal_desconto(double total_desconto) {
		this.total_desconto = total_desconto;
	}
	private int codigo_entrega;
    public int getCodigo_entrega() {
		return codigo_entrega;
	}
	public void setCodigo_entrega(int codigo_entrega) {
		this.codigo_entrega = codigo_entrega;
	}
	private boolean pago;
    private List<tipo_pagamento> tipo_pagamento;
	public List<tipo_pagamento> getTipo_pagamento() {
		return tipo_pagamento;
	}
	public void setTipo_pagamento(List<tipo_pagamento> tipo_pagamento) {
		this.tipo_pagamento = tipo_pagamento;
	}
    
 
}

	class Produto {
    public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
		public double getSubtotal() {
			return subtotal;
		}
		public void setSubtotal(double subtotal) {
			this.subtotal = subtotal;
		}
		public double getDesconto() {
			return desconto;
		}
		public void setDesconto(double desconto) {
			this.desconto = desconto;
		}
		public double getTotal() {
			return total;
		}
		public void setTotal(double total) {
			this.total = total;
		}
	private int id;
    private String nome;
    private int quantidade;
    public double getPreco_unitario() {
		return preco_unitario;
	}
	public void setPreco_unitario(double preco_unitario) {
		this.preco_unitario = preco_unitario;
	}
	private double preco_unitario;
    private double subtotal;
    private double desconto;
    private double total;
    
    
}

	class tipo_pagamento {
    public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getBandeira() {
			return bandeira;
		}
		public void setBandeira(String bandeira) {
			this.bandeira = bandeira;
		}
	private int id;
    private String nome;
    private String bandeira;
    
}
