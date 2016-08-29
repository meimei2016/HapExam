package hapExam.hap.sales.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.core.annotation.Children;
import com.hand.hap.system.dto.BaseDTO;

//@MultiLanguage
@Table(name="hap_om_order_headers")
public class OrderHeader extends BaseDTO{

	private static final long serialVersionUID = 1L;

	@Children
	
    private List<OrderLines> orderLines;


	public List<OrderLines> getOrderLines() {
		return orderLines;
	}
	
	@Id
    @Column
    @GeneratedValue
    private Long headerId;

	@Column
	@NotEmpty
	private String orderNumber;

	@Column
	@NotEmpty
	private Long companyId;

	@Column
	@NotEmpty
	private Date orderDate;

	@Column
	@NotEmpty
	private String orderStatus;

	@Column
	@NotEmpty
	private Long customerId;
	
	@Column
    private Long objectVersionNumber;
	 
	@Column
    private Long requestId;
	
	@Column
    private Long programId;
	
	@Column
    private Date creationDate;
	 
	@Column
    private Long createdBy;
	 
	@Column
    private Long lastUpdatedBy;

	@Column
	private Date lastUpdateDate;

	@Column
	private Long lastUpdateLogin;

	@Column
	private String attributeCategory;

	public OrderHeader() {
		super();
	}

	public Long getHeaderId() {
		return headerId;
	}

	public void setHeaderId(Long headerId) {
		this.headerId = headerId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getObjectVersionNumber() {
		return objectVersionNumber;
	}

	public void setObjectVersionNumber(Long objectVersionNumber) {
		this.objectVersionNumber = objectVersionNumber;
	}

	public Long getRequestId() {
		return requestId;
	}

	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}

	public Long getProgramId() {
		return programId;
	}

	public void setProgramId(Long programId) {
		this.programId = programId;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Long getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(Long lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
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

	public String getAttributeCategory() {
		return attributeCategory;
	}

	public void setAttributeCategory(String attributeCategory) {
		this.attributeCategory = attributeCategory;
	}
	
	
	
}
