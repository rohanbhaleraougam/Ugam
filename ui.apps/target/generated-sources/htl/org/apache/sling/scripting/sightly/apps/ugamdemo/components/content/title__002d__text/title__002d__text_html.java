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
package org.apache.sling.scripting.sightly.apps.ugamdemo.components.content.title__002d__text;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class title__002d__text_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_titletext = null;
_global_titletext = renderContext.call("use", com.ugamdemo.core.models.TitleText.class.getName(), obj());
out.write("\n<section class=\"services-area section-gap p-0\">\t\t\t\t\n\t\t\t\t<div class=\"container\">\n\t\t            <div class=\"row d-flex justify-content-center\">\n\t\t                <div class=\"menu-content  col-lg-7\">\n                        ");
{
    boolean var_testvariable0 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_titletext, "sectionGap"), true));
    if (var_testvariable0) {
        out.write("<div>\n\t\t\t\t\t\t<div style=\"padding-top:120px\"></div>\n                        </div>");
    }
}
out.write("\n\t\t                <div class=\"title text-center\">\n\t\t                      <h1 class=\"mb-10\">");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_titletext, "title"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</h1>\n\t\t                      <p>");
{
    Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_titletext, "text"), "text");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</p>\n\t\t                </div>\n                        ");
{
    boolean var_testvariable3 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_titletext, "bottomPadding"), true));
    if (var_testvariable3) {
        out.write("<div>\n\t\t\t\t\t\t<div style=\"padding-bottom:70px\"></div>\n                        </div>");
    }
}
out.write("\n\t\t               </div>\n\t\t            </div>\n                 </div>\n</section>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

