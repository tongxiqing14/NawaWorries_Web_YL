package iptv.order;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by tongxiqing on 2015/4/2.
 */
public class OrderpyServlet extends HttpServlet {

    public void init() throws ServletException {

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          //
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        <?xml version="1.0" encoding="UTF-8" ?>
//        <res>
//            <accountStb>0571000441</accountStb>
//            <productCode>P10119</productCode>
//            <propsCode>DJ10648</propsCode>
//            <hret>1212306</hret>
//            <message>您好，您本月在该款游戏消费已达到封顶值，欢迎下月购买使用！</message>
//        </res>

                //accountStb=0571000441&productCode=P10119&propsCode=DJ10648
        req.getAttribute("accountStb");
        req.getAttribute("productCode");
        req.getAttribute("propsCode");
    }

}
