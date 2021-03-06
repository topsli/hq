/*
 * NOTE: This copyright does *not* cover user programs that use HQ
 * program services by normal system calls through the application
 * program interfaces provided as part of the Hyperic Plug-in Development
 * Kit or the Hyperic Client Development Kit - this is merely considered
 * normal use of the program, and does *not* fall under the heading of
 * "derived work".
 * 
 * Copyright (C) [2004, 2005, 2006], Hyperic, Inc.
 * This file is part of HQ.
 * 
 * HQ is free software; you can redistribute it and/or modify
 * it under the terms version 2 of the GNU General Public License as
 * published by the Free Software Foundation. This program is distributed
 * in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307
 * USA.
 */

package org.hyperic.hq.ui.action.resource.common.monitor.visibility;

import java.util.List;

import javax.servlet.ServletException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.tiles.AttributeContext;
import org.apache.tiles.context.TilesRequestContext;
import org.apache.tiles.preparer.ViewPreparer;
import org.hyperic.hq.appdef.shared.AppdefEntityID;
import org.hyperic.hq.appdef.shared.AppdefEntityNotFoundException;
import org.hyperic.hq.appdef.shared.AppdefEntityTypeID;
import org.hyperic.hq.appdef.shared.ApplicationNotFoundException;
import org.hyperic.hq.auth.shared.SessionNotFoundException;
import org.hyperic.hq.auth.shared.SessionTimeoutException;
import org.hyperic.hq.authz.shared.PermissionException;
import org.hyperic.hq.bizapp.shared.MeasurementBoss;
import org.hyperic.hq.bizapp.shared.uibeans.MeasurementMetadataSummary;
import org.hyperic.hq.grouping.shared.GroupNotCompatibleException;
import org.hyperic.hq.measurement.TemplateNotFoundException;
import org.hyperic.hq.ui.Constants;
import org.hyperic.hq.ui.action.BaseActionNG;
import org.hyperic.hq.ui.util.RequestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("viewMetricMetadataActionNG")
public class ViewMetricMetadataActionNG extends BaseActionNG implements
		ViewPreparer {

	protected final Log log = LogFactory
			.getLog(ViewMetricMetadataActionNG.class);
	@Autowired
	private MeasurementBoss measurementBoss;

	public void execute(TilesRequestContext tilesContext,
			AttributeContext attributeContext) {
		request = getServletRequest();
		MetricMetadataFormNG cform = new MetricMetadataFormNG();
		if(request.getParameter("eid") != null){
			cform.setEid(request.getParameter("eid"));
		}
		if(request.getParameter("m") != null){
			cform.setM(Integer.parseInt(request.getParameter("m")));
		}
		if(request.getParameter("ctype") != null){
			cform.setCtype(request.getParameter("ctype"));
		}
		int sessionId;
		try {
			sessionId = RequestUtils.getSessionId(request).intValue();

			AppdefEntityID aid = new AppdefEntityID(cform.getEid());

			AppdefEntityTypeID atid = null;
			if (cform.getCtype() != null) {
				atid = new AppdefEntityTypeID(cform.getCtype());
			}

			List<MeasurementMetadataSummary> mdss = measurementBoss
					.findMetricMetadata(sessionId, aid, atid, cform.getM());
			request.setAttribute(Constants.METRIC_SUMMARIES_ATTR, mdss);
		} catch (ServletException e) {
			log.error(e);
		} catch (ApplicationNotFoundException e) {
			log.error(e);
		} catch (SessionNotFoundException e) {
			log.error(e);
		} catch (SessionTimeoutException e) {
			log.error(e);
		} catch (GroupNotCompatibleException e) {
			log.error(e);
		} catch (AppdefEntityNotFoundException e) {
			log.error(e);
		} catch (TemplateNotFoundException e) {
			log.error(e);
		} catch (PermissionException e) {
			log.error(e);
		}
	}
}
