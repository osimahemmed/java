package com.design.builder;

public class Computer {
	
	private String HDD;
	private String RAM;
	
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	public String getHDD() {
		return HDD;
	}
	public String getRAM() {
		return RAM;
	}
	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	
	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;

	}
	
	public static class ComputerBuilder {
		
			// required parameters
			private String HDD;
			private String RAM;
	
			// optional parameters
			private boolean isGraphicsCardEnabled;
			private boolean isBluetoothEnabled;
			
			public ComputerBuilder(String hdd, String ram) {
				this.HDD = hdd;
				this.RAM = ram;
				System.out.println("Inside comuter builder");
			}
			
			public ComputerBuilder setGraphicEnabled(boolean b) {
				this.isGraphicsCardEnabled = b;
				return this;
			}
			
			public ComputerBuilder setBluetoothEnabled(boolean b) {
				this.isBluetoothEnabled = b;
				return this;
			}
			
			public Computer build() {
				 return new Computer(this);
			}
			
	}

}
