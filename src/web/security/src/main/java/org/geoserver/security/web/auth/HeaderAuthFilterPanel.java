/* Copyright (c) 2001 - 2013 OpenPlans - www.openplans.org. All rights reserved.
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.geoserver.security.web.auth;

import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.IModel;
import org.geoserver.security.config.PreAuthenticatedUserNameFilterConfig.RoleSource;
import org.geoserver.security.config.RequestHeaderAuthenticationFilterConfig;
import org.geoserver.security.filter.GeoServerRequestHeaderAuthenticationFilter;

/**
 * Configuration panel for {@link GeoServerRequestHeaderAuthenticationFilter}.
 * 
 * @author Justin Deoliveira, OpenGeo
 */
public class HeaderAuthFilterPanel 
    extends PreAuthenticatedUserNameFilterPanel<RequestHeaderAuthenticationFilterConfig> {

    DropDownChoice<RoleSource> roleSourceChoice;

    public HeaderAuthFilterPanel(String id, IModel<RequestHeaderAuthenticationFilterConfig> model) {
        super(id, model);
        
        add(new TextField("principalHeaderAttribute").setRequired(true));
    }

}
