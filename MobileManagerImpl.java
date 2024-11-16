package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MobileManagerImpl implements MobileManager {
    private List<Mobile> mobileList = new ArrayList<>();
    
    @Override
    public boolean addMobile(Mobile m) {
        // Kiểm tra nếu product_id đã tồn tại
        boolean exists = mobileList.stream()
                .anyMatch(mobile -> mobile.getProduct_id().equals(m.getProduct_id()));
        if (exists) {
            return false; // Mobile đã tồn tại, không thêm
        }
        return mobileList.add(m); // Thêm mới nếu không tồn tại
    }

    @Override
    public boolean editMobile(Mobile m) {
        for (int i = 0; i < mobileList.size(); i++) {
            if (mobileList.get(i).getProduct_id().equals(m.getProduct_id())) {
                mobileList.set(i, m);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delMobile(Mobile m) {
        return mobileList.removeIf(mobile -> mobile.getProduct_id().equals(m.getProduct_id()));
    }

    @Override
    public List<Mobile> searchMobile(String name) {
        return mobileList.stream()
                .filter(mobile -> mobile.getProduct_name().contains(name))
                .collect(Collectors.toList());
    }


}

