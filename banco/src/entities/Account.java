package entities;

import Exception.BusinessException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	// instanciar a classe com nenhum argumento
	public Account() {
		
	}
	//construtor que já recebe os argumentos 
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	// Funções do programa
	public void deposit ( double amount) {
		balance += amount;
	}
	public void withdraw ( double amount ) throws BusinessException {
		validateWithdraw(amount);
		balance = balance - amount;
	}
	// Validação ocorre aqui, junto com a regra de negocio da conta, além disso estamos propagando a exceção 
	private void validateWithdraw(double amount) throws BusinessException {
		if (amount > getWithdrawLimit()) {
			throw new BusinessException("Erro no saque: A quantia excede o limite de saque!");
		}if (amount > getBalance()) {
			throw new BusinessException("Erro de saque: Seu saldo é insuficiente");
		}
	}
}
