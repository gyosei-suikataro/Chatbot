package jp.co.gyosei.botlog.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.gyosei.botlog.domain.entity.CustinfoEntity;
import jp.co.gyosei.botlog.domain.entity.CustinfoEntityImpl;
import jp.co.gyosei.botlog.domain.service.CustinfoService;
import jp.co.gyosei.botlog.domain.service.CustinfoService2;
import jp.co.gyosei.botlog.domain.repository.CustinfoRepository;
import jp.co.gyosei.botlog.domain.repository.CustinfoRepositoryCustom;

import java.util.List;

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

	/*
	@PostMapping
	@ResponseBody
		public void delete(@RequestBody no[] NO) {
		  repository.delete(NO);

		    }
	 */

	@Controller
	@RequestMapping("menu")
	public class CustomerListController2{

		@Autowired
		CustinfoService2 custinfoService2;

		@Autowired
		CustinfoRepositoryCustom custinfoRepositoryCustom;

		@GetMapping
		public String list(Model model) {
			List<CustinfoEntityImpl> custinfoEntityImpl = custinfoRepositoryCustom.findAll();
			model.addAttribute("custinfoEntityImpl",custinfoEntityImpl);
			return "menu";
		}
	}
}
