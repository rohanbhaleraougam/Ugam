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
package org.apache.sling.scripting.sightly.apps.ugamdemo.components.content.footer;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class footer_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_footer = null;
out.write("\n");
_global_footer = renderContext.call("use", com.ugamdemo.core.models.Footer.class.getName(), obj());
out.write("\n <footer class=\"footer-area section-gap\">\n                <div class=\"container\">\n                    <div class=\"row\">\n                        <div class=\"col-lg-5 col-md-6 col-sm-6\">\n                            <div class=\"single-footer-widget\">\n                                <h4>");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_footer, "heading1"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h4>\n                                <p>");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_footer, "text1"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</p>\n                            </div>\n                        </div>\n                        <div class=\"col-lg-5 col-md-6 col-sm-6\">\n                            <div class=\"single-footer-widget\">\n                                <h4>");
{
    Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_footer, "heading2"), "text");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</h4>\n                                <p>");
{
    Object var_3 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_footer, "text2"), "text");
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("</p>\n\t\t\t\t\t\t\t\t<div class=\"\" id=\"mc_embed_signup\">\n\t\t\t\t\t\t\t\t\t <form target=\"_blank\" action=\"\" method=\"get\">\n\t\t\t\t\t\t\t\t\t  <div class=\"input-group\">\n\t\t\t\t\t\t\t\t\t    <input type=\"email\" class=\"form-control\" name=\"EMAIL\" placeholder=\"Enter Email Address\" onfocus=\"this.placeholder = ''\" onblur=\"this.placeholder = 'Enter Email Address '\" required=\"\"/>\n\t\t\t\t\t\t\t\t\t    <div class=\"input-group-btn\">\n\t\t\t\t\t\t\t\t\t      <button class=\"btn btn-default\" type=\"submit\">\n\t\t\t\t\t\t\t\t\t        <span class=\"lnr lnr-arrow-right\"></span>\n\t\t\t\t\t\t\t\t\t      </button>    \n\t\t\t\t\t\t\t\t\t    </div>\n\t\t\t\t\t\t\t\t\t    \t<div class=\"info\"></div>  \n\t\t\t\t\t\t\t\t\t  </div>\n\t\t\t\t\t\t\t\t\t</form> \n\t\t\t\t\t\t\t\t</div>\n                            </div>\n                        </div>\n                        <div class=\"col-lg-2 col-md-6 col-sm-6 social-widget\">\n                            <div class=\"single-footer-widget\">\n                                <h4>");
{
    Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_footer, "heading3"), "text");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</h4>\n                                <p>");
{
    Object var_5 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_footer, "text3"), "text");
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("</p>\n                                <div class=\"footer-social d-flex align-items-center\">\n                                    <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n                                    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n                                    <a href=\"#\"><i class=\"fa fa-dribbble\"></i></a>\n                                    <a href=\"#\"><i class=\"fa fa-behance\"></i></a>\n                                </div>\n                            </div>\n                        </div>\n                    </div>\n                </div>\n            </footer>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

