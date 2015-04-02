<%--
  Created by IntelliJ IDEA.
  User: tongxiqing
  Date: 14-12-30
  Time: 涓���8:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <%--<script type="text/javascript">--%>
        <%--function run(){--%>
            <%--window.location.href = "http://192.168.231.130:80/1/index0.jsp?Account=993023f25ee94050&adAccount=game01&NickName=Michael+J&GameID=901002&UserToken=04116839860818004942601114155521&STBID=-1&IconAddr=http://192.168.241.102/Images/PlatForm/002_Jiangsu/UserIcon/3/jvm.png&ReturnURL=http://192.168.241.102/002_Jiangsu_hw/Home/LogoutGame.aspx?ReturnURL=http://192.168.241.102/002_Jiangsu_hw/GameHall/Index.aspx?EpgGroup=6";--%>
        <%--}--%>
    <%--</script>--%>
</head>
<body onload="run()">
        <%--hello--%>
     <%
         ServletOutputStream out_  = response.getOutputStream();

         StringBuffer ret_str = new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
         ret_str.append("<res>");
         ret_str.append("<accountStb>0571000441</accountStb>");
         ret_str.append("<productCode>P10119</productCode>");
         ret_str.append("<hret>1212200</hret>");
         ret_str.append("<message>业务操作成功</message>");
         ret_str.append("</res>");

         out_.write(ret_str.toString().getBytes("GBK"));
         out_.println();
         out_.close();
     %>
</body>
</html>