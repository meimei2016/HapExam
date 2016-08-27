package hapExam.hap.sales.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hapExam.hap.sales.dto.OrderLineDetail;
import hapExam.hap.sales.mapper.OrderLineDetailMapper;
import hapExam.hap.sales.service.IOrderLineDetailService;

@Service 
public class OrderLineDetailServiceImpl extends BaseServiceImpl<OrderLineDetail> implements IOrderLineDetailService{
	@Autowired
	OrderLineDetailMapper oldm;
	@Override
	public List<OrderLineDetail> selectOrderLineDetail(IRequest requestContext, OrderLineDetail orderLineDetail, int page,
			int pagesize) {
		PageHelper.startPage(page, pagesize);
		List<OrderLineDetail> list=oldm.selectOrderLineDetail(orderLineDetail);
		return list;
	}

}
