package com.github.ravisuthar.client;

import com.github.ravisuthar.services.BookShelfService;
import com.github.ravisuthar.vo.BookVO;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class DemoClient {
	public static void main(String[] args) {
		String serviceUrl = "http://localhost:8080/arm-endpoint-war/bookshelfservice";
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(BookShelfService.class);
		factory.setAddress(serviceUrl);
		BookShelfService bookService = (BookShelfService) factory.create();

		// insert book
		BookVO bookVO = new BookVO();
		bookVO.setAuthor("Issac Asimov");
		bookVO.setBookName("Foundation and Earth");

		String result = bookService.insertBook(bookVO);

		System.out.println("result : " + result);

		bookVO = new BookVO();
		bookVO.setAuthor("Issac Asimov");
		bookVO.setBookName("Foundation and Empire");

		result = bookService.insertBook(bookVO);

		System.out.println("result : " + result);

		bookVO = new BookVO();
		bookVO.setAuthor("Arthur C Clarke");
		bookVO.setBookName("Rama Revealed");

		result = bookService.insertBook(bookVO);

		System.out.println("result : " + result);

		// retrieve book

		bookVO = bookService.getBook("Foundation and Earth");

		System.out.println("book name : " + bookVO.getBookName());
		System.out.println("book author : " + bookVO.getAuthor());

	}
}