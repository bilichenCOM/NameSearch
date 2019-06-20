package com.droptable.model;

public class PodatkBorzhnyk extends PrivateEntepreneur {

	private String pib;
	private Double borg;
	private String dpi;

	public PodatkBorzhnyk() {}
	public PodatkBorzhnyk(String pib, Double borg, String dpi) {
		super();
		this.pib = pib;
		this.borg = borg;
		this.dpi = dpi;
	}

	public String getPib() {
		return pib;
	}

	public void setPib(String pib) {
		this.pib = pib;
	}

	public Double getBorg() {
		return borg;
	}

	public void setBorg(Double borg) {
		this.borg = borg;
	}

	public String getDpi() {
		return dpi;
	}

	public void setDpi(String dpi) {
		this.dpi = dpi;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((borg == null) ? 0 : borg.hashCode());
		result = prime * result + ((dpi == null) ? 0 : dpi.hashCode());
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
		PodatkBorzhnyk other = (PodatkBorzhnyk) obj;
		if (borg == null) {
			if (other.borg != null)
				return false;
		} else if (!borg.equals(other.borg))
			return false;
		if (dpi == null) {
			if (other.dpi != null)
				return false;
		} else if (!dpi.equals(other.dpi))
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
		return "PodatkBorzhnyk [pib=" + pib + ", borg=" + borg + ", dpi=" + dpi + "]";
	}
}