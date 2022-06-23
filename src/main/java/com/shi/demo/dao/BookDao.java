package com.shi.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shi.demo.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {
}
