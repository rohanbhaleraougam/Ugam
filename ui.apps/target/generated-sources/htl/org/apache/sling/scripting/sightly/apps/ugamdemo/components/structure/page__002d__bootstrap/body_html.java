/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.ugamdemo.components.structure.page__002d__bootstrap;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class body_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

out.write("<div class=\"container-fluid\">\n\t<div>");
{
    Object var_resourcecontent0 = renderContext.call("includeResource", "header", obj().with("resourceType", "/apps/editabledemo/components/structure/header/header.html"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent0));
}
out.write("</div>\n</div>\n<section id=\"about-us\" class=\"about-us padd-section wow fadeInUp\">\n\n<div class=\"container\">\n    <div class=\"row justify-content-center\">\n\t\t<div class=\"col-md-5 col-lg-3\">\n\t\t\t<div>");
{
    Object var_resourcecontent1 = renderContext.call("includeResource", "sideimage", obj().with("resourceType", "wcm/foundation/components/responsivegrid"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent1));
}
out.write("</div>\n\t\t</div>\n\n\t\t<div class=\"col-md-7 col-lg-5\">\n\t\t\t<div class=\"about-content\">\n\t\t\t\t<div>");
{
    Object var_resourcecontent2 = renderContext.call("includeResource", "sidetext", obj().with("resourceType", "wcm/foundation/components/responsivegrid"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent2));
}
out.write("</div>\n\t\t\t</div>\n\t\t</div>\n\t</div>\n</div>\n</section>\n\n<section id=\"blog\" class=\"padd-section wow fadeInUp\">\n\t<div class=\"container\">\n\t\t  <div class=\"section-title\">\n\t\t\t<div>");
{
    Object var_resourcecontent3 = renderContext.call("includeResource", "teaserheader", obj().with("resourceType", "wcm/foundation/components/responsivegrid"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent3));
}
out.write("</div>        \n\t\t  </div>\n\t</div>\n\t<div class=\"container\">\n\t\t<div class=\"row\">\n\t\t\t<div class=\"col-md-6 col-lg-4\">\n\t\t\t  <div class=\"block-blog text-left\">\n\t\t\t\t<div>");
{
    Object var_resourcecontent4 = renderContext.call("includeResource", "teaser1", obj().with("resourceType", "wcm/foundation/components/responsivegrid"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent4));
}
out.write("</div>             \n\t\t\t  </div>\n\t\t\t</div>\n\n\t\t\t<div class=\"col-md-6 col-lg-4\">\n\t\t\t\t <div class=\"block-blog text-left\">\n\t\t\t\t\t<div>");
{
    Object var_resourcecontent5 = renderContext.call("includeResource", "teaser2", obj().with("resourceType", "wcm/foundation/components/responsivegrid"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent5));
}
out.write("</div>             \n\t\t\t\t  </div>\n\t\t\t</div>\n\t\t\t<div class=\"col-md-6 col-lg-4\">\n\t\t\t\t<div class=\"block-blog text-left\">\n\t\t\t\t  <div>");
{
    Object var_resourcecontent6 = renderContext.call("includeResource", "teaser3", obj().with("resourceType", "wcm/foundation/components/responsivegrid"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent6));
}
out.write("</div>             \n\t\t\t\t </div>\n\t\t\t</div>\n\t\t</div>\n\t</div>\n</section>\n<div class=\"container-fluid padd-section\">\n\t<div>");
{
    Object var_resourcecontent7 = renderContext.call("includeResource", "footer", obj().with("resourceType", "/apps/editabledemo/components/structure/footer/footer.html"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent7));
}
out.write("</div>\n</div>\n\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

