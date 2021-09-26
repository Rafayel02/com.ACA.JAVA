package com.aca.week7.db;

import com.aca.week7.user.User;

import java.sql.SQLException;

public interface UserRepository {

    void save(User user) throws SQLException;

    void deleteAll() throws SQLException;

}
