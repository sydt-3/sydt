package com.sydt.common.exception.user;

/**
 * 角色锁定异常类
 * 
 * @author jianwei.zhang
 */
public class RoleBlockedException extends UserException
{
    private static final long serialVersionUID = 1L;

    public RoleBlockedException()
    {
        super("role.blocked", null);
    }
}
