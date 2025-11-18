package com.chain.handlers;

import com.chain.type.request.Leave;

public abstract class LeaveHandler {
	
	
	protected LeaveHandler superVisor;

    public void setSuperVisor(LeaveHandler superVisor) {
        this.superVisor = superVisor;
    }

    public abstract String applyLeave(Leave leave);

}
