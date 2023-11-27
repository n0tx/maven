package com.riki.belajarmaven.repository;

import com.riki.belajarmaven.domain.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    final String SELECT_BY_ID = "select * from hello where id = ?";

    public Hello getHelloMessage(Long id) {
        return this.jdbcTemplate.queryForObject(SELECT_BY_ID, new BeanPropertyRowMapper<>(Hello.class), id);
    }

}
