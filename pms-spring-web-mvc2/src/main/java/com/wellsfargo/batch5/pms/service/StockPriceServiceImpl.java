package com.wellsfargo.batch5.pms.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellsfargo.batch5.pms.dto.CompanyDetailsDto;
import com.wellsfargo.batch5.pms.dto.StockPriceDto;
import com.wellsfargo.batch5.pms.exception.PMSException;
import com.wellsfargo.batch5.pms.repo.CompanyDetailsRepo;
import com.wellsfargo.batch5.pms.repo.StockPriceRepo;
import com.wellsfargo.batch5.pms.util.EMParser;

@Service
public class StockPriceServiceImpl implements StockPriceService {

	@Autowired
	private StockPriceRepo stockPriceRepo ;
	
	@Transactional
	@Override
	public StockPriceDto add(StockPriceDto stockDetail) throws PMSException {
		if (stockDetail != null) {
			if (stockPriceRepo.existsById(stockDetail.getStockId())) {
				throw new PMSException("book#" + stockDetail.getStockId() + " already exists");
			}
			stockDetail = EMParser.parse(stockPriceRepo.save(EMParser.parse(stockDetail)));
		}
		return stockDetail;
		
	}
	/*@Transactional
	@Override
	public BookModel add(BookModel book) throws LibraryException {
		if (book != null) {
			if (bookRepo.existsById(book.getBookCode())) {
				throw new LibraryException("book#" + book.getBookCode() + " already exists");
			}
			book = EMParser.parse(bookRepo.save(EMParser.parse(book)));
		}
		return book;
	}

	@Transactional
	@Override
	public BookModel update(BookModel book) throws LibraryException {
		if (book != null) {
			if (!bookRepo.existsById(book.getBookCode())) {
				throw new LibraryException("book#" + book.getBookCode() + " does not exists");
			}
			book = EMParser.parse(bookRepo.save(EMParser.parse(book)));
		}
		return book;
	}

	@Override
	public BookModel get(int bookCode) throws LibraryException {
		if (!bookRepo.existsById(bookCode)) {
			throw new LibraryException("book#" + bookCode + " does not exists");
		}
		return EMParser.parse(bookRepo.findById(bookCode).get());
	}
	
	@Transactional
	@Override
	public void delete(int bookCode) throws LibraryException {
		if (!bookRepo.existsById(bookCode)) {
			throw new LibraryException("book#" + bookCode + " does not exists");
		}
		bookRepo.deleteById(bookCode);
	}

	@Override
	public List<BookModel> getAll() throws LibraryException {
		return bookRepo.findAll().stream().map(e->EMParser.parse(e)).collect(Collectors.toList());
	}

	@Override
	public List<BookModel> getAll(GenreModel genre) throws LibraryException {
		return bookRepo.findAllByGenere(EMParser.parse(genre))
				.stream().map(e->EMParser.parse(e)).collect(Collectors.toList());
	}*/

	
	
}
