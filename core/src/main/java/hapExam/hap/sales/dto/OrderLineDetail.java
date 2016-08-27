package hapExam.hap.sales.dto;

public class OrderLineDetail extends OrderLines {

	private static final long serialVersionUID = 1L;
	private Long amount;
	private String itemDescription;
	private Long inventoryItemId;
	private String itemCode;
	
	
	public OrderLineDetail() {
		super();
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public Long getInventoryItemId() {
		return inventoryItemId;
	}
	public void setInventoryItemId(Long inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	

}
