package devInMoney.banco;

public enum Agencia {

	FLORIANOPOLIS("Florian�polis", "001"), SAO_JOSE("S�o Jos�", "002");

	private String agencia;
	private String numAgencia;

	Agencia(String agencia, String numAgencia) {
		this.agencia = agencia;
		this.numAgencia = numAgencia;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(String numAgencia) {
		this.numAgencia = numAgencia;
	}

}
