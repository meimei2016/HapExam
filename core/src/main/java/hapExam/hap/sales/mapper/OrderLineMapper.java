package hapExam.hap.sales.mapper;


import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hapExam.hap.sales.dto.OrderLines;

public interface OrderLineMapper extends Mapper<OrderLines> {

	List<OrderLines> selectOrderLineDetail(OrderLines orderLine);

}
