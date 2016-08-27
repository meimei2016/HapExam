package hapExam.hap.sales.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

import hapExam.hap.sales.dto.OrderLines;

public interface IOrderLinesService extends IBaseService<OrderLines>, ProxySelf<IOrderLinesService>{

	List<OrderLines> selectOrderLineDetail(IRequest requestContext, OrderLines orderLine, int page, int pageSize);

}
