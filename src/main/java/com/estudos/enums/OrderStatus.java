package com.estudos.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	public int getCode() {
		return code;
	}
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public static OrderStatus valueOf(int code) {
		for(OrderStatus  obj : OrderStatus.values()) {
			if(obj.getCode() == code) {
				return obj;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code " + code);
	}

}
