package com.ivancompany.dao;

import com.ivancompany.model.UserCredentials;
import com.ivancompany.model.user_credentials;

import java.sql.*;

public class UserCredentialsDao extends AbstractBaseDao {

    public UserCredentialsDao() throws SQLException {
        super();
    }

    public user_credentials getUserCredentialsByLoginName(String login_name) throws SQLException {
        String SQL = "SELECT * FROM user_credentials WHERE login_name = ?";
        PreparedStatement ps = conn.prepareStatement(SQL);
        ps.setString(1, login_name);
        ResultSet rs = ps.executeQuery();
        return new user_credentials(rs.getString("login_name"), rs.getString("password"));
    }

}
