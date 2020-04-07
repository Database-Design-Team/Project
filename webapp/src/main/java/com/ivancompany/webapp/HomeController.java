package com.ivancompany.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.*;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @GetMapping(value="/checkUsernamePasswordCombination")
    @ResponseBody
    public boolean checkUsernamePasswordCombination(@RequestParam String username, @RequestParam String password) {
        boolean flag = false;
        try(Connection conn = DatabaseLoader.connect()) {
            String SQL = "SELECT count(*) FROM user_credentials WHERE " +
                    "user_login = ? AND password = ?";
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, username);
            pstmt.setString(2, username);
            ResultSet rs = pstmt.executeQuery();
            rs.next();

            //if someone has this combination of username and password
            if(rs.getInt(1) > 0) {
                flag = true;
            }
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return flag;
    }

    @GetMapping(value="/anEndpoint")
    @ResponseBody
    public boolean dummyMethod() {
        return false;
    }

}
