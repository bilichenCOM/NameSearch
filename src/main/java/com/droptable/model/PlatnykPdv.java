package com.droptable.model;

public class PlatnykPdv extends PrivateEntepreneur {

	private String pib;
	private Long kodPdv;

	public PlatnykPdv() {}
	public PlatnykPdv(String pib, Long kodPdv) {
		this.pib = pib;
		this.kodPdv = kodPdv;
	}

	public Long getKodPdv() {
		return kodPdv;
	}

	public void setKodPdv(Long kodPdv) {
		this.kodPdv = kodPdv;
	}

	@Override
	public String getPib() {
		return pib;
	}

	public void setPib(String pib) {
		this.pib = pib;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kodPdv == null) ? 0 : kodPdv.hashCode());
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
		PlatnykPdv other = (PlatnykPdv) obj;
		if (kodPdv == null) {
			if (other.kodPdv != null)
				return false;
		} else if (!kodPdv.equals(other.kodPdv))
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
		return "PlatnykPdv [pib=" + pib + ", kodPdv=" + kodPdv + "]";
	}
}
