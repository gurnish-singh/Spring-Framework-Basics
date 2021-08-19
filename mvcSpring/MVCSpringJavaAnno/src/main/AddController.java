package src.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class AddController {
    @RequestMapping("add")
    public ModelAndView add(@RequestParam("t1") int i,@RequestParam("t2") int j){

//       return ("result.jsp");
        int k= i+j;
        ModelAndView obj=new ModelAndView();
        obj.addObject("result",k);
        obj.setViewName("result.jsp");
        System.out.println("itworks");

        return obj;
    }
}
