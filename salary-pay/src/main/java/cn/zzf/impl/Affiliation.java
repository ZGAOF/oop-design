package cn.zzf.impl;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 10:56:56
 **/

public interface Affiliation {
    /**
     * 计算扣除项
     * @author: GaoFeng2017
     * @date: 2018/6/8 15:16
     * @param payCheck 支付细节
     * @return:
     *
     */
    Double calculateDeductions(PayCheck payCheck);
}
