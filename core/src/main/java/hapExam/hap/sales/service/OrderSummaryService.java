package hapExam.hap.sales.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.service.IBaseService;

import hapExam.hap.sales.dto.Order;
import hapExam.hap.sales.dto.OrderDetail;

public interface OrderSummaryService extends IBaseService<Order>, ProxySelf<OrderSummaryService>{
	
	 List<Order> selectByOrder(IRequest requestContext, Order order, int page, int pagesize);
	    
	 List<Order> batchUpdate(IRequest requestContext, @StdWho List<Order> orders);

	 List<OrderDetail> selectDetialOrderInfo(IRequest requestContext,int headerId,int page, int pagesize);

}
