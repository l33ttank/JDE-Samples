/*
 * SVGAnimatorDemo.java
 *
 * Copyright � 1998-2011 Research In Motion Limited
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Note: For the sake of simplicity, this sample application may not leverage
 * resource bundles and resource strings.  However, it is STRONGLY recommended
 * that application developers make use of the localization features available
 * within the BlackBerry development platform to ensure a seamless application
 * experience across a variety of languages and geographies.  For more information
 * on localizing your application, please refer to the BlackBerry Java Development
 * Environment Development Guide associated with this release.
 */

package com.rim.samples.device.svg.svganimatordemo;

import net.rim.device.api.ui.UiApplication;

/**
 * Simple UiApplication which uses JSR226 to build a simple SVGImage from
 * scratch and render it as a custom background image for a custom user defined
 * screen.
 */
public final class SVGAnimatorDemo extends UiApplication {
    /**
     * Creates a new SVGAnimatorDemo object
     */
    public SVGAnimatorDemo() {
        final SVGScreen screen = new SVGScreen();
        pushScreen(screen);
    }

    /**
     * Main entry point into the UiApplication.
     * 
     * @param args
     *            Command line arguments (not used)
     */
    public static void main(final String[] args) {
        // Create a new instance of the application and make the currently
        // running thread the application's event dispatch thread.
        final SVGAnimatorDemo app = new SVGAnimatorDemo();
        app.enterEventDispatcher();
    }
}
