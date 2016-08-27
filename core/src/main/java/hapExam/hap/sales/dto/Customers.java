package hapExam.hap.sales.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

//@MultiLanguage
@Table(name = "hap_ar_customers")
public class Customers {
	
	@Id
    @Column    
    @GeneratedValue
	private Long customerId;
	
	@Column
	@NotEmpty
	private String customerNumber;
	
	@Column
	@NotEmpty
	private Long companyId;
	
	@Column
	@NotEmpty
	private String enabledFlag;
	
	@Column
	private Date lastUpdateDate;
	
	@Column
	@NotEmpty
	private String customerName;
	
	@Column
	private Long lastUpdateLogin;
	
	
	public Customers() {
		super();
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public String getEnabledFlag() {
		return enabledFlag;
	}
	public void setEnabledFlag(String enabledFlag) {
		this.enabledFlag = enabledFlag;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public Long getLastUpdateLogin() {
		return lastUpdateLogin;
	}
	public void setLastUpdateLogin(Long lastUpdateLogin) {
		this.lastUpdateLogin = lastUpdateLogin;
	}
	
	
	
	

}
