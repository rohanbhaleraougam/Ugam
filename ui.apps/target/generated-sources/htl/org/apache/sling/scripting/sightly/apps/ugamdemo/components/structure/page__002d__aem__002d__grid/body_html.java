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
package org.apache.sling.scripting.sightly.apps.ugamdemo.components.structure.page__002d__aem__002d__grid;

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

out.write("<div class=\"root responsivegrid\">\n    <div class=\"aem-Grid aem-Grid--default--12 \">\n\t\t<div class=\"aem-GridColumn aem-GridColumn--default--12\">");
{
    Object var_includedresult0 = renderContext.call("include", "/apps/editabledemo/components/structure/header/header.html", obj());
    out.write(renderContext.getObjectModel().toString(var_includedresult0));
}
out.write("</div>\n\n\t\t<div class=\"top-content aem-Grid aem-Grid--default--12 aem-Grid--phone--12 aem-Grid--tablet--12\">\n\t\t\t<div class=\"aem-GridColumn--offset--tablet--0 aem-GridColumn--default--none aem-GridColumn--phone--none aem-GridColumn--phone--12 aem-GridColumn--tablet--none aem-GridColumn aem-GridColumn--tablet--5 aem-GridColumn--offset--phone--0 aem-GridColumn--offset--default--0 aem-GridColumn--default--3\">\n\t\t\t\t<div>");
{
    Object var_resourcecontent2 = renderContext.call("includeResource", "sideimage", obj().with("resourceType", "wcm/foundation/components/responsivegrid"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent2));
}
out.write("</div>\n\t\t\t</div>\n\n\t\t\t<div class=\"container-top-padding aem-GridColumn--offset--tablet--0 aem-GridColumn--default--none aem-GridColumn--phone--none aem-GridColumn--phone--12 aem-GridColumn--tablet--none aem-GridColumn aem-GridColumn--tablet--7 aem-GridColumn--offset--phone--0 aem-GridColumn--offset--default--0 aem-GridColumn--default--5\">\n\t\t\t\t<div>");
{
    Object var_resourcecontent3 = renderContext.call("includeResource", "sidetext", obj().with("resourceType", "wcm/foundation/components/responsivegrid"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent3));
}
out.write("</div>\n\t\t\t</div>\n\n\t   </div>  \n\n\t\t <div class=\"aem-Grid aem-Grid--default--12 aem-Grid--phone--12 aem-Grid--tablet--12\">\n\t\t\t<div class=\"aem-GridColumn aem-GridColumn--default--12\">");
{
    Object var_resourcecontent4 = renderContext.call("includeResource", "teasertext", obj().with("resourceType", "wcm/foundation/components/responsivegrid"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent4));
}
out.write("</div>\n\t\t\t<div class=\"aem-GridColumn--offset--tablet--0 aem-GridColumn--default--none aem-GridColumn--phone--none aem-GridColumn--phone--12 aem-GridColumn--tablet--none aem-GridColumn aem-GridColumn--tablet--6 aem-GridColumn--offset--phone--0 aem-GridColumn--offset--default--0 aem-GridColumn--default--4\">\n\t\t\t\t<div>");
{
    Object var_resourcecontent5 = renderContext.call("includeResource", "teaser1", obj().with("resourceType", "wcm/foundation/components/responsivegrid"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent5));
}
out.write("</div>\n\t\t\t</div>\n\n\t\t\t<div class=\"aem-GridColumn--offset--tablet--0 aem-GridColumn--default--none aem-GridColumn--phone--none aem-GridColumn--phone--12 aem-GridColumn--tablet--none aem-GridColumn aem-GridColumn--tablet--6 aem-GridColumn--offset--phone--0 aem-GridColumn--offset--default--0 aem-GridColumn--default--4\">\n\t\t\t\t<div>");
{
    Object var_resourcecontent6 = renderContext.call("includeResource", "teaser2", obj().with("resourceType", "wcm/foundation/components/responsivegrid"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent6));
}
out.write("</div>\n\t\t\t</div>\n\n\t\t\t<div class=\"aem-GridColumn--offset--tablet--0 aem-GridColumn--default--none aem-GridColumn--phone--none aem-GridColumn--phone--12 aem-GridColumn--tablet--none aem-GridColumn aem-GridColumn--tablet--6 aem-GridColumn--offset--phone--0 aem-GridColumn--offset--default--0 aem-GridColumn--default--4\">\n\t\t\t\t<div>");
{
    Object var_resourcecontent7 = renderContext.call("includeResource", "teaser3", obj().with("resourceType", "wcm/foundation/components/responsivegrid"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent7));
}
out.write("</div>\n\t\t\t</div>\n\t\t </div> \n\n\t\t<div class=\"aem-GridColumn aem-GridColumn--default--12\">");
{
    Object var_includedresult8 = renderContext.call("include", "/apps/editabledemo/components/structure/footer/footer.html", obj());
    out.write(renderContext.getObjectModel().toString(var_includedresult8));
}
out.write("</div>\n    \n    </div>\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

