package com.laragoncalves.salesProject.enums;

public enum OrderStatus {

	WAITIG_PAYMENT(1),
	PAID(2),
	SHIPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	//para futuras amnutenções no codigo, acrescentamos um numero respectivo ao valor enumerado, criamos um atributo e passamos
	//esse atributo no construtuor para que ele receba o codigo respctivo no momenbto da instanciação
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	//somente criar o atributo private, não é possivel fazer com que ele seja visivel para a apliçcação ou seja
	//é necessario criar o metodo get para poder acessar o codigo
	
	public int getCode() {
		return this.code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Codigo invalido");
	}
}
