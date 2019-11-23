package com.zrx.gmall.user.mapper;

import com.zrx.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember>{
    List<UmsMember> selectAllUser();
}
