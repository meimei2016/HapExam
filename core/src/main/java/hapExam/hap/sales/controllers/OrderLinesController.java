package hapExam.hap.sales.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.exception.BaseException;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import hapExam.hap.sales.dto.Order;
import hapExam.hap.sales.dto.OrderDetail;
import hapExam.hap.sales.dto.OrderLines;
import hapExam.hap.sales.service.IOrderLineDetailService;
import hapExam.hap.sales.service.IOrderLinesService;
import hapExam.hap.sales.service.OrderSummaryService;

@Controller
@RequestMapping(value="/sales/orderDetail")
public class OrderLinesController extends BaseController {
	
	@Autowired
	IOrderLinesService orderLinesService;
	@Autowired
	IOrderLineDetailService olds;
	@Autowired
	OrderSummaryService oss;
	
	@RequestMapping(path = "/query",method={RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public ResponseData getOrders(Order Order, 
    		@RequestParam(defaultValue = DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        List<OrderDetail> list=oss.selectDetialOrderInfo(requestContext, Order, page, pagesize);
        return new ResponseData(list);
    }
	@RequestMapping(value = "/submit", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData submitFruit(@RequestBody List<OrderLines> orderlines, BindingResult result, HttpServletRequest request)
            throws BaseException {
        getValidator().validate(orderlines, result);
        if (result.hasErrors()) {
            ResponseData rd = new ResponseData(false);
            rd.setMessage(getErrorMessage(result, request));
            return rd;
        }
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(orderLinesService.batchUpdate(requestContext, orderlines));
    }
	
}
