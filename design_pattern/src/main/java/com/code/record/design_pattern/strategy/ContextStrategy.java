package com.code.record.design_pattern.strategy;

/**
 * @Author: Gao
 * @Time: 2018/7/16 19:06
 * @Description: 功能描述
 */
public class ContextStrategy {
    private PayState payState;


    public ContextStrategy setPayState(PayState payState){
        this.payState = payState;
        return this;
    }


    public void startPay(){
        if(payState.getState() == 1){
            new AliPay().pay(payState);
        }else if(payState.getState() == 2){
            new WeChatPay().pay(payState);
        }
    }
}
