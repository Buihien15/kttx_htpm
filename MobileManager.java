package com.example;

import java.util.List;

public interface MobileManager {
    boolean addMobile(Mobile m);
    boolean editMobile(Mobile m);
    boolean delMobile(Mobile m);
    List<Mobile> searchMobile(String name);
    List<Mobile> sortedMobile(boolean ascending);
}
