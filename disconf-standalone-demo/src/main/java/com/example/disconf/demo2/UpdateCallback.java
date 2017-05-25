package com.example.disconf.demo2;

import com.baidu.disconf.client.common.update.IDisconfUpdatePipeline;
import org.springframework.stereotype.Service;

/**
 * Created by MST on 2017/5/11.
 */
@Service
public class UpdateCallback  implements IDisconfUpdatePipeline {
    public void reloadDisconfFile(String s, String s1) throws Exception {
        System.out.println("key:"+s+"   value:"+s1);
    }

    public void reloadDisconfItem(String s, Object o) throws Exception {
        System.out.println("key:"+s+"   value:"+o);
    }
}
