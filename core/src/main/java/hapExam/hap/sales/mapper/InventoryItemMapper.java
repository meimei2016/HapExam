package hapExam.hap.sales.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hapExam.hap.sales.dto.Companys;
import hapExam.hap.sales.dto.InventoryItem;

public interface InventoryItemMapper extends Mapper<InventoryItem> {

	List<Companys> selectCompany(InventoryItem inventoryItem);

}
