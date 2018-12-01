package com.example.dachuangdemo.Action;

import com.example.dachuangdemo.model.Mail.Mail;
import com.sun.mail.util.MailSSLSocketFactory;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;

public class SendEmail {
    public static void sendEmail(){
        String smtp = "smtp.qq.com";//smtp服务器
        String from = "1005461421@qq.com";//发件人
        String to = "1005461421@qq.com";//收件人
        //String copyto = "200000@qq.com";//抄送
        String subject = "MailTest";//主题
        String content = "<!DOCTYPE html>\r\n" +
                "<html>\r\n" +
                "<head>\r\n" +
                "    <meta charset=\"utf-8\">\r\n" +
                "    <title>ECharts</title>\r\n" +
                "    <!-- 引入 echarts.js -->\r\n" +
                "    <script src=\"echarts.min.js\"></script>\r\n" +
                "</head>\r\n" +
                "<body>\r\n" +
                "    <!-- 为ECharts准备一个具备大小（宽高）的Dom -->\r\n" +
                "    <div id=\"main\" style=\"width: 600px;height:400px;\"></div>\r\n" +
                "    <script type=\"text/javascript\">\r\n" +
                "        // 基于准备好的dom，初始化echarts实例\r\n" +
                "        var myChart = echarts.init(document.getElementById('main'));\r\n" +
                "\r\n" +
                "        // 指定图表的配置项和数据\r\n" +
                "        var option = {\r\n" +
                "            title: {\r\n" +
                "                text: 'ECharts 入门示例'\r\n" +
                "            },\r\n" +
                "            tooltip: {},\r\n" +
                "            legend: {\r\n" +
                "                data:['销量']\r\n" +
                "            },\r\n" +
                "            xAxis: {\r\n" +
                "                data: [\"衬衫\",\"羊毛衫\",\"雪纺衫\",\"裤子\",\"高跟鞋\",\"袜子\"]\r\n" +
                "            },\r\n" +
                "            yAxis: {},\r\n" +
                "            series: [{\r\n" +
                "                name: '销量',\r\n" +
                "                type: 'bar',\r\n" +
                "                data: [5, 20, 36, 10, 10, 20]\r\n" +
                "            }]\r\n" +
                "        };\r\n" +
                "\r\n" +
                "        // 使用刚指定的配置项和数据显示图表。\r\n" +
                "        myChart.setOption(option);\r\n" +
                "    </script>\r\n" +
                "</body>\r\n" +
                "</html>";//正文
        String username = "1005461421@qq.com";//发件人邮箱登录名
        String password = "dxrfjkfbbrtfbfac";//发件人邮箱登录密码
        String filename = "E:\\idea work\\大创\\dachuangdemo\\dachuangdemo\\dachuangdemo\\src\\main\\resources\\test.txt";//附件URL

        Mail.send(smtp,from,to,subject,content,username,password,filename);
    }
    public static void sendEmail2()
    {
        try {
            Properties prop=new Properties();
            //发送邮件的协议
            prop.setProperty("mail.transport.protocol", "smtp");
            //连接的邮件服务器的主机名
            prop.setProperty("mail.smtp.host", "smtp.qq.com");
            //是否向邮件服务器提交认证
            prop.setProperty("mail.smtp.auth","true");
            prop.setProperty("mail.debug", "true");
            MailSSLSocketFactory sf = new MailSSLSocketFactory();
            sf.setTrustAllHosts(true);
            prop.put("mail.smtp.ssl.enable", "true");
            prop.put("mail.smtp.ssl.socketFactory", sf);
            //创建session对象
            Session session= Session.getInstance(prop);

            //创建message
            Message message=new MimeMessage(session);
            //设置发信人
            message.setFrom(new InternetAddress("1005461421@qq.com"));
            //设置收件人
            message.setRecipient(RecipientType.TO, new InternetAddress("1005461421@qq.com"));
            //设置邮件主题
            message.setSubject("test");

            message.setText("testText");
            //Multipart对象,邮件内容,标题,附件等内容均添加到其中后再生成MimeMessage对象  Multipartb包含BodyPart()
            Multipart multipart=new MimeMultipart();
            javax.mail.Header header=new Header("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n" +
                    "<html>\r\n" +
                    "<head>\r\n" +
                    "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n" +
                    "<title>邮件内容</title>\r\n" +
                    "<link rel=\"stylesheet\" type=\"text/css\" href=\"./resources/email.css\"/>\r\n" +
                    "</head>\r\n" +
                    "" , "text/html; charset=utf-8");
            //正文
            BodyPart html=new MimeBodyPart();

            html.setContent(
                    "<body id=\"body1\">\r\n" +
                            "<h1>邮件内容：</h1>\r\n" +
                            "<h2>毯业管理人员： </h2>\r\n" +
                            "<p style=\"normal\"> 您好！感谢您使用MES软件，现将20171026早7点至20171027早7点现场生产数据向您展示如下：</p>\r\n" +
                            "<h3 style=\"blueHead\">设备OEE如下：</h3>\r\n" +
                            "\r\n" +
                            "<div id=\"d1\" style=\"tableDiv\">\r\n" +
                            "<table  id=\"t1\" border=\"1\" style=\"tableDiv\" > \r\n" +
                            "    <tr>\r\n" +
                            "        <th colspan=\"3\">主数据</th>\r\n" +
                            "        <th colspan=\"4\">持续期</th>\r\n" +
                            "        <th colspan=\"4\">指标</th>\r\n" +
                            "    </tr>\r\n" +
                            "    <tr>\r\n" +
                            "        <th>工作场地</th>\r\n" +
                            "        <th>短名称</th>\r\n" +
                            "        <th>组</th>\r\n" +
                            "		<th>计划工序时间</th>\r\n" +
                            "        <th>净生产时间</th>\r\n" +
                            "        <th>实际利用率</th>\r\n" +
                            "		<th>正品利用率</th>\r\n" +
                            "        <th>OEE</th>\r\n" +
                            "        <th>可用性</th>\r\n" +
                            "		<th>效率</th>\r\n" +
                            "        <th>质量</th>\r\n" +
                            "    </tr>\r\n" +
                            "    <tr>\r\n" +
                            "        <td>1</td>\r\n" +
                            "        <td>2</td>\r\n" +
                            "		<td>3</td>\r\n" +
                            "        <td>4</td>\r\n" +
                            "		<td>5</td>\r\n" +
                            "        <td>6</td>\r\n" +
                            "		<td>7</td>\r\n" +
                            "        <td>8</td>\r\n" +
                            "		<td>9</td>\r\n" +
                            "        <td>10</td>\r\n" +
                            "		<td>11</td>\r\n" +
                            "    </tr>\r\n" +
                            "</table>\r\n" +
                            " </div>\r\n" +
                            " \r\n" +
                            "<h3 style=\"blueHead\">设备停机分析如下：</h3>\r\n" +
                            "<p style=\"normal\"> 根据EquipHistory导出的数据，对一段时间内（20171026早7点至20171027早7点）将设备进行分组，按状态进行分类，叠加各种状态的时间 </p>\r\n" +
                            "\r\n" +
                            "<div id=\"d2\" style=\"tableDiv\">\r\n" +
                            "<table  id=\"t2\" border=\"1\" style=\"table\" >\r\n" +
                            "<tr>\r\n" +
                            "  <th>工作场地</th>\r\n" +
                            "  <th>短名称</th>\r\n" +
                            "  <th>组</th>\r\n" +
                            "  <th>状态</th>\r\n" +
                            "  <th>持续时间</th>\r\n" +
                            "</tr>\r\n" +
                            "<tr>\r\n" +
                            "  <th>1</th>\r\n" +
                            "  <th>2</th>\r\n" +
                            "  <th>3</th>\r\n" +
                            "  <th>4</th>\r\n" +
                            "  <th>5</th>\r\n" +
                            "</tr>\r\n" +
                            "<tr>\r\n" +
                            "  <th>1</th>\r\n" +
                            "  <th>2</th>\r\n" +
                            "  <th>3</th>\r\n" +
                            "  <th>4</th>\r\n" +
                            "  <th>5</th>\r\n" +
                            "</tr>\r\n" +
                            "</table>\r\n" +
                            " </div>\r\n" +
                            " \r\n" +
                            "<h3 style=\"blueHead\">生产产量信息如下：</h3>\r\n" +
                            "<p style=\"normal\">根据OrderOverview导出的数据，对一段时间内（20171026早7点至20171027早7点）订单进行归类，汇总展示 </p>\r\n" +
                            "\r\n" +
                            "<div id=\"d3\" style=\"tableDiv\">\r\n" +
                            "<table  id=\"t3\" border=\"1\" style=\"table\" >\r\n" +
                            "<tr>\r\n" +
                            "  <th>订单</th>\r\n" +
                            "  <th>预计生产数量</th>\r\n" +
                            "  <th>实际生产数量</th>\r\n" +
                            "  <th>次品量</th>\r\n" +
                            "  <th>次品率</th>\r\n" +
                            "</tr>\r\n" +
                            "<tr>\r\n" +
                            "  <th>1</th>\r\n" +
                            "  <th>2</th>\r\n" +
                            "  <th>3</th>\r\n" +
                            "  <th>4</th>\r\n" +
                            "  <th>5</th>\r\n" +
                            "</tr>\r\n" +
                            "<tr>\r\n" +
                            "  <th>1</th>\r\n" +
                            "  <th>2</th>\r\n" +
                            "  <th>3</th>\r\n" +
                            "  <th>4</th>\r\n" +
                            "  <th>5</th>\r\n" +
                            "</tr>\r\n" +
                            "<tr>\r\n" +
                            "  <th>1</th>\r\n" +
                            "  <th>2</th>\r\n" +
                            "  <th>3</th>\r\n" +
                            "  <th>4</th>\r\n" +
                            "  <th>5</th>\r\n" +
                            "</tr>\r\n" +
                            "<tr>\r\n" +
                            "  <th>1</th>\r\n" +
                            "  <th>2</th>\r\n" +
                            "  <th>3</th>\r\n" +
                            "  <th>4</th>\r\n" +
                            "  <th>5</th>\r\n" +
                            "</tr>\r\n" +
                            "</table> \r\n" +
                            "</div>\r\n" +
                            "\r\n" +
                            "<p style=\"normal\">以上为昨日生产的日报相关信息! </p>\r\n" +
                            "<p style=\"normal\">祝您工作顺利，生活愉快！  </p>\r\n" +
                            "</body>\r\n" +
                            "</html>" ,"text/html; charset=utf-8");
            multipart.addBodyPart(html);
            //messageb包含multipart
            message.setContent(multipart);
            message.addHeader("x-Priority", "3");
            message.addHeader("X-MSMail-Priority", "Normal");
            message.addHeader("X-Mailer", "Microsoft Outlook Express 6.00.2900.2869");
            message.addHeader("X-MimeOLE", "Produced By Microsoft MimeOLE V6.00.2900.2869");
            message.addHeader("ReturnReceipt", "1");
            //得到transport
            Transport transport=session.getTransport();
            //连接邮件服务器
            transport.connect("1005461421@qq.com","dxrfjkfbbrtfbfac");
            //发送邮件
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
