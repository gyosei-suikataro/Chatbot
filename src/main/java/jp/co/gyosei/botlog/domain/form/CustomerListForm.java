package jp.co.gyosei.botlog.domain.form;

import java.util.ArrayList;
import java.util.List;



public class CustomerListForm{
	private List<String> checkedUsers;
	
	public List<String> getCheckedUsers() {
        return checkedUsers;
    }
    public void setCheckedUsers(List<String> checkedUsers) {
        this.checkedUsers = checkedUsers;
    }
}

