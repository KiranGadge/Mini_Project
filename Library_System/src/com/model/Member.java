package com.model;

public class Member {

	private int Member_id;
	private String Member_name;
	private long Mobile;
	private String Address;

	public Member() {

	}

	public Member(int member_id, String member_name, long mobile, String address) {
		super();
		Member_id = member_id;
		Member_name = member_name;
		Mobile = mobile;
		Address = address;
	}

	public int getMember_id() {
		return Member_id;
	}

	public void setMember_id(int member_id) {
		Member_id = member_id;
	}

	public String getMember_name() {
		return Member_name;
	}

	public void setMember_name(String member_name) {
		Member_name = member_name;
	}

	public long getMobile() {
		return Mobile;
	}

	public void setMobile(long mobile) {
		Mobile = mobile;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String toString() {
		return "Member has--> Member_id=" + Member_id + ", Member_name=" + Member_name + ", Mobile=" + Mobile
				+ ", Address=" + Address;
	}

}
