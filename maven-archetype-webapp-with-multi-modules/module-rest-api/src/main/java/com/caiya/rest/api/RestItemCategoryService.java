//package com.caiya.rest.api;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.List;
//
///**
// * 商品分类api
// */
//public interface RestItemCategoryService {
//
//    /**
//     * 根据品牌id查询出这个品牌下的所有分类
//     * @param brandId 品牌id
//     * @return 返回所有的分类包含二级分类
//     */
//    @GetMapping(value = "/rpc/category")
//    List<ItemCategoryResponse> categoryListByBrandId(@RequestParam("brandId") Long brandId) ;
//
//    /**
//     * 查询所有分类
//     */
//    @GetMapping(value = "/rpc/category/list")
//    List<ItemCategoryResponse> categoryList() ;
//
//
//}
