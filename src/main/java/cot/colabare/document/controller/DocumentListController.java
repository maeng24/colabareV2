package cot.colabare.document.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cot.colabare.approval.domain.ApprovalCriteria;
import cot.colabare.approval.domain.ApprovalDto;
import cot.colabare.approval.domain.PageDTO;
import cot.colabare.approval.service.ApprovalService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@RequestMapping("/document/*")
@Controller
@Log4j
@AllArgsConstructor
public class DocumentListController {
	
	private ApprovalService service;
	
	// 내가보낸 결재문서 목록
	@GetMapping("/approvalList")
	public void sentList( Model model, @RequestParam(value="employee_no") Long employee_no){
		
		model.addAttribute("list", service.sentList(employee_no));
		
	}
	
	// 문서 목록 페이지 이동
	@GetMapping("/documentList")
	public void documentList(){
		log.info("문서 목록으로 이동 ");
		System.out.println("문서목록으로 이동");
		
	}
	
	@GetMapping("/detailReceive")
	public void detailReceive(@RequestParam("approval_no") Long approval_no, Model model){
		
		model.addAttribute("detailReceive", service.detailReceive(approval_no));
	}
	
	@GetMapping("/detailDoc22")
	public void detailDoc22(@RequestParam("approval_no") Long approval_no, Model model){
		
		model.addAttribute("detailReceive", service.detailReceive(approval_no));
	}
	@GetMapping("/detailDocV22")
	public void detailDocV22(@RequestParam("approval_no") Long approval_no, Model model){
		
		model.addAttribute("detailReceive", service.detailReceive(approval_no));
	}
	@GetMapping("/detailDocV41")
	public void detailDocV41(@RequestParam("approval_no") Long approval_no, Model model){
		
		model.addAttribute("detailReceive", service.detailReceive(approval_no));
	}
	@GetMapping("/detailDoc41")
	public void detailDoc41(@RequestParam("approval_no") Long approval_no, Model model){
		
		model.addAttribute("detailReceive", service.detailReceive(approval_no));
	}
	@GetMapping("/detailDoc42")
	public void detailDoc42(@RequestParam("approval_no") Long approval_no, Model model){
		
		model.addAttribute("detailReceive", service.detailReceive(approval_no));
	}
	@GetMapping("/detailDoc61")
	public void detailDo61(@RequestParam("approval_no") Long approval_no, Model model){
		
		model.addAttribute("detailReceive", service.detailReceive(approval_no));
	}
	@GetMapping("/detailDocV61")
	public void detailDocV61(@RequestParam("approval_no") Long approval_no, Model model){
		
		model.addAttribute("detailReceive", service.detailReceive(approval_no));
	}
	
	@GetMapping("/detailDoc62")
	public void detailDoc62(@RequestParam("approval_no") Long approval_no, Model model){
		
		model.addAttribute("detailReceive", service.detailReceive(approval_no));
	}
	@GetMapping("/detailDoc63")
	public void detailDoc63(@RequestParam("approval_no") Long approval_no, Model model){
		
		model.addAttribute("detailReceive", service.detailReceive(approval_no));
	}
	@GetMapping("/detailDoc64")
	public void detailDoc64(@RequestParam("approval_no") Long approval_no, Model model){
		
		model.addAttribute("detailReceive", service.detailReceive(approval_no));
	}
	@GetMapping("/detailDoc65")
	public void detailDoc65(@RequestParam("approval_no") Long approval_no, Model model){
		
		model.addAttribute("detailReceive", service.detailReceive(approval_no));
	}
	@GetMapping("/detailDoc66")
	public void detailDoc66(@RequestParam("approval_no") Long approval_no, Model model){
		
		model.addAttribute("detailReceive", service.detailReceive(approval_no));
	}
	@GetMapping("/detailDoc81")
	public void detailDoc81(@RequestParam("approval_no") Long approval_no, Model model){
		
		model.addAttribute("detailReceive", service.detailReceive(approval_no));
	}
	
	@GetMapping("example1")
	public void example1(){
		
	}
	
	// 전자결재 목록 게시판
	/*@GetMapping("approvalList")
	public void approvalList(@RequestParam(value="employee_no") Long employee_no){
		
	}*/
	
	@GetMapping("document1")
	public void documentexam(){
		
	}
	@GetMapping("document2")
	public void documentexam2(){
		
	} 
	@GetMapping("document3")
	public void documentexam3(){
		
	} 
	@GetMapping("document4")
	public void documentexam4(){
		
	} 
	@GetMapping("document5")
	public void documentexam5(){
		
	} 
	@GetMapping("document6")
	public void documentexam6(){
		
	} 
	@GetMapping("document7")
	public void documentexam7(){
		
	} 
	@GetMapping("document8")
	public void documentexam8(){
		
	} 
	@GetMapping("document9")
	public void documentexam9(){
		
	} 
	@GetMapping("document10")
	public void documentexam10(){
		
	} 
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
