package com.yue.blog.service.impl;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yue.blog.entity.AdType;
import com.yue.blog.mapper.AdTypeMapper;
import com.yue.blog.service.IAdTypeService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * <p>
 * 广告类型 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2023-11-17
 */
@Service
public class AdTypeServiceImpl extends ServiceImpl<AdTypeMapper, AdType> implements IAdTypeService {


}
