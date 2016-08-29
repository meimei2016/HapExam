package hapExam.hap.sales.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hapExam.hap.sales.dto.Order;
import hapExam.hap.sales.dto.OrderDetail;
import hapExam.hap.sales.mapper.OrderMapper;
import hapExam.hap.sales.service.OrderSummaryService;

@Service
public class OrderSummaryServiceImpl extends BaseServiceImpl<Order> implements OrderSummaryService {

	@Autowired
	private OrderMapper orderMpper;
	
	@Override
	public List<Order> selectByOrder(IRequest requestContext, Order order, int page, int pagesize){
		
		PageHelper.startPage(page, pagesize);//分页
		return orderMpper.selectByOrder(order);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<Order> batchUpdate(IRequest requestContext,  @StdWho List<Order> orders) {
        return null;
	}

	@Override
	public List<OrderDetail> selectDetialOrderInfo(IRequest requestContext,Order order,int page,int pagesize) {
		PageHelper.startPage(page, pagesize);
		List<OrderDetail> list=orderMpper.selectDetialOrderInfo(order);
		return list;
	}


	

	
}
