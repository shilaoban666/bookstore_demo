package com.shi.demo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.shi.demo.pojo.Book;
import com.shi.demo.pojo.Result;
import com.shi.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService service;

    @GetMapping
    public Result getAll(){
        List<Book> listbook = service.list();
        return new Result(true,listbook);
    }
    @GetMapping("{id}")
    public Result getByid(@PathVariable Integer id){
        Book book = service.getById(id);
        return new Result(true,book);
    }
    @PostMapping
    public Result save(@RequestBody Book book){
        boolean flag = service.save(book);
        return new Result(flag);

    }
    @PutMapping
    public Result updata(@RequestBody Book book){
        boolean flag = service.updateById(book);

        return new Result(flag);
    }

    @DeleteMapping("{id}")
    public Result delete(@PathVariable Integer id){
        boolean flag = service.removeById(id);
        return new Result(flag);
    }
    @GetMapping("{currentPage}/{pageSize}")
    public Result getPage(@PathVariable int currentPage, @PathVariable int pageSize){
        IPage<Book> page = service.getPage(currentPage, pageSize);
        return new Result(true,page);
    }


}
