package hapExam.hap.sales.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hapExam.hap.sales.dto.Companys;

public interface CompanyMapper extends Mapper<Companys> {

	List<Companys> selectCompany(Companys company);

}
