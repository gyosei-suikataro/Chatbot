package jp.co.gyosei.botlog.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
/*
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

import org.springframework.web.bind.annotation.DeleteMapping;
*/
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;

import jp.co.gyosei.botlog.domain.entity.CustinfoEntity;
import jp.co.gyosei.botlog.domain.service.CustinfoService;
import jp.co.gyosei.botlog.domain.repository.CustinfoRepository;

import java.util.List;
import java.util.ArrayList;

@Controller
@RequestMapping("CustomerList")
public class CustomerListController {

	@Autowired
    CustinfoService custinfoService;
	
	@Autowired
	CustinfoRepository custinfoRepository;
	
	
	@GetMapping
	public String list(Model model) {
		List<CustinfoEntity> custinfoEntity = custinfoRepository.findAll();
		model.addAttribute("custinfoEntity",custinfoEntity);
		return "CustomerList";
	}
	
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	void delete(@RequestParam(value="rowIds[]") Integer[] rowIds) {
		for (int no: rowIds){
			custinfoRepository.delete(no);
			}	
	}
}
