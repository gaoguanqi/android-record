package com.code.record.design_pattern.strategy;

/**
 * @Author: Gao
 * @Time: 2018/7/16 18:53
 * @Description: 功能描述
 */

/**
 * 使用策略模式代替if else 嵌套
 *
 * 例如：实现一个支付模块，有支付宝支付，微信支付，网银卡支付
 * 点击一个button 通过传入的状态去打开不同的支付方式
 *
 * 1，抽象策略接口
 *
 */
public class Test {



    public static void main(String args[]){

        PayState payState = new PayState();
        payState.setState(1);
        payState.setName("支付宝");



        ContextStrategy c = new ContextStrategy();
        c.setPayState(payState).startPay();
    }
}
