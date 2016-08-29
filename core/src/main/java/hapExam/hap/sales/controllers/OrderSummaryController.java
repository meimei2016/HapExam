package hapExam.hap.sales.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import hapExam.hap.sales.dto.Order;
import hapExam.hap.sales.dto.OrderDetail;
import hapExam.hap.sales.service.IOrderLinesService;
import hapExam.hap.sales.service.OrderSummaryService;

@Controller
@RequestMapping(value="/sales/orderSummary")
public class OrderSummaryController extends BaseController{
	
	@Autowired
	OrderSummaryService orderSummaryService;
	@Autowired
	IOrderLinesService orderLinesService;
	
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
    @RequestMapping(path = "/query",method={RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public ResponseData getOrders(Order order, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        
        return new ResponseData(orderSummaryService.selectByOrder(requestContext, order, page, pagesize));
    }
    
   @RequestMapping(path = "/showDetailInfo",method={RequestMethod.GET})
   @ResponseBody
   public ModelAndView showDetailOrderInfo(HttpServletRequest request,HttpServletResponse response,@RequestParam(value="headerId", defaultValue ="0") Long headerId){
	   
	   ModelAndView modelAndView=new ModelAndView();
	   IRequest requestContext = createRequestContext(request);   
	   Order order=new Order();
	   order.setHeaderId(headerId);
	   List<OrderDetail> list=orderSummaryService.selectDetialOrderInfo(requestContext,order,1,10);
	   modelAndView.addObject(new ResponseData(list));
	   modelAndView.setViewName(getViewPath()+"/salesOrder/orderDetail");
	   return modelAndView;
   }
        
}

