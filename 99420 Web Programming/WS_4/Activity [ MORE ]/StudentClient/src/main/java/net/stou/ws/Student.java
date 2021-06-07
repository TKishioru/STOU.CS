package net.stou.ws;

public class Student {

	private int id;
	private String code;
	private String name;
	private String province;
	
	public Student() {
	}

	public Student(int id) {
		this.id = id;
	}
	
	public Student(String code, String name, String province) {
		this.code = code;
		this.name = name;
		this.province = province;
	}
	
	public Student(int id, String code, String name, String province) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.province = province;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
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
		Student other = (Student) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", code=" + code + ", name=" + name + ", province=" + province + "]";
	}	
}