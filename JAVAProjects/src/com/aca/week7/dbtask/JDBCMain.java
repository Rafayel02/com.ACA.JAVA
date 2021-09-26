package com.aca.week7.dbtask;

import com.aca.week7.dbtask.db.JDBCUserRepository;
import com.aca.week7.dbtask.user.User;

import java.sql.SQLException;

public class JDBCMain {

    public static void main(String[] args) throws SQLException {
        User user1 = new User("Valodik", 42);
        User user2 = new User("Vaspur", 24);
        User user3 = new User("Gexam", 42);

        final JDBCUserRepository jdbcUserRepository = new JDBCUserRepository(
                "jdbc:postgresql://localhost:5434/aca",
                "postgres",
                "postgres"
        );

        jdbcUserRepository.deleteAll();
        jdbcUserRepository.save(user1);
        jdbcUserRepository.save(user2);
        jdbcUserRepository.save(user3);
        jdbcUserRepository.close();

    }

}
