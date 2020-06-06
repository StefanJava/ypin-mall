package com.stefan.ypinmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stefan.common.utils.PageUtils;
import com.stefan.common.utils.Query;
import com.stefan.ypinmall.product.dao.CategoryDao;
import com.stefan.ypinmall.product.entity.CategoryEntity;
import com.stefan.ypinmall.product.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Resource
    private CategoryDao categoryDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        // 1.查询出所有分类
        List<CategoryEntity> categoryEntities = categoryDao.selectList(null);

        // 2.封装成树形结构
        List<CategoryEntity> level1Category = categoryEntities.stream().filter(categoryEntity ->
            categoryEntity.getParentCid() == 0
        ).peek(categoryEntity -> categoryEntity.setChildrenCategoryList(getChildren(categoryEntity, categoryEntities)))
                .sorted(Comparator.comparingInt(category -> (category.getSort() == null ? 0 : category.getSort())))
                .collect(Collectors.toList());

        return level1Category;
    }

    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> allCategory) {

        return allCategory.stream().filter(categoryEntity ->
            categoryEntity.getParentCid().equals(root.getCatId())
        ).peek(categoryEntity -> categoryEntity.setChildrenCategoryList(getChildren(categoryEntity, allCategory)))
                .sorted(Comparator.comparingInt(category -> (category.getSort() == null ? 0 : category.getSort())))
                .collect(Collectors.toList());

    }

}
