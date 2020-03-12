package cn.enjoy.jobs.business;

import org.springframework.stereotype.Service;

@Service
public class EnjoyBusiness  {

	/**
	 * index指示，现在跑的是第几片
	 * total指示，总共有几片
     */
	public void process(int index,int total,String param) {
		if (total == 1){
			System.out.println("当前执行全业务处理,参数："+param);
			return;
		}

		//分片任务
		if (index == 1 ){
			// select * from xxx limit 0,500
		} else {
			// select * from xxx limit 500,1000
		}

		System.out.println("当前执行第 "+(index+1)+"/"+total+"片的数据,参数："+param);
	}

}