package cn.enjoy.jobs.xxl;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;

public class EnjoyGlue extends IJobHandler {
    public ReturnT<String> execute(String param) throws Exception {
        System.out.println("测试GLUE任务，我已被执行");
        return SUCCESS;

    }
}
