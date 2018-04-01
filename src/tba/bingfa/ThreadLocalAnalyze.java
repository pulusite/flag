package tba.bingfa;

/**
 * Created by zhangdong on 3/26/18.
 */
public class ThreadLocalAnalyze {
    private static ThreadLocal<Integer> seqNum=new ThreadLocal<Integer>(){
        public Integer initiaValue(){
            return 0;
        }
    };


}
