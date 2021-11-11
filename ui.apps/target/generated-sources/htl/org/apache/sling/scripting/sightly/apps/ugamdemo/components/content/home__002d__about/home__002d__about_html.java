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
package org.apache.sling.scripting.sightly.apps.ugamdemo.components.content.home__002d__about;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class home__002d__about_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_homeabout = null;
_global_homeabout = renderContext.call("use", com.ugamdemo.core.models.HomeAbout.class.getName(), obj());
out.write("\n<section class=\"home-about-area pt-120\">\t\t\t\t\t\n\t\t\t\t<div class=\"container\">\n\t\t\t\t\t<div class=\"row align-items-center justify-content-between\">\n\t\t\t\t\t\t<div class=\"col-lg-6 col-md-6 home-about-left\">\n    <img class=\"img-fluid\"");
{
    Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_global_homeabout, "img");
    {
        Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "uri");
        {
            Object var_shoulddisplayattr3 = ((renderContext.getObjectModel().toBoolean(var_attrcontent1) ? var_attrcontent1 : ("false".equals(var_attrvalue0))));
            if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr3)) {
                out.write(" src");
                {
                    boolean var_istrueattr2 = (var_attrvalue0.equals(true));
                    if (!var_istrueattr2) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent1));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" alt=\"\"/>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t\t<div class=\"col-lg-5 col-md-6 home-about-right\">\n\t\t\t\t\t\t\t<h6>");
{
    Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_homeabout, "homeAboutTitle"), "text");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</h6>\n\t\t\t\t\t\t\t<h1 class=\"text-uppercase\">");
{
    Object var_5 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_homeabout, "homeAboutHeading"), "text");
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("</h1>\n\t\t\t\t\t\t\t<p>");
{
    String var_6 = (("\n\t\t\t\t\t\t\t\t " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_homeabout, "homeAboutDescription"), "text"))) + "\n\t\t\t\t\t\t\t");
    out.write(renderContext.getObjectModel().toString(var_6));
}
out.write("</p>\n                                <a");
{
    String var_attrcontent7 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_homeabout, "pathValue"), "uri")) + ".html");
    {
        Object var_shoulddisplayattr8 = ((renderContext.getObjectModel().toBoolean(var_attrcontent7) ? var_attrcontent7 : ("false".equals(var_attrcontent7))));
        if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr8)) {
            out.write(" href=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent7));
            out.write("\"");
        }
    }
}
out.write(" class=\"primary-btn text-uppercase\">");
{
    Object var_9 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_homeabout, "homeAboutButtonTitle"), "text");
    out.write(renderContext.getObjectModel().toString(var_9));
}
out.write("</a>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t</div>\n\t\t\t\t</div>\t\n\t\t\t</section>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

