package br.com.weebee.loja;

public abstract class DomainException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DomainException(String message) {
		super(message);
	}
	

}