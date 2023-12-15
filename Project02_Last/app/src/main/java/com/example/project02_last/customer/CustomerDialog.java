package com.example.project02_last.customer;

import android.app.Dialog;
import android.content.Context;

import androidx.annotation.NonNull;

import com.example.project02_last.R;
import com.example.project02_last.common.CommonConn;
import com.example.project02_last.databinding.DialogCustomerBinding;
import com.google.gson.Gson;

public class CustomerDialog extends Dialog {

    DialogCustomerBinding binding;

    //CustomerVO vo;
    // Android : Dialog 종류가 많음 -> 머티리얼 , 기타 모양을 찾아보고 사용 ( 현 : Legacy )
    public CustomerDialog(@NonNull Context context , CustomerVO vo) {
        super(context);
        binding = DialogCustomerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.tvCusId.setText("고객번호 : " + vo.getCustomer_id());
        binding.edtName.setText(vo.getName());
        binding.edtEmail.setText(vo.getEmail());

        binding.btnApply.setOnClickListener(v->{
            vo.setEmail(binding.edtEmail.getText().toString());
            vo.setName(binding.edtName.getText().toString());

            new CommonConn(context,"update.cu").addParamMap("vo", new Gson().toJson(vo)).onExcute((isResult, data) -> {
                dismiss(); // 다이얼로그 자체가 안보이게
            });
        });
    }

}
