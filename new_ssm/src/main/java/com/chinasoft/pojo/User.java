package com.chinasoft.pojo;

import java.io.Serializable;

public class User  implements Serializable{
	//Å·ÓñÍþ
	private static final long serialVersionUID = 1L;
	private int userid;
	private String username;
	private String password;
	private String email;
	private String create_time;
	private String gender;
	private String privilege;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPrivilege() {
		return privilege;
	}
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", create_time=" + create_time + ", gender=" + gender + ", privilege=" + privilege + "]";
	}
	public User(int userid, String username, String password, String email, String create_time, String gender,
			String privilege) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.email = email;
		this.create_time = create_time;
		this.gender = gender;
		this.privilege = privilege;
	}
	
}
