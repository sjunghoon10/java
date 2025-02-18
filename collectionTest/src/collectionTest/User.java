package collectionTest;

import java.util.Objects;

public class User {
	private int id;
	private String names;
	private int age;
	private String job;
	public User() {}
	
	public User(int id, String names, int age, String job) {
		super();
		this.id = id;
		this.names = names;
		this.age = age;
		this.job = job;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id;
	}
	@Override
	public String toString() {
		return "User [id=" + id + "]";
	}
	
	
}
