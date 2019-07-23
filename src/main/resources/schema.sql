/* 
 * maven-crud-mysql

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on May 27, 2019 10:30:40 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
/**
 * Author:  od3ng
 * Created: May 27, 2019
 */

-- CREATE DATABASE IF NOT EXISTS akademik;

-- USE akademik;

CREATE TABLE IF NOT EXISTS mahasiswa(
nim VARCHAR(10) NOT NULL,
nama VARCHAR(50) NOT NULL,
ipk FLOAT(4,2) NOT NULL,
jurusan VARCHAR(25) NOT NULL,
PRIMARY KEY(nim)
)ENGINE=InnoDB;

-- INSERT INTO mahasiswa VALUES('075410099','Noprianto',4.00,'Teknologi Informasi');
-- INSERT INTO mahasiswa VALUES('075410100','Noureen Akhlema Shannum',4.00,'Pendidikan Bahasa Inggris');
-- INSERT INTO mahasiswa VALUES('075410101','Uwais Al-Qarny',3.99,'Teknik Sipil');
