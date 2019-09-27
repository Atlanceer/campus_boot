package atlan.ceer.interceptor;

import atlan.ceer.config.MyLogger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import atlan.ceer.util.TokenUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        MyLogger.logger.info("MyInterceptor pre");
        String token=request.getHeader("token");
        TokenUtil tokenUtil=new TokenUtil();
        //如果验证不成功
        if (!tokenUtil.verifyToken(token)){
            response.setStatus(201);
            response.setCharacterEncoding("utf-8");
            response.getWriter().write("请先登录！");
            response.getWriter().close();
            return false;
        }
        return true;
    }

    /*
      后处理方法，controller方法执行后，success.jsp执行前
     */
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        MyLogger.logger.info("MyInterceptor post");
    }

    /*success.jsp页面执行完成之后，该方法会执行*/
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        MyLogger.logger.info("MyInterceptor after");
    }
}
