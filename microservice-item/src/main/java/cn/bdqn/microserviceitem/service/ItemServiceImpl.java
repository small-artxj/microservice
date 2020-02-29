package cn.bdqn.microserviceitem.service;

import cn.bdqn.microserviceitem.dao.ItemMapper;
import cn.bdqn.microserviceitem.pojo.Item;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItemServiceImpl implements ItemService {

    @Resource
    private ItemMapper itemMapper;

    @Override
    public Item getItemById(Long id) {
        return itemMapper.getItemById(id);
    }
}