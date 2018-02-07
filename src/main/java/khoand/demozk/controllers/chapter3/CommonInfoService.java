package khoand.demozk.controllers.chapter3;

import org.zkoss.zul.ListModelList;

/**
 * Created by quantri on 07/02/2018.
 */
public class CommonInfoService {
    static ListModelList<String> countryModel = new ListModelList<String>();

    public CommonInfoService() {
        countryModel.add(1, "Viet nam");
        countryModel.add(2, "Viet nam2");
    }

    public static int getCountryList() {
        return countryModel.size();
    }

    public ListModelList<String> getCountryModel() {
        return countryModel;
    }
}
