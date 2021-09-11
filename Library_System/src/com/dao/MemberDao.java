package com.dao;

import com.model.Member;

public interface MemberDao {

	int addmember(Member m);

	int removemember(int m_id);

	int updatemember_byname(String Member_name, String address);
}
