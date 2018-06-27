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

package com.usst.cpf.springboot.mapper;

import com.usst.cpf.springboot.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> findAllUser();
}
