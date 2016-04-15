package com.model;

public class Owner implements Comparable<Owner> {

	private String name;

	@Override
	public String toString() {
		return "Owner [name=" + name + "]";
	}

	public Owner(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(Owner o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Owner other = (Owner) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
