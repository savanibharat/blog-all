package com.learninghorizon.blog.stream;

public class Transaction {

	private Trader trader;
	private final int year;
	private final int value;

	public Transaction(final Trader trader, final int year, final int value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Trader getTrader() {
		return trader;
	}

	public int getValue() {
		return value;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "{"+ this.trader+", "
				+"year: "+this.year+", "+
				"value:"+this.value+"}";
	}
	
}
