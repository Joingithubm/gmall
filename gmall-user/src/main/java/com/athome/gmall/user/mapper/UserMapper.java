package com.athome.gmall.user.mapper;

import com.athome.gmall.user.dao.UmsMember;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {
    List<UmsMember> selectAllUser();
}
