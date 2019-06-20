package com.droptable.model;

public class Bankrut extends PrivateEntepreneur {

	private String pib;
	private String procBorgName;
	private String dateStart;

	public Bankrut() {}
	public Bankrut(String pib, String procBorgName, String dateStart) {
		this.pib = pib;
		this.procBorgName = procBorgName;
		this.dateStart = dateStart;
	}

	public String getPib() {
		return pib;
	}

	public void setPib(String pib) {
		this.pib = pib;
	}

	public String getProcBorgName() {
		return procBorgName;
	}

	public void setProcBorgName(String procBorgName) {
		this.procBorgName = procBorgName;
	}

	public String getDateStart() {
		return dateStart;
	}

	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateStart == null) ? 0 : dateStart.hashCode());
		result = prime * result + ((pib == null) ? 0 : pib.hashCode());
		result = prime * result + ((procBorgName == null) ? 0 : procBorgName.hashCode());
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
		Bankrut other = (Bankrut) obj;
		if (dateStart == null) {
			if (other.dateStart != null)
				return false;
		} else if (!dateStart.equals(other.dateStart))
			return false;
		if (pib == null) {
			if (other.pib != null)
				return false;
		} else if (!pib.equals(other.pib))
			return false;
		if (procBorgName == null) {
			if (other.procBorgName != null)
				return false;
		} else if (!procBorgName.equals(other.procBorgName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bankrut [pib=" + pib + ", procBorgName=" + procBorgName + ", dateStart=" + dateStart + "]";
	}
}