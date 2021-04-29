package com.company;

import java.sql.*;
import java.util.*;

import static java.sql.DriverManager.getConnection;

public class SDModel {
    Connection conn = null;
    String url;
    Statement stmt = null;
    ResultSet rs = null;

    SDModel(String url) {
        this.url = url;
    }
    public void connect() throws SQLException {
        conn = getConnection(url);
    }

    public void close() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }
    public void CreateStatement() throws SQLException {
        this.stmt = conn.createStatement();
    }
    public ArrayList<String> SQLQueryStudentData() {
        ArrayList<String> Names = new ArrayList<String>();
        String sql = "SELECT ID FROM Student;";
        try {
            rs = stmt.executeQuery(sql);
            while (rs != null && rs.next()) {
                String name = rs.getString(1);
                Names.add(name);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        rs = null;
        return Names;
    }
    public void PrintStudentData(ArrayList<String> Names){
        for (int i=0; i<Names.size(); i++){
            System.out.println(Names.get(i));
        }
    }
}
