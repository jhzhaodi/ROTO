package com.ruoyi.service;

import java.util.List;
import com.ruoyi.domain.LeaseProduct;

/**
 * 租赁产品Service接口
 *
 * @author jjzhaodi
 * @date 2024-03-09
 */
public interface ILeaseProductService
{
    /**
     * 查询租赁产品
     *
     * @param leaseId 租赁产品主键
     * @return 租赁产品
     */
    public LeaseProduct selectLeaseProductByLeaseId(String leaseId);

    /**
     * 查询租赁产品列表
     *
     * @param leaseProduct 租赁产品
     * @return 租赁产品集合
     */
    public List<LeaseProduct> selectLeaseProductList(LeaseProduct leaseProduct);

    /**
     * 新增租赁产品
     *
     * @param leaseProduct 租赁产品
     * @return 结果
     */
    public int insertLeaseProduct(LeaseProduct leaseProduct);

    /**
     * 修改租赁产品
     *
     * @param leaseProduct 租赁产品
     * @return 结果
     */
    public int updateLeaseProduct(LeaseProduct leaseProduct);

    /**
     * 批量删除租赁产品
     *
     * @param leaseIds 需要删除的租赁产品主键集合
     * @return 结果
     */
    public int deleteLeaseProductByLeaseIds(String[] leaseIds);

    /**
     * 删除租赁产品信息
     *
     * @param leaseId 租赁产品主键
     * @return 结果
     */
    public int deleteLeaseProductByLeaseId(String leaseId);
}
