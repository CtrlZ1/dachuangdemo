package com.example.dachuangdemo.Controller;

import com.example.dachuangdemo.model.dataBase.*;
import com.example.dachuangdemo.model.dataGraph.LineAndBar;
import com.example.dachuangdemo.model.dataGraph.Pie;
import com.example.dachuangdemo.model.dataGraph.Scatter;
import com.example.dachuangdemo.service.*;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
    @Autowired
    HotPictureService hotPictureService;
    @Autowired
    AllInfoService allInfoService;
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
    public String index(HttpServletResponse response, HttpServletRequest request, Model model ) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        Cookie []cookie=request.getCookies();
        int t=0;
        if (cookie!=null){
            for(Cookie c:cookie){
                if(c.getName().equals("login")&&c.getValue().equals("ok"))
                    t=1;
            }
        }
        if(t==0)
            return "redirect:login";
//        try {
//            String session=request.getSession().getAttribute("login").toString();
//            if(!session.equals("ok"))
//                return "redirect:login";
//        }catch (NullPointerException e){
//            return "redirect:login";
//        }
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

        //主页展示的评论数、房屋数、小区数(来源表:commentinfo,baseinfo,communityinfo)
        int commentNum,houseNum,communityNum;
        commentNum=commentService.getNum();
        houseNum=baseInfoService.getNum();
        communityNum=communityInfoService.getNum();
        model.addAttribute("commentNum",commentNum);
        model.addAttribute("communityNum",communityNum);
        model.addAttribute("houseNum",houseNum);
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
    public String page2_1(HttpServletResponse response, HttpServletRequest request, Model model) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        Map<String, BigDecimal> state=allInfoService.getState();
        List<Pie> pies=new ArrayList<Pie>();
        for (String key : state.keySet()) {
            Pie p=new Pie(key,state.get(key).intValue());
            pies.add(p);
        }
        model.addAttribute("pies",toJson(pies));

        //楼盘特征词云图：低总价15,公交枢纽14,低密度13,婚房12,投资地产11,公园10,商场9,公寓8,大型超市7,轨交房6,大型社区5,品牌开发商4,改善房3,学校2,刚需房1
        Map<String, BigDecimal> feature=allInfoService.getFeature();
        List<Pie> features=new ArrayList<Pie>();
        for (String key : feature.keySet()) {
            Pie p=new Pie(key,feature.get(key).intValue());
            features.add(p);
        }
        model.addAttribute("features",toJson(features));


        Map<String, BigDecimal> location=allInfoService.getLocation();
        List<Pie> locations=new ArrayList<Pie>();
        for (String key : location.keySet()) {
            Pie p=new Pie(key,location.get(key).intValue());
            locations.add(p);
        }
        model.addAttribute("locations",toJson(locations));

        List<Integer> prices=allInfoService.getPrice();
        model.addAttribute("prices",toJson(prices));

        return "page2_1";
    }

//    @RequestMapping("/page2_2")
//    public String page2_2(HttpServletResponse response, HttpServletRequest request, Model model){
//
//        model.addAttribute("t",9);
//        return "page2_2";
//    }
    //    @RequestMapping("/page2_3")
//    public String hotPicture(HttpServletResponse response, HttpServletRequest request, Model model) throws UnsupportedEncodingException {
//        request.setCharacterEncoding("UTF-8");
//        response.setCharacterEncoding("UTF-8");
//        List<HotPicture> aHp=hotPictureService.getHotPicture();
//        model.addAttribute("hotPicture",toJson(aHp));
//        return "hotPicture";
//    }
    @RequestMapping("/page2_2")
    public String gtest(HttpServletResponse response, HttpServletRequest request, Model model){
        //楼盘名和价格
        Map<String,Integer> data=allInfoService.getHouseAndPrice();
        List<Scatter> list=new ArrayList();
        for(String x:data.keySet()){
            Scatter scatter=new Scatter(x,data.get(x)/100);
            list.add(scatter);
        }
        model.addAttribute("data",toJson(list));

        //楼盘名和经纬度
        Map<String,List<Double>> map=allInfoService.getHouseAndCoordinate();
        model.addAttribute("map",toJson2(map));

        return "page2_2";
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

    @RequestMapping("/login")
    public String  login(HttpServletResponse response, HttpServletRequest request, Model model,
                         @RequestParam(value = "number",defaultValue="") String number, @RequestParam(value = "password",defaultValue = "") String password) {

        //Cookie cookie[]=request.getCookies();
        if(number.equals("admin") && password.equals("123456")){
            System.out.println("密码正确");
            Cookie cookie1 = new Cookie("login","ok");
            cookie1.setPath("/");
            cookie1.setMaxAge(3600*24);
            response.addCookie(cookie1);
            //request.getSession().setAttribute("login","ok");
            return "redirect:index";
        }
        return "login";
    }

    @RequestMapping("/exit")
    public String exit(HttpServletRequest request, HttpServletResponse response){
        Cookie cookie1 = new Cookie("login","no");
        cookie1.setPath("/");
        cookie1.setMaxAge(3600*24);
        response.addCookie(cookie1);
        return "redirect:login";
    }
}
