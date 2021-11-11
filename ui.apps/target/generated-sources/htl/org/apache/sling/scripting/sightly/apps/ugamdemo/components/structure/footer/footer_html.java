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
package org.apache.sling.scripting.sightly.apps.ugamdemo.components.structure.footer;

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

out.write(" <footer class=\"footer\">\n    <div class=\"container\">\n      <div class=\"row\">\n\n        <div class=\"col-md-12 col-lg-4\">\n          <div class=\"footer-logo\">\n\n            <a class=\"navbar-brand\" href=\"#\">Sample</a>\n            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the.</p>\n\n          </div>\n        </div>\n\n        <div class=\"col-sm-6 col-md-3 col-lg-2\">\n          <div class=\"list-menu\">\n\n            <h4>Abou Us</h4>\n\n            <ul class=\"list-unstyled\">\n              <li><a href=\"#\">About us</a></li>\n              <li><a href=\"#\">Features item</a></li>\n              <li><a href=\"#\">Live streaming</a></li>\n              <li><a href=\"#\">Privacy Policy</a></li>\n            </ul>\n\n          </div>\n        </div>\n\n      \n        <div class=\"col-sm-6 col-md-3 col-lg-2\">\n          <div class=\"list-menu\">\n\n            <h4>Support</h4>\n\n            <ul class=\"list-unstyled\">\n              <li><a href=\"#\">faq</a></li>\n              <li><a href=\"#\">Editor help</a></li>\n              <li><a href=\"#\">Contact us</a></li>\n              <li><a href=\"#\">Privacy Policy</a></li>\n            </ul>\n\n          </div>\n        </div>\n\n      \n\n      </div>\n    </div>\n\n    <div class=\"copyrights\">\n      <div class=\"container\">\n        <p>&copy; Copyrights . All rights reserved.</p>\n        <div class=\"credits\">\n        </div>\n      </div>\n    </div>\n\n  </footer>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

