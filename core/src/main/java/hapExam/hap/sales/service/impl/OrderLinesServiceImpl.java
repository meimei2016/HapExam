package hapExam.hap.sales.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hapExam.hap.sales.dto.OrderLines;
import hapExam.hap.sales.mapper.OrderLineMapper;
import hapExam.hap.sales.service.IOrderLinesService;

@Service
public class OrderLinesServiceImpl extends BaseServiceImpl<OrderLines> implements IOrderLinesService{
	@Autowired 
	OrderLineMapper OrderLineMapper;
	@Override
	public List<OrderLines> selectOrderLineDetail(IRequest requestContext, OrderLines orderLine, int page,
			int pagesize) {
		PageHelper.startPage(page, pagesize);
		List<OrderLines>list =OrderLineMapper.selectOrderLineDetail(orderLine);
		return list;
	}
	
}
