package cn.j.web;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author J
 * @time 2018/10/29 22:11
 * @description
 **/
@Component
public class DemoFilter extends ZuulFilter {

    private final static Logger logger = LoggerFactory.getLogger(DemoFilter.class);

    /**
     * @return pre route post error
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * @return 数值越小优先级越高
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    /**
     * 过滤逻辑写在这里
     *
     * @return
     */
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        logger.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        //从parameter获取 token
        Object accessToken = request.getParameter("token");
        // 从header 获取token
//        Object accessToken = request.getHeader("token");
        if (accessToken == null) {
            logger.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            } catch (Exception e) {
                logger.error("return error", e);
            }

            return null;
        }
        logger.info("ok");
        return null;
    }
}
