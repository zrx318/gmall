package com.zrx.gmall.service;

import com.zrx.gmall.bean.UmsMember;
import com.zrx.gmall.bean.UmsMember;
import com.zrx.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
