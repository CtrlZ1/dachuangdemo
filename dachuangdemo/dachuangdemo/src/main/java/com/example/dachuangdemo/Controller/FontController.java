package com.example.dachuangdemo.Controller;

import com.example.dachuangdemo.Action.SendEmail;
import com.example.dachuangdemo.model.dataBase.*;
import com.example.dachuangdemo.model.dataGraph.HotPicture;
import com.example.dachuangdemo.model.dataGraph.LineAndBar;
import com.example.dachuangdemo.service.*;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FontController extends HttpServlet {
    //声明每个service都要加上@Autowired
    @Autowired
    BaseInfoService baseInfoService;
    @Autowired
    CommentService commentService;
    @Autowired
    CommunityInfoService communityInfoService;
    @Autowired
    HouseDesignService houseDesignService;
    @Autowired
    SaleInfoService saleInfoService;
    @Autowired
    TransportService transportService;

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

        List<BaseInfo> baseInfo= baseInfoService.getBaseInfo();
        model.addAttribute("baseInfo",baseInfo);
        return "page1_1";
    }

    @RequestMapping("/page1_2")
    public String page1_2(HttpServletResponse response, HttpServletRequest request, Model model){
        List<Comment> comment= commentService.getComment();
        model.addAttribute("comment",comment);
        return "page1_2";
    }

    @RequestMapping("/page1_3")
    public String page1_3(HttpServletResponse response, HttpServletRequest request, Model model){
        List<CommunityInfo> communityInfo= communityInfoService.getCommunityInfo();
        model.addAttribute("communityInfo",communityInfo);
        return "page1_3";
    }

    @RequestMapping("/page1_4")
    public String page1_4(HttpServletResponse response, HttpServletRequest request, Model model){
        List<HouseDesign> houseDesign= houseDesignService.getHouseDesign();
        model.addAttribute("houseDesign",houseDesign);
        return "page1_4";
    }

    @RequestMapping("/page1_5")
    public String page1_5(HttpServletResponse response, HttpServletRequest request, Model model){
        List<SaleInfo> saleInfo= saleInfoService.getSaleInfo();
        model.addAttribute("saleInfo",saleInfo);
        return "page1_5";
    }

    @RequestMapping("/page1_6")
    public String page1_6(HttpServletResponse response, HttpServletRequest request, Model model){
        List<Transport> transport= transportService.getTransport();
        model.addAttribute("transport",transport);
        return "page1_6";
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

    @RequestMapping("/LookInformation")
    public String LookInformation(@RequestParam(name="name",required = false) String ObjectUser,Model model){
        //System.out.println(ObjectUser);
        //String houseName=ObjectUser.replace("\"","");
        System.out.println(ObjectUser);
        List<BaseInfo> baseInfo= baseInfoService.getOneByName(ObjectUser);
        System.out.println(baseInfo);
        List<Comment> comment= commentService.getOneByName(ObjectUser);
        List<CommunityInfo> communityInfo= communityInfoService.getOneByName(ObjectUser);
        List<HouseDesign> houseDesign= houseDesignService.getOneByName(ObjectUser);
        List<SaleInfo> saleInfo= saleInfoService.getOneByName(ObjectUser);
        List<Transport> transport= transportService.getOneByName(ObjectUser);
        model.addAttribute("baseInfo",baseInfo);
        model.addAttribute("comment",comment);
        model.addAttribute("communityInfo",communityInfo);
        model.addAttribute("houseDesign",houseDesign);
        model.addAttribute("saleInfo",saleInfo);
        model.addAttribute("transport",transport);
        return "aim";
    }

    @RequestMapping("/search1")
    public String search(@RequestParam(name="title",required = false)String name,Model model){
        List<BaseInfo> baseInfo= baseInfoService.getOneByName(name);
        model.addAttribute("baseInfo",baseInfo);
        return "page1_1";
    }
    @RequestMapping("/search2")
    public String search2(@RequestParam(name="title",required = false)String name,Model model){
        List<Comment> comment= commentService.getOneByName(name);
        model.addAttribute("comment",comment);
        return "page1_2";
    }
    @RequestMapping("/search3")
    public String search3(@RequestParam(name="title",required = false)String name,Model model){
        List<CommunityInfo> communityInfo= communityInfoService.getOneByName(name);
        model.addAttribute("communityInfo",communityInfo);
        return "page1_3";
    }
    @RequestMapping("/search4")
    public String search4(@RequestParam(name="title",required = false)String name,Model model){
        List<HouseDesign> houseDesign= houseDesignService.getOneByName(name);
        model.addAttribute("houseDesign",houseDesign);
        return "page1_4";
    }
    @RequestMapping("/search5")
    public String search5(@RequestParam(name="title",required = false)String name,Model model){
        List<SaleInfo> saleInfo= saleInfoService.getOneByName(name);
        model.addAttribute("saleInfo",saleInfo);
        return "page1_5";
    }
    @RequestMapping("/search6")
    public String search6(@RequestParam(name="title",required = false)String name,Model model){
        List<Transport> transport= transportService.getOneByName(name);
        model.addAttribute("transport",transport);
        return "page1_6";
    }

    //发送邮件
    @RequestMapping("/email1")
    public String email()
    {
        SendEmail.sendEmail();
        return null;
    }
    @RequestMapping("/email2")
    public String email2()
    {
        SendEmail.sendEmail2();
        return null;
    }

    /*@RequestMapping("/test")
    public String test(@RequestParam(name="name",required =false) String name)
    {
        System.out.println(name);
        return "aim";
    }*/
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
