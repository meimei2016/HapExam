package hapExam.hap.sales.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hapExam.hap.sales.dto.Order;
import hapExam.hap.sales.dto.OrderDetail;

public interface OrderMapper extends Mapper<Order> {

	List<Order> selectByOrder(Order order);
	List<OrderDetail> selectDetialOrderInfo(Order order);

}
