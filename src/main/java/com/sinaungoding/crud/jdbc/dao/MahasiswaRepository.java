/*
 * crud-spring-boot
 *
 * Copyright (c) 2019
 * All rights reserved
 * Written by od3ng created on 7/23/19 9:21 AM
 * Blog    : sinaungoding.com
 * Email   : noprianto@sinaungoding.com,lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */

package com.sinaungoding.crud.jdbc.dao;

import com.sinaungoding.crud.jdbc.entitas.Mahasiswa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class MahasiswaRepository implements MahasiswaDao {

    private final String INSERT = "INSERT INTO mahasiswa (nim, nama, ipk, jurusan) "
            + "	VALUES (?,?,?,?)";
    private final String UPDATE = "UPDATE mahasiswa SET nama=?, ipk=?, jurusan=? WHERE nim=?";
    private final String DELETE = "DELETE FROM mahasiswa WHERE nim=?";
    private final String SELECT_ALL = "SELECT nim,nama,ipk,jurusan FROM mahasiswa";
    private final String SELECT_BY_NIM = "SELECT nim,nama,ipk,jurusan FROM mahasiswa WHERE nim=?";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public boolean insert(Mahasiswa mahasiswa) {
        return jdbcTemplate.update(INSERT, new Object[]{mahasiswa.getNim(), mahasiswa.getNama(), mahasiswa.getIpk(), mahasiswa.getJurusan()}) > 0 ? true : false;
    }

    @Override
    public boolean update(Mahasiswa mahasiswa) {
        return jdbcTemplate.update(UPDATE, new Object[]{mahasiswa.getNama(), mahasiswa.getIpk(), mahasiswa.getJurusan(), mahasiswa.getNim()}) > 0 ? true : false;
    }

    @Override
    public boolean delete(Mahasiswa mahasiswa) {
        return jdbcTemplate.update(DELETE, new Object[]{mahasiswa.getNim()}) > 0 ? true : false;
    }

    @Override
    public Mahasiswa getByNim(String nim) {
        return jdbcTemplate.queryForObject(SELECT_BY_NIM, new Object[]{nim}, new MahasiswaRowMapper());
    }

    @Override
    public List<Mahasiswa> getAll() {
        return jdbcTemplate.query(SELECT_ALL, new MahasiswaRowMapper());
    }

    private class MahasiswaRowMapper implements RowMapper<Mahasiswa> {

        @Override
        public Mahasiswa mapRow(ResultSet resultSet, int i) throws SQLException {
            Mahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.setNim(resultSet.getString("nim"));
            mahasiswa.setNama(resultSet.getString("nama"));
            mahasiswa.setJurusan(resultSet.getString("jurusan"));
            mahasiswa.setIpk(resultSet.getFloat("ipk"));
            return mahasiswa;
        }
    }
}
