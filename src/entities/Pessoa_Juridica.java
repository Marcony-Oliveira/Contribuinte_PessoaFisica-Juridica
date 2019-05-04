package entities;

public class Pessoa_Juridica extends Contribuinte {
	
	  private Integer numero_Funcionarios;
	  
	  Contribuinte contribuinte;
	  
	  public Pessoa_Juridica() {
		  
	  }

	public Pessoa_Juridica(String nome, Double renda_Anual, Integer numero_Funcionarios) {
		super(nome, renda_Anual);
		this.numero_Funcionarios = numero_Funcionarios;
	}

	public Integer getNumero_Funcionarios() {
		return numero_Funcionarios;
	}

	public void setNumero_Funcionarios(Integer numero_Funcionarios) {
		this.numero_Funcionarios = numero_Funcionarios;
	}
	  
	public double imposto() {
		double imp;
		if(numero_Funcionarios<10) {
			imp = renda_Anual*16/100;
		}
		else {
			imp = renda_Anual*14/100;
		}
		return imp;
	}
	
	@Override
	public String toString() {
		return "[PESSOA JURÍDICA].... Nome= "+nome+"-- Renda_Anual= " + renda_Anual
				+"-- Qt funcionários= "+numero_Funcionarios+"\n-- Imposto a pagar= "+imposto();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
