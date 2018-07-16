package com.code.record.design_pattern.strategy;

import android.util.Log;

/**
 * @Author: Gao
 * @Time: 2018/7/16 19:01
 * @Description: 功能描述
 */
public class AliPay implements PayStrategy{
    @Override
    public void pay(PayState payState) {
        Log.d("TAG",new StringBuilder().append(payState.getName()).append("支付").toString());
    }
}
