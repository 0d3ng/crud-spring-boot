/*
 * crud-spring-boot
 *
 * Copyright (c) 2019
 * All rights reserved
 * Written by od3ng created on 7/23/19 9:19 AM
 * Blog    : sinaungoding.com
 * Email   : noprianto@sinaungoding.com,lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */

package com.sinaungoding.crud.jdbc.dao;

import com.sinaungoding.crud.jdbc.entitas.Mahasiswa;

import java.util.List;

public interface MahasiswaDao {
    public boolean insert(Mahasiswa mahasiswa);

    public boolean update(Mahasiswa mahasiswa);

    public boolean delete(Mahasiswa mahasiswa);

    public Mahasiswa getByNim(String nim);

    public List<Mahasiswa> getAll();
}
