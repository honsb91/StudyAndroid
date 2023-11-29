package com.example.and00_vendingmachine;

import android.widget.Button;
import android.widget.TextView;

public class Drink {

    // 음료명 , 음료가격 , 음료개수
    // 각각의 데이터를 변수를 하나씩 지정하여 사용하기보다는 묶어서 관리하는게 조금 더 효율적
    // drinkCnt1 , drinkPrice1 ... 2...3...4 반복

    private String name;
    private int price, cnt;
    TextView tv_name, tv_cnt;
    Button btn_order;

    public Drink(String name, int price, int cnt, TextView tv_name, TextView tv_cnt, Button btn_order) {
        this.name = name;
        this.price = price;
        this.cnt = cnt;
        this.tv_name = tv_name;
        this.tv_cnt = tv_cnt;
        this.btn_order = btn_order;

        tv_name.setText(name + " " + price + " 개 남음");
        tv_cnt.setText(cnt + "개 남음");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
        tv_cnt.setText(cnt+"개 남음");
    }
}
