package com.alibaba.profiler;

import com.alibaba.profiler.queue.PermanentQueue;
import com.chuanglan.base.testkit.stress.StressTemplate;

/**
 * @author wangqiang
 * @since 2018/3/27
 */
public class QueueWriteStressTest {

    public static void main(String[] args) throws InterruptedException {

        new StressTemplate(100, 100000, new StressTemplate.TestTaskTemplate() {
            public boolean run(final int index, final int times) throws Exception {
                PermanentQueue.offer("queueName", "data" + index + times);
                return true;
            }
        }).start();
    }
}
