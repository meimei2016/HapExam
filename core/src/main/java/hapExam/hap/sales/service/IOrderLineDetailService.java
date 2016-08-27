package hapExam.hap.sales.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

import hapExam.hap.sales.dto.OrderLineDetail;

public interface IOrderLineDetailService extends IBaseService<OrderLineDetail>, ProxySelf<IOrderLineDetailService>{

	List<OrderLineDetail> selectOrderLineDetail(IRequest requestContext, OrderLineDetail orderLineDetail, int page, int pagesize);

}
