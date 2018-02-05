package khoand.demozk.controllers.chapter2;

import khoand.demozk.controllers.chapter2.SidebarPage.SidebarPage;
import khoand.demozk.controllers.chapter2.SidebarPage.SidebarPageConfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by quantri on 05/02/2018.
 */
public class SidebarPageConfigChapter2Impl implements SidebarPageConfig {
    HashMap<String,SidebarPage> pageMap = new LinkedHashMap<String,SidebarPage>();
    public SidebarPageConfigChapter2Impl(){
        pageMap.put("fn1",new SidebarPage("zk","ZK","/img/nice2.png","http://www.zkoss.org/"));
        pageMap.put("fn2",new SidebarPage("demo","ZK Demo","/img/nice2.png","http://www.zkoss.org/zkdemo"));
        pageMap.put("fn3",new SidebarPage("devref","ZK Developer Reference","/img/nice2.png","http://books.zkoss.org/wiki/ZK_Developer's_Reference"));
    }
    public List<SidebarPage> getPages() {

        List<SidebarPage> arList = new ArrayList<SidebarPage>();

        for(HashMap.Entry<String,SidebarPage> map : pageMap.entrySet()){

            arList.add(map.getValue());

        }
        return arList;
    }

    public SidebarPage getPage(String name) {

        return pageMap.get(name);
    }
}
