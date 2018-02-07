package khoand.demozk.controllers.chapter3;

import org.zkoss.zul.ListModelList;

/**
 * Created by quantri on 07/02/2018.
 */
public class CommonInfoService {
    static ListModelList<String> countryModel = new ListModelList<String>();

    public CommonInfoService() {
//        countryModel.add(1, "Viet nam");
//        countryModel.add(2, "Viet nam2");
    }

    public static ListModelList<String> getCountryList() {
        countryModel.add("Viet nam");
        countryModel.add("Viet nam1");
//        countryModel.add(1, "Viet nam");
//        countryModel.add(2, "Viet nam2");
        return countryModel;
    }

    public ListModelList<String> getCountryModel() {
        countryModel.add("Viet nam");
        countryModel.add("Viet nam1");
        return countryModel;
    }
}
