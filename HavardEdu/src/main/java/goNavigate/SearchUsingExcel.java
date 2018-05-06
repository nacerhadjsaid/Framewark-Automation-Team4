package goNavigate;

import base.CommonAPI;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by mahmudurrahman
 * On 5/5/18.
 */
public class SearchUsingExcel extends CommonAPI {
    public void tryExel() throws IOException {


        ArrayList<String> searchAbleUsers = dataFromExcel("/Users/mahmudurrahman/IdeaProject/Framwark-Automation-Team4/HavardEdu/data/WhatCanYouFind.xls", "Sheet1", 0);
        for (int i = 1; i < searchAbleUsers.size(); i++) {
            clickByXpath("//input[@type='search']");
            typeByXpath("//input[@type='search']", searchAbleUsers.get(i));
          //  typeByXpath("", searchAblePass.get(i));
        }

    }
}
