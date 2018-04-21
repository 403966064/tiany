package com.trade.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FutureTest {

    private void something1(){
        try {
            Thread.sleep(5000);
            System.out.println("执行线程1的代码");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void something2(){
        try {
            System.out.println("执行线程2的代码");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Future<String>> taskResults = new ArrayList<Future<String>>();

        //创建线程池,使用future必须要使用executors.submit来调用，《乌龟的屁股，规定》
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            Future<String> result = executor.submit(new TaskWithResult(i));
            taskResults.add(result);
        }

        //获取执行结果
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(taskResults.get(i).get());
            } catch (InterruptedException e) {
            } catch (ExecutionException e) {
            }
        }
    }
}

class TaskWithResult implements Callable<String> {

    private int taskId;

    TaskWithResult(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public String call() throws Exception {
        return "执行结果：任务taskId=" + taskId;
    }

}
