/**
 *  Ui
 *  Copyright 24.05.2017 by Michael Peter Christen, @0rb1t3r
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *  
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *  
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with this program in the file lgpl21.txt
 *  If not, see <http://www.gnu.org/licenses/>.
 */

package net.yacy.grid.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.Servlet;

import net.yacy.grid.YaCyServices;
import net.yacy.grid.mcp.MCP;
import net.yacy.grid.mcp.Service;

public class Ui {

    private final static YaCyServices SERVICE = YaCyServices.moderation;
    private final static String DATA_PATH = "data";
    private final static String APP_PATH = "ui";
    private final static String HTML_PATH = "html";
 
    // define services
    @SuppressWarnings("unchecked")
    public final static Class<? extends Servlet>[] LOADER_SERVICES = new Class[]{
            // app services
    };
    
    public static void main(String[] args) {
        List<Class<? extends Servlet>> services = new ArrayList<>();
        services.addAll(Arrays.asList(MCP.MCP_SERVICES));
        services.addAll(Arrays.asList(LOADER_SERVICES));
        Service.runService(SERVICE, DATA_PATH, APP_PATH, HTML_PATH, services);
    }
    
}
