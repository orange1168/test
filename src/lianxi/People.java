package lianxi;

import java.util.ArrayList;

public class People {
	private String name;
	private String sex;
	ArrayList<String> books;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public People(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}

}
