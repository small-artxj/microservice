package cn.bdqn.microserviceitem.controller;


import cn.bdqn.microserviceitem.pojo.Item;
import cn.bdqn.microserviceitem.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/item")
public class ItemController{
    @Resource
    private ItemService itemService;

    @RequestMapping("/queryItemById/{id}")
    public String getItemInfo(@PathVariable("id") Long id, Model model) {
        System.out.println("11111");
        Item item= itemService.getItemById(id);
        model.addAttribute("item",item);
        return "itemView";
    }
}