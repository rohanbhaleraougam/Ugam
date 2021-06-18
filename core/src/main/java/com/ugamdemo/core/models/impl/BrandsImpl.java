package com.ugamdemo.core.models.impl;
import com.ugamdemo.core.models.Brands;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import javax.inject.Inject;
import java.util.*;
@Model(adaptables = Resource.class,
        adapters = Brands.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BrandsImpl implements Brands{
    @Inject
    List<String> imgPath;
    @Override
    public List<String> getImgPath() {
        if(imgPath!=null)
        {
            return new ArrayList<String>(imgPath);
        }
        else
        {
            return Collections.emptyList();
        }
    }
}