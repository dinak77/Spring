package fr.DoctorWho.DoctorWho.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Doctors {

    @RequestMapping("/doctor/1")
    @ResponseBody
    public String firstDoctor(){
        return "William Hartnell";
    }

    @RequestMapping("/doctor/6")
    @ResponseBody
    public String sixthDoctor(){
        return "Colin Baker";
    }

    @RequestMapping("/doctor/9")
    @ResponseBody
    public String ninthDoctor(){
        return "Christopher Eccleston";
    }

    @RequestMapping("/doctor/12")
    @ResponseBody
    public String twelfthDoctor(){
        return "Peter Capaldi";
    }

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "<ul> Doctor Who:" +
                "<li><a href='/doctor/1'>First Doctor</a></li>" +
                "<li><a href='/doctor/6'>Sixth Doctor</a></li>" +
                "<li><a href='/doctor/9'>Ninth Doctor</a></li>" +
                "<li><a href='/doctor/12'>Eleventh Doctor</a></li>" +
                "</ul>";
    }
}