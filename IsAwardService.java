package com.fuiou;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @project fuIstreet (富友智慧街二期)
 * @description 抽奖活动查询业务处理
 * @author lizhensh
 * @creation 2014-6-5
 * @email lizhensh@fuiou.com
 * @version 1.1.0
 */
@Service
public class IsAwardService {
	
	@Autowired
	private IsAwardMapper isAwardMapper;
	/**
	 * 查询抽奖活动信息
	 * @param map 参数(operatorId,streetId,shopId)
	 * @return 抽奖活动对象
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED, readOnly=true)
	public IsAwardBean getAward(Map<String,Object> map){
		return isAwardMapper.get(map);
	}
}
