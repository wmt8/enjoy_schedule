package cn.enjoy.jobs.xxl;

import cn.enjoy.jobs.business.EnjoyBusiness;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 普通任务
 */
@JobHandler(value="enjoySimple") //value值对应的是调度中心新建任务的JobHandler
@Component
public class EnjoySimple extends IJobHandler {

	@Autowired
	private EnjoyBusiness enjoyBusiness;

	@Override
	public ReturnT<String> execute(String param) throws Exception {
		enjoyBusiness.process(1,1,param);
		return SUCCESS;
	}

}
