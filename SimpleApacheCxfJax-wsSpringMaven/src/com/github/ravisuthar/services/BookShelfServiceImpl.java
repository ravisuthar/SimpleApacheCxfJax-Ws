package com.github.ravisuthar.services;

import javax.jws.WebService;

import com.github.ravisuthar.vo.BookVO;

@WebService(endpointInterface = "com.github.ravisuthar.services.BookShelfService", serviceName="bookShelfService")
public class BookShelfServiceImpl implements BookShelfService {
    public String insertBook(BookVO bookVO) {
        return "Book with name : " + bookVO.getBookName() + " is now available on the shelf";  //To change body of implemented methods use File | Settings | File Templates.
    }

    public BookVO getBook(String title) {

        return new BookVO();
    }
}