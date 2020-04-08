package com.ivancompany.model;

import java.util.Objects;

/**
 * @author Timothy
 */
public class user_credentials {
    String login_name;
    String password;

    /**
     * empty constructor
     */
    public user_credentials() {
    }

    /**
     * constructor with full parameters
     * @param login_name username
     * @param password user's password
     */
    public user_credentials(String login_name, String password) {
        this.login_name = login_name;
        this.password = password;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        user_credentials that = (user_credentials) o;
        return getLogin_name().equals(that.getLogin_name()) &&
                getPassword().equals(that.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPassword());
    }
}
