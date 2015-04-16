package com.fuiou;

import java.util.Map;

/**
 * @project fuIstreet (富友智慧街二期)
 * @description 抽奖活动映射
 * @author lizhensh
 * @creation 2014-6-5
 * @email lizhensh@fuiou.com
 * @version 1.1.0
 */
public interface IsAwardMapper {

	/**
	 * 查询抽奖信息
	 * @param map 参数
	 * @return 抽奖对象
	 */
	IsAwardBean get(Map<String,Object> map);

}
