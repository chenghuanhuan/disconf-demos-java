package com.example.disconf.demo2;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfItem;
import org.springframework.stereotype.Service;

/**
 * Created by MST on 2017/5/11.
 */
@Service
@DisconfFile(filename = "coefficients.properties")
public class Coefficients {

    private static double discountRate;


    @DisconfItem(key = "discountRate")
    public static double getDiscountRate() {
        return discountRate;
    }


}
