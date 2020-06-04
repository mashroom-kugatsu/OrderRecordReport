package model;

import java.util.List;

import dao.OrderRecordDao;
import dto.OrderRecordDto;

public class GetOrderRecordListLogic {
	public List<OrderRecordDto> execute() {
		OrderRecordDao dao = new OrderRecordDao();
		List<OrderRecordDto> orderRecordList = dao.findAll();
		return orderRecordList;

	}

}
