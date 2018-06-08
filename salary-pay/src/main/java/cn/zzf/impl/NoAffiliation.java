package cn.zzf.impl;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 19:19:56
 **/

public class NoAffiliation implements Affiliation {
    @Override
    public Double calculateDeductions(PayCheck payCheck) {
        return 0.0;
    }
}
