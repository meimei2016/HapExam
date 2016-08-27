package hapExam.hap.sales.dto;

import java.util.Date;

public class OrderDetail{
	
	private Long headerId;
	private String orderNumber;
	private String companyName;
	private String customerName;
	private Date orderDate;
	private String orderStatus;
	private Long lineNumber;
	private Integer amount;
	private String itemDescription;
	private String itemCode;
	private Long orderdQuantity;
	private String orderQuantityUom;
	private String description;
	private Long unitSellingPrice;
    private String addition1;
    private String addition2;
    private String addition3;
    private String addition4;
    private String addition5;
    
	public OrderDetail() {
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
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
	public Long getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(Long lineNumber) {
		this.lineNumber = lineNumber;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public Long getOrderdQuantity() {
		return orderdQuantity;
	}
	public void setOrderdQuantity(Long orderdQuantity) {
		this.orderdQuantity = orderdQuantity;
	}
	public String getOrderQuantityUom() {
		return orderQuantityUom;
	}
	public void setOrderQuantityUom(String orderQuantityUom) {
		this.orderQuantityUom = orderQuantityUom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getUnitSellingPrice() {
		return unitSellingPrice;
	}
	public void setUnitSellingPrice(Long unitSellingPrice) {
		this.unitSellingPrice = unitSellingPrice;
	}
	public String getAddition1() {
		return addition1;
	}
	public void setAddition1(String addition1) {
		this.addition1 = addition1;
	}
	public String getAddition2() {
		return addition2;
	}
	public void setAddition2(String addition2) {
		this.addition2 = addition2;
	}
	public String getAddition3() {
		return addition3;
	}
	public void setAddition3(String addition3) {
		this.addition3 = addition3;
	}
	public String getAddition4() {
		return addition4;
	}
	public void setAddition4(String addition4) {
		this.addition4 = addition4;
	}
	public String getAddition5() {
		return addition5;
	}
	public void setAddition5(String addition5) {
		this.addition5 = addition5;
	}
    
    
}
