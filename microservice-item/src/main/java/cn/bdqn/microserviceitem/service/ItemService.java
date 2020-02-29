package cn.bdqn.microserviceitem.service;

import cn.bdqn.microserviceitem.pojo.Item;

public interface ItemService{
   /**
     * 根据用户id查询商品的详情对象信息
     * @param id 商品id
     * @return 返回商品的详情对象信息
     */
    public Item getItemById(Long id);
}