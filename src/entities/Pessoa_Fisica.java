package entities;

public class Pessoa_Fisica extends Contribuinte{
	
	private Double gastos_Saude;
	
	Contribuinte contribuinte;
	
	public Pessoa_Fisica() {
		
	}

	public Pessoa_Fisica(String nome, Double renda_Anual, Double gastos_Saude) {
		super(nome, renda_Anual);
		this.gastos_Saude = gastos_Saude;
		
	}

	public Double getGastos_Saude() {
		return gastos_Saude;
	}

	public void setGastos_Saude(Double gastos_Saude) {
		this.gastos_Saude = gastos_Saude;
	}

	public double imposto() {
	      double imp;
		if(renda_Anual<20000) {
	    	  imp = renda_Anual*15/100 - gastos_Saude*50/100;
	      }
	      else {
	    	  imp = renda_Anual*25/100 - gastos_Saude*50/100;
	      }
	      return imp;
	}
	
	@Override
	public String toString() {
		return "[PESSOA FÍSICA].... Nome= "+nome+"-- Renda_Anual= " + renda_Anual
				+"-- Gastos saúde= "+gastos_Saude+"\n-- Imposto a pagar= "+imposto();
	}
	
	
	
	

}
