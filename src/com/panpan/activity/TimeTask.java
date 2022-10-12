package com.panpan.activity;

/**
 * @className: TimeTask
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/12 23:47
 * @version: 1.0
 */
public class TimeTask {
    private RewardInfo rewardInfo;
    private TaskInfo taskInfo;

    public RewardInfo getRewardInfo() {
        return rewardInfo;
    }

    public void setRewardInfo(RewardInfo rewardInfo) {
        this.rewardInfo = rewardInfo;
    }

    public TaskInfo getTaskInfo() {
        return taskInfo;
    }

    public void setTaskInfo(TaskInfo taskInfo) {
        this.taskInfo = taskInfo;
    }

    @Override
    public String toString() {
        return "TimeTask{" +
                "rewardInfo=" + rewardInfo +
                ", taskInfo=" + taskInfo +
                '}';
    }
}
