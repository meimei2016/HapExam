package hapExam.hap.sales.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import hapExam.hap.sales.dto.InventoryItem;
import hapExam.hap.sales.service.IInventoryItemService;

@Controller
@RequestMapping(value="/sales")
public class InventoryItemController extends BaseController {
	
	@Autowired
	IInventoryItemService itemService;
	

	 /**
    * 任务分配查询.
    * 
    * @param order
    *            分配对象
    * @param page
    *            起始页
    * @param pagesize
    *            分页大小
    * @param request
    *            HttpServletRequest
    * @return ResponseData
    */
   @RequestMapping(path = "/query/inventoryItem",method={RequestMethod.POST,RequestMethod.GET})
   @ResponseBody
   public ResponseData getCompanys(InventoryItem item, 
		   @RequestParam(defaultValue = DEFAULT_PAGE) int page,
           @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize,
           @RequestParam(name="itemFlag",defaultValue="" ) String itemFlag,
           HttpServletRequest request) {
	   item.setEnabledFlag(itemFlag);
       IRequest requestContext = createRequestContext(request);
       List<InventoryItem>list=itemService.select(requestContext, item, page, pagesize);
       return new ResponseData(list);
   }

}
