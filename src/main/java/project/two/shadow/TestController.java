package project.two.shadow;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		System.out.println("hello controller 실행중");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/test/test"); //view네임 설정 
		mv.addObject("insa", "hellohello");//add object - 컨트롤러가 뷰쪽으로 모델(데이터) 전달
		return mv;
	}

}
