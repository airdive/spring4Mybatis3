package ssm.orm;

import java.util.Date;

public class Userinfo {

	private long id;
	private String username;
	private String password;
	private int age;
	private Date insertdate;

	public Userinfo() {
		super();
	}

	public Userinfo(long id, String username, String password, int age,
			Date insertdate) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.age = age;
		this.insertdate = insertdate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getInsertdate() {
		return insertdate;
	}

	public void setInsertdate(Date insertdate) {
		this.insertdate = insertdate;
	}

}
