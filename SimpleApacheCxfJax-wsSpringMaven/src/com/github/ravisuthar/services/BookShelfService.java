package com.github.ravisuthar.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.github.ravisuthar.vo.BookVO;

@WebService
public interface BookShelfService {

	@WebMethod
	public String insertBook(BookVO bookVO);

	@WebMethod
	public BookVO getBook(String title);
}