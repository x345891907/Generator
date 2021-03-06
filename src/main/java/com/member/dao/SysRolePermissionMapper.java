package com.member.dao;

import com.member.entity.SysRolePermission;
import java.util.List;

public interface SysRolePermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRolePermission record);

    SysRolePermission selectByPrimaryKey(Integer id);

    List<SysRolePermission> selectAll();

    int updateByPrimaryKey(SysRolePermission record);
}