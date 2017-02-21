package com.springapp.object;

/**
 * Created by hector.meza on 03/02/2017.
 */
public class timeoutClass implements Publisher{
    private Long timeout = (long) 30000;

    public long getTimeout() {
        return timeout;
    }

    public void setTimeout(Long timeout) {
        this.timeout = timeout;
    }

}
