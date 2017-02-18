package com.learninghorizon.blog.immutable;

public class CreditCard {

	private String firstName;
	private String lastName;
	private String creditCardNumber;
	private int validTillMonth;
	private int validTillYear;

	public CreditCard() {
	}

	public CreditCard(
			String firstName,
			String lastName,
			String creditCardNumber,
			int validTillMonth,
			int validTillYear){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.creditCardNumber = creditCardNumber;
		this.validTillMonth = validTillMonth;
		this.validTillYear = validTillYear;
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the creditCardNumber
	 */
	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	/**
	 * @param creditCardNumber
	 *            the creditCardNumber to set
	 */
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	/**
	 * @return the validTillMonth
	 */
	public int getValidTillMonth() {
		return validTillMonth;
	}

	/**
	 * @param validTillMonth
	 *            the validTillMonth to set
	 */
	public void setValidTillMonth(int validTillMonth) {
		this.validTillMonth = validTillMonth;
	}

	/**
	 * @return the validTillYear
	 */
	public int getValidTillYear() {
		return validTillYear;
	}

	/**
	 * @param validTillYear
	 *            the validTillYear to set
	 */
	public void setValidTillYear(int validTillYear) {
		this.validTillYear = validTillYear;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((creditCardNumber == null) ? 0 : creditCardNumber.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + validTillMonth;
		result = prime * result + validTillYear;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof CreditCard)) {
			return false;
		}
		CreditCard other = (CreditCard) obj;
		if (creditCardNumber == null) {
			if (other.creditCardNumber != null) {
				return false;
			}
		} else if (!creditCardNumber.equals(other.creditCardNumber)) {
			return false;
		}
		if (firstName == null) {
			if (other.firstName != null) {
				return false;
			}
		} else if (!firstName.equals(other.firstName)) {
			return false;
		}
		if (lastName == null) {
			if (other.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(other.lastName)) {
			return false;
		}
		if (validTillMonth != other.validTillMonth) {
			return false;
		}
		if (validTillYear != other.validTillYear) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("CreditCard [firstName=");
		stringBuilder.append(firstName);
		stringBuilder.append(", lastName=");
		stringBuilder.append(lastName);
		stringBuilder.append(", creditCardNumber=");
		stringBuilder.append(creditCardNumber);
		stringBuilder.append(", validTillMonth=");
		stringBuilder.append(validTillMonth);
		stringBuilder.append(", validTillYear=");
		stringBuilder.append(validTillYear);
		stringBuilder.append("]");
		return stringBuilder.toString();
	}

}
