package com.seeyon.apps.babi.dao;

import java.sql.SQLException;

import com.seeyon.apps.babi.util.JdbcHelper;

public class PersonnelDangAn{
	public String getPersonneInformation(String Personnel_id)
	{
		String senderLoginName = "";
		StringBuffer str = new StringBuffer();
		str.append("select ");
		str.append("login_name ");
		str.append("from org_principal p ");
		str.append("inner join org_member m ");
		str.append("on p.member_id = m.id ");
		str.append("where m.code=?");
		try {
			senderLoginName = (String) JdbcHelper.getSingle(str.toString(), Personnel_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return senderLoginName;
	}
}
