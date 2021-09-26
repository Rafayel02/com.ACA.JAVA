package com.aca.week7.dbtask.db;

import com.aca.week7.dbtask.user.User;

import java.sql.*;

public class JDBCUserRepository implements UserRepository {

    private Connection connection;

    public JDBCUserRepository(String host, String user, String password) throws SQLException {
        this.connection = DriverManager.getConnection(host, user, password);
    }

    @Override
    public void save(User user) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("INSERT INTO users(name, age) VALUES(?, ?)");
        statement.setObject(1, user.getName());
        statement.setObject(2, user.getAge());
        statement.execute();
        statement.close();
    }

    @Override
    public void deleteAll() throws SQLException {
        Statement statement = connection.createStatement();
        statement.execute("DELETE FROM users;");
    }

    public void close() throws SQLException {
        connection.close();
    }

}
