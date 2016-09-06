package org.jfullam.filters.pre;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by jfullam on 9/6/16.
 */
@Component
public class LoggingPreFilter extends ZuulFilter {

    private static final Log log = LogFactory.getLog(LoggingPreFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest req = context.getRequest();

        log.info(String.format("%s request for %s", req.getMethod(), req.getRequestURL().toString()));
        return null;
    }
}
