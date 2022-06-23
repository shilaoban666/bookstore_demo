package com.shi.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

import com.shi.demo.pojo.Book;

public interface BookService extends IService<Book> {
    public IPage<Book> getPage(int CurrentPage, int Size);
}
