package cn.bdqn.microserviceitem.dao;

import cn.bdqn.microserviceitem.pojo.Item;
import org.apache.ibatis.annotations.Param;

public interface ItemMapper{
    /**
     * 根据商品id查询商品的详情对象信息
     * @param id 用户id
     * @return 返回商品的详情对象信息
     */
    public Item getItemById(@Param("id") Long id);
}