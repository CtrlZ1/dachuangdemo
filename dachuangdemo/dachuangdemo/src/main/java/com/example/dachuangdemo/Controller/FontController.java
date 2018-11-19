package com.example.dachuangdemo.Controller;

import com.example.dachuangdemo.model.HotPicture;
import com.example.dachuangdemo.model.LineAndBar;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

@Controller
public class FontController extends HttpServlet {

    private static String toJson(Object resultobj){
        if(resultobj!=null){
            JSONArray obj=JSONArray.fromObject(resultobj);
            return(obj.toString());
        }
        return"";
    }

    @RequestMapping("/index")
    public String index(HttpServletResponse response, HttpServletRequest request, Model model) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        ArrayList<String> a=new ArrayList<String>();
        a.add("one");
        a.add("tew");
        a.add("three");
        a.add("four");
        ArrayList<Integer> b=new ArrayList<Integer>();
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        LineAndBar lineAndBar=new LineAndBar(a,b);
        model.addAttribute("data",toJson(lineAndBar));
        return "index";
    }


    @RequestMapping("/page1_1")
    public String page1_1(HttpServletResponse response, HttpServletRequest request, Model model){

        model.addAttribute("t",9);
        return "menu1";
    }

    @RequestMapping("/page1_2")
    public String page1_2(HttpServletResponse response, HttpServletRequest request, Model model){

        model.addAttribute("t",9);
        return "menu2";
    }

    @RequestMapping("/page2_1")
    public String page2_1(HttpServletResponse response, HttpServletRequest request, Model model){

        model.addAttribute("t",9);
        return "article-list";
    }

    @RequestMapping("/page2_2")
    public String page2_2(HttpServletResponse response, HttpServletRequest request, Model model){

        model.addAttribute("t",9);
        return "danye-list";
    }
    @RequestMapping("/page2_3")
    public String hotPicture(HttpServletResponse response, HttpServletRequest request, Model model) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        HotPicture hp=new HotPicture(125.3247893,43.8868593,125);
        HotPicture hp1=new HotPicture(125.3,43.8868593,125);
        ArrayList<HotPicture> aHp=new ArrayList<HotPicture>();
        aHp.add(hp);
        aHp.add(hp1);
        model.addAttribute("hot",toJson(aHp));
        return "hotPicture";
    }

    @RequestMapping("/email")
    public String mail(HttpServletResponse response, HttpServletRequest request, Model model){
        return "email";
    }

    @RequestMapping("/person")
    public String person(HttpServletResponse response, HttpServletRequest request, Model model){
        return "admin-info";
    }

    @RequestMapping("/system")
    public String system(HttpServletResponse response, HttpServletRequest request, Model model){
        return "system";
    }

}
