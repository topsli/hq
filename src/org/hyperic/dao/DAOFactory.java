package org.hyperic.dao;

import org.hyperic.hibernate.dao.CpropDAO;
import org.hyperic.hibernate.dao.HibernateDAOFactory;
import org.hyperic.hibernate.dao.AgentDAO;
import org.hyperic.hibernate.dao.ApplicationDAO;
import org.hyperic.hibernate.dao.CpropKeyDAO;
import org.hyperic.hibernate.dao.PlatformDAO;
import org.hyperic.hibernate.dao.ServerDAO;
import org.hyperic.hibernate.dao.ServiceDAO;
import org.hyperic.hibernate.dao.HibernateMockDAOFactory;
import org.hyperic.hibernate.dao.ConfigResponseDAO;
import org.hyperic.hibernate.dao.ServiceTypeDAO;
import org.hibernate.Session;

/**
 *
 */
public abstract class DAOFactory
{
    public static final int HIBERNATE = 1;
    public static final int HIBERNATE_MOCKTEST = 2;

    public static int DEFAULT = HIBERNATE;

    public abstract AgentDAO getAgentDAO();
    public abstract ApplicationDAO getApplicationDAO();
    public abstract ConfigResponseDAO getConfigResponseDAO();
    public abstract CpropDAO getCpropDAO();
    public abstract CpropKeyDAO getCpropKeyDAO();
    public abstract PlatformDAO getPlatformDAO();
    public abstract ServerDAO getServerDAO();
    public abstract ServiceDAO getServiceDAO();
    public abstract ServiceTypeDAO getServiceTypeDAO();

    public static ThreadLocal defaultSession = new ThreadLocal();

    public static DAOFactory getDAOFactory()
    {
        return getDAOFactory(DEFAULT);
    }

    /**
     * @return mock hibernate factory suitable for use with mockejb
     */
    public static DAOFactory getMockDAOFactory(Session session)
    {
        HibernateMockDAOFactory factory = (HibernateMockDAOFactory)getDAOFactory(HIBERNATE_MOCKTEST);
        factory.setCurrentSession(session);
        return factory;
    }

    public static DAOFactory getDAOFactory(int which)
    {
        switch (which) {
        case HIBERNATE:
            return new HibernateDAOFactory();
        case HIBERNATE_MOCKTEST:
            HibernateMockDAOFactory factory = new HibernateMockDAOFactory();
            factory.setCurrentSession((Session)defaultSession.get());
            return factory;
        }
        throw new RuntimeException("DAOFactory type not found: " + which);
    }

    public static void setDefaultDAOFactory(int which)
    {
        DEFAULT = which;
    }

    public static void setMockSession(Session session)
    {
        defaultSession.set(session);
    }
}
