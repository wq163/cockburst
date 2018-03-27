package com.alibaba.profiler;

import com.alibaba.profiler.queue.PermanentQueue;
import com.chuanglan.base.testkit.stress.StressTemplate;

/**
 * @author wangqiang
 * @since 2018/3/27
 */
public class QueueReadStressTest {
    public static void main(String[] args) throws InterruptedException {
        new StressTemplate(10, 1000000, new StressTemplate.TestTaskTemplate() {
            public boolean run(final int index, final int times) throws Exception {
                String result=PermanentQueue.take("queueName");
//                System.out.println(result);
                return true;
            }
        }).start();
    }
}
