/*******************************************************************************
 *  Copyright (C) 2018 iQIYI Holdings, Inc.
 *  All Rights Reserved.
 *
 *  This file is part of cloud service. Unauthorized copy of this file, via any
 *  medium is strictly prohibited. Proprietary and Confidential.
 *
 *  Author(s):
 *      Pufang Cheng <chengpufang_sx@qiyi.com>
*******************************************************************************/

package com.usst.cpf.springboot.entity;

public class User {
    private int id;
    private String name;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
