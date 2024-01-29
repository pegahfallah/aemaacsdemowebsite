
package com.aem.aemaacs.demowebsite.core.models;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;


@Model(adaptables = Resource.class,
       defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class ButtonModel {

    @Inject @Named("text")
    private String text;

    @Inject @Named("link")
    private String link;

    @Inject @Named("newTab")
    private Boolean newTab;

    @Inject @Named("accessibilityLabel")
    private String accessibilityLabel;

   

    public String getText() {
        return text;
    }

    public String getLink() {
        return link;
    }

    public Boolean getNewTab() {
        return newTab != null && newTab;
    }

    public String getAccessibilityLabel() {
        return accessibilityLabel;
    }
}


    

