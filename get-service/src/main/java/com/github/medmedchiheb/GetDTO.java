package com.github.medmedchiheb;

public class GetDTO {
	private String user;
	private String profile;
	

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public GetDTO() {
		super();
	}

	public GetDTO(String user, String profile) {
		super();
		this.user = user;
		this.profile = profile;
	}

}
