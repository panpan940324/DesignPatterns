package com.panpan.activity;

/**
 * @className: TaskDto
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/13 0:15
 * @version: 1.0
 */
public class TaskDto {
    private long taskId;
    private int order;
    private int type;
    private String rewardName;

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getRewardName() {
        return rewardName;
    }

    public void setRewardName(String rewardName) {
        this.rewardName = rewardName;
    }

    @Override
    public String toString() {
        return "TaskDto{" +
                "taskId=" + taskId +
                ", order=" + order +
                ", type=" + type +
                ", rewardName='" + rewardName + '\'' +
                '}';
    }
}
