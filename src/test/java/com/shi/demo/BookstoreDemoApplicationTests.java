package com.shi.demo;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shi.demo.dao.BookDao;
import com.shi.demo.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Wrapper;

@SpringBootTest(classes = BookstoreDemoApplication.class)
class BookstoreDemoApplicationTests {

    @Autowired
    private BookDao bookDao;
    @Test
    void  test1(){
//        System.out.println(bookDao.selectList(null));
        bookDao.selectList(null);
    }
    @Test
    void testGetPage(){
        Page page = new Page(2,5);
        bookDao.selectPage(page,null);
        System.out.println("当前的页码值"+page.getCurrent());//当前的页码值
        System.out.println("每页显示的数"+page.getSize());//每页显示的数
        System.out.println("数据总量"+page.getTotal());//数据总量
        System.out.println("总页数"+page.getPages());//总页数
        System.out.println("详情数据"+page.getRecords());//详情数据
    }

    @Test
    void  testGetBy(){
        QueryWrapper<Book> queryWrapperr = new QueryWrapper<Book>();
        queryWrapperr.like("name","Spring");
        bookDao.selectList(queryWrapperr);
    }
    @Test
    void testGetBy2(){
        String name = "Spring";
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
        //if(name != null) lqw.like(Book::getName,name);		//方式一：JAVA代码控制
        lqw.like(name != null,Book::getName,name);				//方式二：API接口提供控制开关
        bookDao.selectList(lqw);
    }

}
