package com.chrisdail.devtest.provided;

public class StoragePool {
    private String id;
    private String poolName;
    private RaidLevel raidLevel;
    private long totalSize;
    private long usedSize;
    private long freeSize;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPoolName() {
        return poolName;
    }
    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }
    public RaidLevel getRaidLevel() {
        return raidLevel;
    }
    public void setRaidLevel(RaidLevel raidLevel) {
        this.raidLevel = raidLevel;
    }
    public long getTotalSize() {
        return totalSize;
    }
    public void setTotalSize(long totalSize) {
        this.totalSize = totalSize;
    }
    public long getUsedSize() {
        return usedSize;
    }
    public void setUsedSize(long usedSize) {
        this.usedSize = usedSize;
    }
    public long getFreeSize() {
        return freeSize;
    }
    public void setFreeSize(long freeSize) {
        this.freeSize = freeSize;
    }
}
