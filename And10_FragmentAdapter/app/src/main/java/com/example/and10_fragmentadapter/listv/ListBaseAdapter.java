package com.example.and10_fragmentadapter.listv;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.and10_fragmentadapter.R;

import java.util.ArrayList;

//1. 상속을 받는다 ( 일반 클래스 --> Adapter )
//많은 종류의 어댑터가 있지만 가장 기본적인 어댑터 : BaseAdapter
public class ListBaseAdapter extends BaseAdapter {
    //BaseAdapter의 경우 LayoutInflater 사용이 바로 x -> 상위 클래스에서 받아옴.
    LayoutInflater inflater;
    ArrayList<ListDTO> list;

    public ListBaseAdapter(LayoutInflater inflater, ArrayList<ListDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    //2.몇개의 아이템이 있는지 : getView(); <- 칸에 LayoutInflater를 이용해서 레이아웃을 붙이는 처리를 함.
    @Override
    public int getCount() {
        return list.size();
    }

    //외부에서 해당 칸의 데이터를 이용해야할때 사용하는 메소드 ( 큰 의미는 없기때문에 position return )
    @Override
    public Object getItem(int position) {
        return position;
    }

    //한칸의 아이템의 식별자 ( position 은 중복이 x )
    @Override
    public long getItemId(int position) {
        return position;
    }

    //3.getCount의 return 숫자만큼 반복하면서 아이템을 붙이는 처리를 하는 공간
    //position : getView메소드는 계속해서 반복함 ↑ ( getCount의 개수만큼 ) , 스크롤 , index
    //convertView : 붙이고 나서 제어를 위해 사용할 변수. ( 이벤트 )
    //parent : 칸 ( getCount만큼 붙일 ViewGroup(Layout) 종류로 칸을 제공 )
    @Override
    public View getView(int i, View v, ViewGroup parent) {
        Log.d("리스트뷰", "getView: " + v + " : i" + i);



        v = inflater.inflate(R.layout.item_listv , parent , false);
        ImageView imgv_profile = v.findViewById(R.id.imgv_profile);
        TextView tv_name = v.findViewById(R.id.tv_name);
        TextView tv_age = v.findViewById(R.id.tv_age);
        TextView tv_gender = v.findViewById(R.id.tv_gender);
        Button btn_normal = v.findViewById(R.id.btn_normal);

        imgv_profile.setImageResource(list.get(i).getImgRes());
        tv_name.setText(list.get(i).getName());
        tv_gender.setText(list.get(i).getGender());
        tv_age.setText(list.get(i).getAge() + " " );



        return v;
    }
}