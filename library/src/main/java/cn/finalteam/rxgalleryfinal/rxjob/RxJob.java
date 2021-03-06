package cn.finalteam.rxgalleryfinal.rxjob;

/**
 * Desction:
 * Author:pengjianbo
 * Date:16/7/31 上午9:09
 */
public class RxJob {

    private final JobManager jobManager;
    private static RxJob rxJob;

    public RxJob() {
        jobManager = new JobManager();
    }

    public static RxJob getDefault() {
        if(rxJob == null){
            rxJob = new RxJob();
        }
        return rxJob;
    }

    public void addJob(Job job) {
        jobManager.addJob(job);
    }

    public void clearJob() {
        jobManager.clear();
    }
}
