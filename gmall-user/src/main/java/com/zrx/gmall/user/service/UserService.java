package com.zrx.gmall.user.service;

import com.zrx.gmall.user.bean.UmsMember;
import com.zrx.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
