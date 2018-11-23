package com.example.dachuangdemo.Controller;

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
import org.springframework.web.bind.annotation.ResponseBody;

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
    @ResponseBody
    public String LookInformation(@RequestParam String ObjectUser,Model model){
        //System.out.println(ObjectUser);
        System.out.println(ObjectUser);
        BaseInfo baseInfo= baseInfoService.getOneByName(ObjectUser);
        //System.out.println(baseInfo.getName());
        List<Comment> comment= commentService.getComment();
        List<CommunityInfo> communityInfo= communityInfoService.getCommunityInfo();
        List<HouseDesign> houseDesign= houseDesignService.getHouseDesign();
        List<SaleInfo> saleInfo= saleInfoService.getSaleInfo();
        List<Transport> transport= transportService.getTransport();
        model.addAttribute("house",baseInfo);
        return "success";
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
