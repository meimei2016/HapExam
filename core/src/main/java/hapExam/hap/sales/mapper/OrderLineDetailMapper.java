package hapExam.hap.sales.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hapExam.hap.sales.dto.OrderLineDetail;

public interface OrderLineDetailMapper extends Mapper<OrderLineDetail> {
	public List<OrderLineDetail> selectOrderLineDetail(OrderLineDetail orderLineDetail);
}
