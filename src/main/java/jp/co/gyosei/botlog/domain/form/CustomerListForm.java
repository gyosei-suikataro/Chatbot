package jp.co.gyosei.botlog.domain.form;


public class CustomerListForm {
	
	 //private Integer[] rowIds = new Integer[] {16,17,18,19};
	 private Integer[]  rowIds;
	 
	 public CustomerListForm() {}
	 
	 public CustomerListForm(Integer[] rowIds) {
		 this.rowIds = rowIds;
	 }
	 
	 public Integer[] getRowIds() {
	        return rowIds;
	    }
	 
	 public void setRowIds(Integer[] rowIds) {
	        this.rowIds = rowIds;
	    }
}
