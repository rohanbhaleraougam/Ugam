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
package org.apache.sling.scripting.sightly.apps.ugamdemo.components.content.testimonial;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class testimonial_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_testimonial = null;
out.write("\n<section class=\"section-gap p-0\">\n\t\t        ");
_global_testimonial = renderContext.call("use", com.ugamdemo.core.models.Testimonial.class.getName(), obj());
out.write("<div class=\"container\">\t\n\n\n                 <div class=\"row\">\n\t\t                <div class=\"active-testimonial\">\n                        <div class=\"single-testimonial item d-flex flex-row\">\n\t\t                        <div class=\"thumb\">\n\t\t                            <img class=\"img-fluid\" src=\"\" alt=\"\"/>\n\t\t                        </div>\n\t\t                        <div class=\"desc\">\t\t\t\t\n\t\t                            <p>");
{
    String var_0 = (("\n\t\t\t\t\t\t\t\t\t\t" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_testimonial, "testimonialDescription"), "text"))) + "\n\t\t                            ");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</p>\n\t\t                            <h4>");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_testimonial, "testimonialName"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</h4>\n\t\t                            <p>");
{
    Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_testimonial, "testimonialDesignation"), "text");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</p>\n\t\t                        </div>\n\t\t                    </div>\n                           </div>\n\t\t            </div>\n                 </div>\n\t\t </section>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

