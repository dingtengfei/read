package com.chairz.service.impl;

import com.chairz.entity.Author;
import com.chairz.mapper.AuthorMapper;
import com.chairz.service.AuthorService;
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
public class AuthorServiceImpl extends ServiceImpl<AuthorMapper, Author> implements AuthorService {
	
}
