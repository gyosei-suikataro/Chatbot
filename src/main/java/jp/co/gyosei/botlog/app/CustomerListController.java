package jp.co.gyosei.botlog.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import jp.co.gyosei.botlog.domain.entity.CustinfoEntity;
import jp.co.gyosei.botlog.domain.form.CustomerListForm;
import jp.co.gyosei.botlog.domain.service.CustinfoService;
import jp.co.gyosei.botlog.domain.repository.CustinfoRepository;

import java.util.List;

@Controller
public class CustomerListController {

	@Autowired
    CustinfoService custinfoService;
	
	@Autowired
	CustinfoRepository custinfoRepository;
	
	@RequestMapping(value = "CustomerList", method = RequestMethod.GET)
	public String list(Model model) {
		List<CustinfoEntity> custinfoEntity = custinfoRepository.findAll();
		model.addAttribute("custinfoEntity",custinfoEntity);
		model.addAttribute("customerListForm", new CustomerListForm());
		return "CustomerList";
	}
		
	@RequestMapping(value = "CustomerList", method = RequestMethod.POST)
    public String customerPost(Model model, @Valid CustomerListForm customerListForm, BindingResult bindingResult, HttpServletRequest request) {
		
		Integer[] rowIdsdata = customerListForm.getRowIds();
		for(int i = 0; i < rowIdsdata.length; i++) {
			Integer no = rowIdsdata[i];
			custinfoRepository.delete(no);
		}
		
		return "Customer";
	}
	
}