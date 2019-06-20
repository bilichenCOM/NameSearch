package com.droptable.model;

public class AnulPlatnykPdv extends PrivateEntepreneur {

	private String pib;
	private Long kodPdv;
	private String nameAnul;

	public AnulPlatnykPdv() {}
	public AnulPlatnykPdv(String pib, Long kodPdv, String nameAnul) {
		this.pib = pib;
		this.kodPdv = kodPdv;
		this.nameAnul = nameAnul;
	}

	public String getPib() {
		return pib;
	}

	public void setPib(String pib) {
		this.pib = pib;
	}

	public Long getKodPdv() {
		return kodPdv;
	}

	public void setKodPdv(Long kodPdv) {
		this.kodPdv = kodPdv;
	}

	public String getNameAnul() {
		return nameAnul;
	}

	public void setNameAnul(String nameAnul) {
		this.nameAnul = nameAnul;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kodPdv == null) ? 0 : kodPdv.hashCode());
		result = prime * result + ((nameAnul == null) ? 0 : nameAnul.hashCode());
		result = prime * result + ((pib == null) ? 0 : pib.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnulPlatnykPdv other = (AnulPlatnykPdv) obj;
		if (kodPdv == null) {
			if (other.kodPdv != null)
				return false;
		} else if (!kodPdv.equals(other.kodPdv))
			return false;
		if (nameAnul == null) {
			if (other.nameAnul != null)
				return false;
		} else if (!nameAnul.equals(other.nameAnul))
			return false;
		if (pib == null) {
			if (other.pib != null)
				return false;
		} else if (!pib.equals(other.pib))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AnulPlatnykPdv [pib=" + pib + ", kodPdv=" + kodPdv + ", nameAnul=" + nameAnul + "]";
	}
}