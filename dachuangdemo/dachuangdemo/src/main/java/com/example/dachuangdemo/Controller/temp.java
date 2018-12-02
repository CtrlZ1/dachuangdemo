package com.example.dachuangdemo.Controller;//package com.example.dachuangdemo.Controller;
//
//
//import com.example.dachuangdemo.model.dataGraph.Scatter;
//import com.example.dachuangdemo.service.AllInfoService;
//import net.sf.json.JSONArray;
//import net.sf.json.JSONObject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.util.*;
//
//@Controller
//public class temp extends HttpServlet {
//    @Autowired
//    AllInfoService allInfoService;
//
//    private static String toJson(Object resultobj){
//        if(resultobj!=null){
//            JSONArray obj=JSONArray.fromObject(resultobj);
//            return(obj.toString());
//        }
//        return"";
//    }
//    private static String toJson2(Object resultobj){
//        if(resultobj!=null){
//            JSONObject obj=JSONObject.fromObject(resultobj);
//            return obj.toString();
//        }
//        return null;
//    }
//
//    @RequestMapping("/gtest")
//    public String gtest(HttpServletResponse response, HttpServletRequest request, Model model){
//        //楼盘名和价格
//        Map<String,Integer> data=allInfoService.getHouseAndPrice();
//        List<Scatter> list=new ArrayList();
//        for(String x:data.keySet()){
//            Scatter scatter=new Scatter(x,data.get(x)/100);
//            list.add(scatter);
//        }
//        model.addAttribute("data",toJson(list));
//
//        //楼盘名和经纬度
//        Map<String,List<Double>> map=allInfoService.getHouseAndCoordinate();
//        model.addAttribute("map",toJson2(map));
//
//        return "sandian_test";
//    }
//
//
//    @RequestMapping("/sandian_test")
//    public String page2_2(HttpServletResponse response, HttpServletRequest request, Model model){
//        Scatter[] scatter=new Scatter[4];
//        //数量
//        scatter[0]=new Scatter("北京",100);
//        scatter[1]=new Scatter("上海",80);
//        scatter[2]=new Scatter("广州",60);
//        scatter[3]=new Scatter("深圳",40);
//        model.addAttribute("data",toJson(scatter));
//        Map<String, Object> map=new HashMap<String, Object>();
//        //经纬度
//        List<Double> list1=new ArrayList<Double>();
//        list1.add(116.46);
//        list1.add(39.92);
//        List<Double> list2=new ArrayList<Double>();
//        list2.add(121.48);
//        list2.add(31.22);
//        List<Double> list3=new ArrayList<Double>();
//        list3.add(113.23);
//        list3.add(23.16);
//        List<Double> list4=new ArrayList<Double>();
//        list4.add(114.07);
//        list4.add(22.62);
//        map.put("北京",list1);
//        map.put("上海",list2);
//        map.put("广州",list3);
//        map.put("深圳",list4);
//        model.addAttribute("map",toJson2(map));
//        return "sandian_test";
//    }
//
//}
