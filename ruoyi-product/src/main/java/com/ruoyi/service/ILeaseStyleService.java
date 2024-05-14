package com.ruoyi.service;

import java.util.List;
import com.ruoyi.domain.LeaseStyle;

/**
 * 租赁产品款式Service接口
 *
 * @author jjzhaodi
 * @date 2024-03-09
 */
public interface ILeaseStyleService
{
    /**
     * 查询租赁产品款式
     *
     * @param styleId 租赁产品款式主键
     * @return 租赁产品款式
     */
    public LeaseStyle selectLeaseStyleByStyleId(String styleId);

    /**
     * 查询租赁产品款式列表
     *
     * @param leaseStyle 租赁产品款式
     * @return 租赁产品款式集合
     */
    public List<LeaseStyle> selectLeaseStyleList(LeaseStyle leaseStyle);

    /**
     * 新增租赁产品款式
     *
     * @param leaseStyle 租赁产品款式
     * @return 结果
     */
    public int insertLeaseStyle(LeaseStyle leaseStyle);

    /**
     * 修改租赁产品款式
     *
     * @param leaseStyle 租赁产品款式
     * @return 结果
     */
    public int updateLeaseStyle(LeaseStyle leaseStyle);

    /**
     * 批量删除租赁产品款式
     *
     * @param styleIds 需要删除的租赁产品款式主键集合
     * @return 结果
     */
    public int deleteLeaseStyleByStyleIds(String[] styleIds);

    /**
     * 删除租赁产品款式信息
     *
     * @param styleId 租赁产品款式主键
     * @return 结果
     */
    public int deleteLeaseStyleByStyleId(String styleId);
}
