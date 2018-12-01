package com.example.dachuangdemo.Controller;

import com.example.dachuangdemo.Action.SendEmail;
import com.example.dachuangdemo.model.HotPicture;
import com.example.dachuangdemo.model.LineAndBar;
import com.example.dachuangdemo.model.Scatter;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FontController extends HttpServlet {

    private static String toJson(Object resultobj){
        if(resultobj!=null){
            JSONArray obj=JSONArray.fromObject(resultobj);
            return(obj.toString());
        }
        return"";
    }
    private static String toJson2(Object resultobj){
        if(resultobj!=null){
            JSONObject obj=JSONObject.fromObject(resultobj);
            return obj.toString();
        }
        return null;
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

    //Email
    @RequestMapping("/sendemail")
    public String sendemail(){
        SendEmail.sendEmail2();
        return null;
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
        Scatter[] scatter=new Scatter[4];
        scatter[0]=new Scatter("北京",100);
        scatter[1]=new Scatter("上海",80);
        scatter[2]=new Scatter("广州",60);
        scatter[3]=new Scatter("深圳",40);
        model.addAttribute("data",toJson(scatter));
        Map<String, Object> map=new HashMap<String, Object>();
        List<Double> list1=new ArrayList<Double>();
        list1.add(116.46);
        list1.add(39.92);
        List<Double> list2=new ArrayList<Double>();
        list2.add(121.48);
        list2.add(31.22);
        List<Double> list3=new ArrayList<Double>();
        list3.add(113.23);
        list3.add(23.16);
        List<Double> list4=new ArrayList<Double>();
        list4.add(114.07);
        list4.add(22.62);
        map.put("北京",list1);
        map.put("上海",list2);
        map.put("广州",list3);
        map.put("深圳",list4);
        model.addAttribute("map",toJson2(map));
        //request.setAttribute("map",map);
        //System.out.println(map.get("北京"));
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
