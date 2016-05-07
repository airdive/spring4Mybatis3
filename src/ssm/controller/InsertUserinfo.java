package ssm.controller;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Transactional
public class InsertUserinfo extends BaseAction {

	@RequestMapping(value = "insertUserinfo")
	public String insertUserinfo() {
		System.out.println("into insertUserinfo controller");
		this.getAllService().getUserinfoService().insertUserinfo("法国1",
				"法国人11", 100, new Timestamp(new Date().getTime()));
//		this.getAllService()
//			.getUserinfoService()
//			.insertUserinfo("法国2",
//						"法国人22法国人22法国人22法国人22法国人22法国人22法国人22法国人22法国人22法国人22法国人22法国人22法国人22法国人22法国人22法国人22法国人22法国人22法国人22法国人22法国人22法国人22法国人22法国人22法国人22法国人22法国人22法国人22法国人22法国人22",
//						200, new Timestamp(new Date().getTime()));
		return "index.jsp";
	}
}
