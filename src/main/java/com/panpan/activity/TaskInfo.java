package com.panpan.activity;

/**
 * @className: TaskInfo
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/12 23:40
 * @version: 1.0
 */
public class TaskInfo {
    private long taskId;
    private long preTaskId;
    private long nextTaskId;
    private int type;

    public TaskInfo(long taskId, long preTaskId, long nextTaskId, int type) {
        this.taskId = taskId;
        this.preTaskId = preTaskId;
        this.nextTaskId = nextTaskId;
        this.type = type;
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public long getPreTaskId() {
        return preTaskId;
    }

    public void setPreTaskId(long preTaskId) {
        this.preTaskId = preTaskId;
    }

    public long getNextTaskId() {
        return nextTaskId;
    }

    public void setNextTaskId(long nextTaskId) {
        this.nextTaskId = nextTaskId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TaskInfo{" +
                "taskId=" + taskId +
                ", preTaskId=" + preTaskId +
                ", nextTaskId=" + nextTaskId +
                ", type=" + type +
                '}';
    }
}
