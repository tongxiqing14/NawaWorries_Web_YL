package iptv.account;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.xml.bind.annotation.XmlList;
import java.io.IOException;

/**
 * Created by tongxiqing on 2015/4/2.
 */
public class QuerypyServlet extends HttpServlet {

    public void init() throws ServletException {

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("******1*******");

        ServletOutputStream out_  = resp.getOutputStream();

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
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        System.out.println("******2*******");

        ServletOutputStream out_  = res.getOutputStream();

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

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("******3*******");

        ServletOutputStream out_  = resp.getOutputStream();

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
    }

}
