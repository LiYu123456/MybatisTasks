package com.tasks.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Mapper:基本的增删改查
 * MySqLMapper: 针对MySQL的额外接口,支持批量插入
 */
public interface IBaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
