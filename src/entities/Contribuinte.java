package entities;

public abstract class Contribuinte { //Classe abstrata
	
	protected String nome;
    protected Double renda_Anual;
    
    public Contribuinte() {
    	
    }

	public Contribuinte(String nome, Double renda_Anual) {
		super();
		this.nome = nome;
		this.renda_Anual = renda_Anual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRenda_Anual() {
		return renda_Anual;
	}

	public void setRenda_Anual(Double renda_Anual) {
		this.renda_Anual = renda_Anual;
	}
    
    public abstract double imposto();//Método abstrato

}
