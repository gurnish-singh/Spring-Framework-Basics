package src.main;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AddController {
    @RequestMapping("/add")
    /*public ModelAndView add(HttpServletRequest request, HttpServletResponse response)*/
    public ModelAndView add(@RequestParam("t1") int i,@RequestParam("t2") int j){
        /*int i=Integer.parseInt(request.getParameter("t1"));
        int j=Integer.parseInt(request.getParameter("t2"));*/
        AddService as=new AddService();
       int k= as.add(i,j);
        ModelAndView obj=new ModelAndView();
        obj.setViewName("display.jsp");
        obj.addObject("result",k);
        return obj;
    }
}
