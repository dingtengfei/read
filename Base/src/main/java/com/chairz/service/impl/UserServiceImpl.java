package com.chairz.service.impl;

import com.readsea.entity.User;
import com.chairz.mapper.UserMapper;
import com.chairz.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ChaiRZ
 * @since 2019-03-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
	
}
