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
package org.apache.sling.scripting.sightly.apps.ugamdemo.components.content.price;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class price_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_price = null;
_global_price = renderContext.call("use", com.ugamdemo.core.models.Price.class.getName(), obj());
out.write("\n<section class=\"price-area section-gap\">\n                <div class=\"container\">\n                    <div class=\"row\">\n                    <div class=\" single-price col-md-12\">\n                            <div class=\"top-part\">           \n                                <h1 class=\"package-no\">");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_price, "priceNumber"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h1>\n                                <h4>");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_price, "priceType"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</h4>\n                                <p class=\"mt-10\">");
{
    Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_price, "priceTitle"), "text");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</p>\n                            </div>\n                            <div class=\"package-list\">\n                                <ul>\n                                    <li>");
{
    Object var_3 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_price, "priceText1"), "text");
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("</li>\n                                    <li>");
{
    Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_price, "priceText2"), "text");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</li>\n                                    <li>");
{
    Object var_5 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_price, "priceText3"), "text");
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("</li>\n                                </ul>\n                            </div>                           \n                        </div>\n                    </div>\n                </div>   \n            </section>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

