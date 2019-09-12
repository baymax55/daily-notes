package com.baymax.dailynotes.intIp;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author bx
 * @date 9/12/2019 9:01 AM
 */
@Slf4j
public class IntIp {
    /**
     * (Ip转Integer)
     * 方法名：ipToInteger
     * 创建人：Liwenbin
     * 时间：2017年5月2日-下午5:06:47  void
     *
     * @since 1.0.0
     */
    @Test
    public void ipToInteger() {
        String ip = "192.168.1.1";
        String[] ips = ip.split("\\.");
        int ipFour = 0;
        //因为每个位置最大255，刚好在2进制里表示8位
        for (String ip4 : ips) {
            Integer ip4a = Integer.parseInt(ip4);
            //这里应该用+也可以,但是位运算更快
            ipFour = (ipFour << 8) | ip4a;
        }
        log.info(":" + ipFour + "");
    }

    /**
     * (Integer转IP)
     * 方法名：IntegerToIp
     * 创建人：Liwenbin
     * 时间：2017年5月2日-下午5:23:32
     *
     * @return String
     * @since 1.0.0
     */
    @Test
    public void IntegerToIp() {
        Integer ip = -1062731519;
        //思路很简单，每8位拿一次，就是对应位的IP
        StringBuilder sb = new StringBuilder();
        for (int i = 3; i >= 0; i--) {
            int ipa = (ip >> (8 * i)) & (0xff);
            sb.append(ipa + ".");
        }
        sb.delete(sb.length() - 1, sb.length());
        log.info(sb.toString());
    }

    /**
     * 位操作运算
     */
    @Test
    public void bitOperate() {
        log.info("result:" + (3 & 5));
        log.info("result:" + ((1 == 1 && 5 != 2) ? 1 : 0));
        log.info("result:" + (6|2));
        log.info("result:" + ((1 == 1 || 5 != 2) ? 1 : 0));
        log.info("result:" + (6^2));
        log.info("result:" + (1 << 1));
        log.info("result:" + (15 >>> 2));
        log.info("result:" + (2 >> 1));
        log.info("result:" + (2 >>> 1));
        log.info("result:" + (~5));
    }
}
