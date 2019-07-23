package com.sinaungoding.crud.jdbc;

import com.sinaungoding.crud.jdbc.dao.MahasiswaDao;
import com.sinaungoding.crud.jdbc.entitas.Mahasiswa;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JdbcApplicationTests {

    @Autowired
    private MahasiswaDao mahasiswaDao;

    @Test
    @Ignore
    public void insertTest() {
        Mahasiswa mahasiswa = new Mahasiswa("075410099", "Noprianto", 3.99F, "Teknik Informatika");
        assertTrue(mahasiswaDao.insert(mahasiswa));
    }

    @Test
    public void getByNimTest() {
        assertNotNull(mahasiswaDao.getByNim("075410099"));
    }

    @Test
    public void getAllTest() {
        assertTrue(!mahasiswaDao.getAll().isEmpty());
    }

}
