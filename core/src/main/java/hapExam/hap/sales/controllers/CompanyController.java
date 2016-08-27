package hapExam.hap.sales.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import hapExam.hap.sales.dto.Companys;
import hapExam.hap.sales.service.ICompanyService;

@Controller
@RequestMapping(value="/sales")
public class CompanyController extends BaseController{
	@Autowired
	ICompanyService companyService;
	
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
    @RequestMapping("/query/company")
    @ResponseBody
    public ResponseData getCompanys(Companys company, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        List<Companys> list=companyService.select(requestContext, company, page, pagesize);
        return new ResponseData(list);
    }
	
	

}
