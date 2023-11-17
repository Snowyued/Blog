package com.yue.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yue.blog.mapper.AdMapper;
import com.yue.blog.service.IAdService;
import com.yue.entity.Ad;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 广告 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2023-11-17
 */
@Service
public class AdServiceImpl extends ServiceImpl<AdMapper, Ad> implements IAdService {

}
