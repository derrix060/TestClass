package br.sceweb.modelo;
/**
 * Empresa
 * @author mario
 * @version 1
 */
public class Empresa {
	/**
	 * CNPJ
	 */
	private String cnpj;
	/**
	 * nome da empresa
	 */
	private String nomeDaEmpresa;
	/**
	 * nome fantasia
	 */
	private String nomeFantasia;
	/**
	 * endereco
	 */
	private String endereco;
	/**
	 * telefone
	 */
	private String telefone;
	

	// getters and setters
	/**
	 * retorna o nome da empresa
	 * @return nome empresa
	 */
	public String getNomeDaEmpresa() {
		return nomeDaEmpresa;
	}
	
	/**
	 * insere o nome da empresa
	 * @param nomeDaEmpresa
	 */
	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		if (nomeDaEmpresa.equals("")) {
			throw new IllegalArgumentException("Nome da empresa invalido");
		} else {
			this.nomeDaEmpresa = nomeDaEmpresa;
		}		
	}
	/**
	 * get cnpj
	 * @return cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}
	/**
	 * set cnph
	 * @param cnpj
	 */
	public void setCnpj(String cnpj) {
		if (cnpj.equals("")) {
			throw new IllegalArgumentException("CNPJ da empresa invalido");
		} else {
			this.cnpj = cnpj;
		}	
	}
	/**
	 * get nome fantasia
	 * @return nome fantasia
	 */
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	
	/**
	 * set nome fantasia
	 * @param nomeFantasia
	 */
	public void setNomeFantasia(String nomeFantasia) {
		if (nomeFantasia.equals("")) {
			throw new IllegalArgumentException("Nome Fantasia da empresa invalido");
		} else {
			this.nomeFantasia = nomeFantasia;
		}
	}
	
	/**
	 * get endereco
	 * @return endereco
	 */
	public String getEndereco() {
		return endereco;
	}
	
	/**
	 * set endereco
	 * @param endereco
	 */
	public void setEndereco(String endereco) {
		if (endereco.equals("")) {
			throw new IllegalArgumentException("Endereco da empresa invalido");
		} else {
			this.endereco = endereco;
		}
	}
	
	/**
	 * get telefone
	 * @return telefone
	 */
	public String getTelefone() {
		return telefone;
	}
	
	/**
	 * set telefone
	 * @param telefone
	 */
	public void setTelefone(String telefone) {
		if (telefone.equals("")) {
			throw new IllegalArgumentException("Telefone da empresa invalido");
		} else {
			this.telefone = telefone;
		}
	}
}
