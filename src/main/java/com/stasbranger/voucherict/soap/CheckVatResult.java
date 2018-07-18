package com.stasbranger.voucherict.soap;

public class CheckVatResult {

	private final Boolean valid;
	private final String name;
	private final CheckVatAddress address;

	public CheckVatResult(Boolean valid, String name, CheckVatAddress address) {
		this.valid=valid;
		this.name=name.trim();
		this.address=address;
	}


	public Boolean isValid() {
		return valid;
	}

	public String getName() {
		return name;
	}

	public CheckVatAddress getAddress() {
		return address;
	}


	/*
	 * (non-Javadoc)
	 * @see java.lang.Object
	 */
	@Override
	public String toString() {
		return name + "\n" + address;

	}

}