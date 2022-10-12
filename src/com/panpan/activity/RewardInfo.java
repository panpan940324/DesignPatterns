package com.panpan.activity;

/**
 * @className: RewardInfo
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/12 23:42
 * @version: 1.0
 */
public class RewardInfo {
    private Long rewardId;
    private String rewardName;

    public RewardInfo(Long rewardId, String rewardName) {
        this.rewardId = rewardId;
        this.rewardName = rewardName;
    }

    public Long getRewardId() {
        return rewardId;
    }

    public void setRewardId(Long rewardId) {
        this.rewardId = rewardId;
    }

    public String getRewardName() {
        return rewardName;
    }

    public void setRewardName(String rewardName) {
        this.rewardName = rewardName;
    }
}
