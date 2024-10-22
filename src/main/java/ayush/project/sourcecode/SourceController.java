package ayush.project.sourcecode;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class SourceController {

    @Autowired
    CenterRepo cro;

    @RequestMapping("/")
    public String startup()
    {
        return "index";
    }
    
    @PostMapping("/storecenter")
    public String storeaCenter(@ModelAttribute CentersCollection cc) {
        this.cro.save(cc);
        return "index";
    }

    @RequestMapping("/viewall")
    @ResponseBody
    public List<CentersCollection> requestMethodName() {

        return cro.findAll();
    }
}