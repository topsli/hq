/*
 * NOTE: This copyright does *not* cover user programs that use HQ
 * program services by normal system calls through the application
 * program interfaces provided as part of the Hyperic Plug-in Development
 * Kit or the Hyperic Client Development Kit - this is merely considered
 * normal use of the program, and does *not* fall under the heading of
 * "derived work".
 *
 * Copyright (C) [2009-2010], VMware, Inc.
 * This file is part of HQ.
 *
 * HQ is free software; you can redistribute it and/or modify
 *  it under the terms version 2 of the GNU General Public License as
 *  published by the Free Software Foundation. This program is distributed
 *  in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 *  even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 *  PARTICULAR PURPOSE. See the GNU General Public License for more
 *  details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307
 *  USA.
 */

package org.hyperic.hq.rabbit;

import org.hyperic.hq.agent.bizapp.client.AgentClient;
import org.hyperic.hq.test.BaseInfrastructureTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.*;

import static org.junit.Assert.assertEquals;


public class SpringAgentTest extends BaseInfrastructureTest {

    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    private static final String agent_home = "/agent-4.6.0.BUILD-SNAPSHOT";

    private final String  agent_bundle_home = agent_home + "/bundles/agent-4.6.0.BUILD-SNAPSHOT";

    @Before
    public void before() {
        System.setProperty("agent.install.home", agent_home);
        System.setProperty("agent.bundle.home", agent_bundle_home);
    }                                                     
    @After
    public void destroy () { 
        executor.shutdown();
    }
  
    @Test
    public void veryBasicSpringAgentTest() throws InterruptedException, ExecutionException, TimeoutException {
         Future<Boolean> success = executor.submit(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                AgentClient.main(new String[]{"start"});
                TimeUnit.MILLISECONDS.sleep(1000);
                  
                AgentClient.main(new String[]{"die", "5000"});
                TimeUnit.MILLISECONDS.sleep(1000);
                return true;
            }
        });

        assertEquals(true, success.get(10000, TimeUnit.MILLISECONDS));
    }
}