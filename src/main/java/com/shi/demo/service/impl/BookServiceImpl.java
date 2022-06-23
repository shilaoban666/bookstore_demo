package com.shi.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shi.demo.dao.BookDao;
import com.shi.demo.pojo.Book;
import com.shi.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements BookService {
    @Autowired
    private BookDao bookDao;
    public IPage<Book> getPage(int CurrentPage,int Size){
        IPage page = new Page(CurrentPage,Size);
        bookDao.selectPage(page,null);
        return page;
    }
}
