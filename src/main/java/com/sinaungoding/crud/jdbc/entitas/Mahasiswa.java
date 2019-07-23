/*
 * crud-spring-boot
 *
 * Copyright (c) 2019
 * All rights reserved
 * Written by od3ng created on 7/23/19 9:14 AM
 * Blog    : sinaungoding.com
 * Email   : noprianto@sinaungoding.com,lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */

package com.sinaungoding.crud.jdbc.entitas;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

@Getter
@Setter
public class Mahasiswa {
    @NonNull
    private String nim;
    @NonNull
    private String nama;
    @NonNull
    private float ipk;
    @NonNull
    private String jurusan;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String nama, float ipk, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.jurusan = jurusan;
    }
}
