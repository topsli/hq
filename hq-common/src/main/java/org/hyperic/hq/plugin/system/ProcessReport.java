package org.hyperic.hq.plugin.system;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ProcessReport implements Serializable {

    private static final long serialVersionUID = 1L;
    private long pid;
    private String owner;
    private long size;
    private long resident;
    private long share;
    private long cpuTotal;
    private double cpuPerc;
    private double memPerc;
    private String baseName;
    private long startTime;
    private String[] args;

    public ProcessReport() {
    }

    public ProcessReport(ProcessData process) {
        this.pid = process.getPid();
        this.owner = process.getOwner();
        this.size = process.getSize();
        this.resident = process.getResident();
        this.share = process.getShare();
        this.cpuTotal = process.getCpuTotal();
        this.cpuPerc = process.getCpuPerc();
        this.memPerc = process.getMemPerc();
        this.baseName = process.getBaseName();
        this.startTime = process.getStartTime();
        this.setArgs(process.getProcArgs());
    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public long getResident() {
        return resident;
    }

    public void setResident(long resident) {
        this.resident = resident;
    }

    public long getShare() {
        return share;
    }

    public void setShare(long share) {
        this.share = share;
    }

    public double getCpuPerc() {
        return cpuPerc;
    }

    public void setCpuPerc(double cpuPerc) {
        this.cpuPerc = cpuPerc;
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    public long getCpuTotal() {
        return cpuTotal;
    }

    public void setCpuTotal(long cpuTotal) {
        this.cpuTotal = cpuTotal;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public String[] getArgs() {
        return args;
    }

    public void setArgs(String[] args) {
        this.args = args;
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        pid = in.readLong();
        owner = in.readUTF();
        size = in.readLong();
        resident = in.readLong();
        share = in.readLong();
        cpuTotal = in.readLong();
        cpuPerc = in.readDouble();
        memPerc = in.readDouble();
        baseName = in.readUTF();
        startTime = in.readLong();
        args = (String[]) in.readObject();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeLong(pid);
        out.writeUTF(owner);
        out.writeLong(size);
        out.writeLong(resident);
        out.writeLong(share);
        out.writeLong(cpuTotal);
        out.writeDouble(cpuPerc);
        out.writeDouble(memPerc);
        out.writeUTF(baseName);
        out.writeLong(startTime);
        out.writeObject(args);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("pid=").append(pid).append(", owner=").append(owner).append(", size=").append(size).append(", " +
                "" + "resident=").append(resident).append(", share=").append(share).append(", " +
                "" + "cpuTotal=").append(cpuTotal).append(", cpuPerc=").append(cpuPerc).append(", " +
                "" + "memPerc=").append(memPerc).append(", baseName = ").append(baseName).append(", " +
                "" + "startTime = ").append(startTime).append(", args = ");
        for (String arg : args) {
            if (!arg.equalsIgnoreCase("")) {
                sb.append(arg).append(",");
            }
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }


}
