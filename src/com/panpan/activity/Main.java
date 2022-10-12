package com.panpan.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @className: Main
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/12 18:42
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        List<TimeTask> timeTasks = new ArrayList<>();
        TimeTask timeTask1 = new TimeTask();
        timeTask1.setTaskInfo(new TaskInfo(1L, -1L, 2L, 100));
        timeTask1.setRewardInfo(new RewardInfo(1L, "1金币"));

        TimeTask timeTask2 = new TimeTask();
        timeTask2.setTaskInfo(new TaskInfo(2L, 1L, 3L, 100));
        timeTask2.setRewardInfo(new RewardInfo(2L, "2金币"));

        TimeTask timeTask3 = new TimeTask();
        timeTask3.setTaskInfo(new TaskInfo(3L, 2L, -1L, 100));
        timeTask3.setRewardInfo(new RewardInfo(1L, "3金币"));

        TimeTask timeTask4 = new TimeTask();
        timeTask4.setTaskInfo(new TaskInfo(4L, -1L, -1L, 1));
        timeTask4.setRewardInfo(new RewardInfo(1L, "金币"));

        TimeTask timeTask5 = new TimeTask();
        timeTask5.setTaskInfo(new TaskInfo(5L, -1L, -1L, 1));
        timeTask5.setRewardInfo(new RewardInfo(1L, "金币"));
        timeTasks.add(timeTask2);
        timeTasks.add(timeTask4);
        timeTasks.add(timeTask3);
        timeTasks.add(timeTask1);
        timeTasks.add(timeTask5);

        List<TaskInfo> taskInfos = new ArrayList<>();
        Map<Long, RewardInfo> rewardInfoMap = new HashMap<>();
        Map<Long, TaskInfo> taskInfoMap = new HashMap<>();
        int chainNum = 0;
        TaskInfo firstTaskInfo = null;
        for (TimeTask timeTask : timeTasks) {
            TaskInfo taskInfo = timeTask.getTaskInfo();
            RewardInfo rewardInfo = timeTask.getRewardInfo();
            if (taskInfo != null && taskInfo.getType() == 100 && !(taskInfo.getPreTaskId() == -1L
                    && taskInfo.getNextTaskId() == -1L)) {
                taskInfos.add(taskInfo);
                taskInfoMap.put(taskInfo.getTaskId(),taskInfo);
                rewardInfoMap.put(taskInfo.getTaskId(), rewardInfo);
            }
            if (taskInfo != null && taskInfo.getType() == 100 && taskInfo.getPreTaskId() == -1L) {
                chainNum++;
                firstTaskInfo = taskInfo;
            }
        }
        System.out.println(taskInfos);
        if (chainNum != 1) {
            System.out.println("该活动中的游戏没有时长任务脸或者2个或2个以上时长任务链");
            return;
        }

        List<TaskDto> taskDtos = new ArrayList<>();
        TaskInfo tempTaskInfo = firstTaskInfo;
        taskDtos.add(assembleTaskDto(tempTaskInfo, rewardInfoMap));
        while (getNextTaskInfo(tempTaskInfo, taskInfoMap) != null) {
            TaskInfo nextTaskInfo = getNextTaskInfo(tempTaskInfo, taskInfoMap);
            taskDtos.add(assembleTaskDto(nextTaskInfo, rewardInfoMap));
            tempTaskInfo = nextTaskInfo;
        }
        System.out.println(taskDtos);


    }

    public static TaskDto assembleTaskDto(TaskInfo taskInfo, Map<Long, RewardInfo> rewardInfoMap) {
        TaskDto taskDto = new TaskDto();
        taskDto.setTaskId(taskInfo.getTaskId());
        taskDto.setType(taskInfo.getType());
        RewardInfo rewardInfo = rewardInfoMap.get(taskInfo.getTaskId());
        if (rewardInfo != null) {
            taskDto.setRewardName(rewardInfo.getRewardName());
        }
        return taskDto;

    }

    public static TaskInfo getNextTaskInfo(TaskInfo taskInfo, Map<Long, TaskInfo> taskInfoMap) {
        long nextTaskId = taskInfo.getNextTaskId();
        return taskInfoMap.get(nextTaskId);
    }
}
