package khoand.demozk.controllers.chapter2.SidebarPage;

import java.util.List;

/**
 * Created by quantri on 05/02/2018.
 */
public interface SidebarPageConfig {
    /** get pages of this application **/
    public List<SidebarPage> getPages();

    /** get page **/
    public SidebarPage getPage(String name);
}
