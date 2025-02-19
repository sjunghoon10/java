package stream;

public class Member {
	private String name;
	private String hobby;
	private String intoduce;
	
	public Member() {;}

	public Member(String name, String hobby, String intoduce) {
		super();
		this.name = name;
		this.hobby = hobby;
		this.intoduce = intoduce;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getIntoduce() {
		return intoduce;
	}

	public void setIntoduce(String intoduce) {
		this.intoduce = intoduce;
	}


	
	
	
}
