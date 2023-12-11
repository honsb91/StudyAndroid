package com.example.project01_nsbtalk.opentalk;

import com.example.project01_nsbtalk.R;
import com.example.project01_nsbtalk.opentalk.OpenSubDTOs;

import java.util.ArrayList;

public class OpenSubDAO {

    public ArrayList<OpenSubDTOs.OpenSub1DTO> getOpenSub1List(){
        ArrayList<OpenSubDTOs.OpenSub1DTO> list = new ArrayList<>();
        list.add(new OpenSubDTOs().new OpenSub1DTO(R.drawable.friend_back_img1 , 1500 , "[광주광역시 정보] 광주전남 정보" , "사진 3장을 보냈습니다." , "오전 11:50"));
        list.add(new OpenSubDTOs().new OpenSub1DTO(R.drawable.friend_back_img2 , 65 , "아파트 주민 모임" , "넵 알겠습니당." , "오전 09:59"));
        list.add(new OpenSubDTOs().new OpenSub1DTO(R.drawable.friend_back_img4 , 8 , "201호 채팅방" , "대충 어떤 메세지" , "오전 08:50"));
        list.add(new OpenSubDTOs().new OpenSub1DTO(R.drawable.friend_back_img3 , 59 , "개발자 커뮤니티" , "하잇." , "12월 7일"));
        return list;
    }
    public ArrayList<OpenSubDTOs.OpenSub2DTO> getOpenSub2List(){
        ArrayList<OpenSubDTOs.OpenSub2DTO> list = new ArrayList<>();
        list.add(new OpenSubDTOs().new OpenSub2DTO(R.drawable.friend_back_img5 , 38 , "다이어트는 영원한숙제(운동방X,건강...)" , "1시간 전" ,new String[]{"다이어트" , "다이어트인증" , "다이어트식단" , "유..."} ));
        list.add(new OpenSubDTOs().new OpenSub2DTO(R.drawable.friend_back_img6 , 1341 , "다이어트 🧨 물단식 간헐적단식 식단 ..." , "방금 대화" ,new String[]{"다이어트" , "다이어트식단" , "간헐전단식" , "물단식.."} ));
        list.add(new OpenSubDTOs().new OpenSub2DTO(R.drawable.friend_back_img7 , 275 , "10대들의 다이어트 수다방" , "방금 대화" ,new String[]{"10대들의 다이어트 고민? 다여기로!" , "다이어..." , "다이어트식단" , "유..."} ));
        list.add(new OpenSubDTOs().new OpenSub2DTO(R.drawable.friend_back_img8 , 257 , "🎇다이어트 공유🎇 식단/운동" , "" ,new String[]{"다이어트" , "다이어트음식" , "다이어트식단" , "헬..."} ));
        return list;
    }

    public ArrayList<OpenSubDTOs.OpenSub2DTO> getOpenSub3List(){
        ArrayList<OpenSubDTOs.OpenSub2DTO> list = new ArrayList<>();
        list.add(new OpenSubDTOs().new OpenSub2DTO(R.drawable.friend_back_img9 , 29 , "안산.시흥 사진을 사랑하는 사람들(...." , "30분 전" ,new String[]{"안산사진" , "안산" , "사진" , "카메라" , "포토","니콘"} ));
        list.add(new OpenSubDTOs().new OpenSub2DTO(R.drawable.friend_back_img10 , 39 , "끝나면 고기먹으러 가는 사진방 (끝고..." , "방금 대화" ,new String[]{"사진" , "포토" , "경남" , "창원" , "마산" , "김해" , "부산"} ));
        list.add(new OpenSubDTOs().new OpenSub2DTO(R.drawable.friend_profile_img3 , 31 , "대구경북 사진러브" , "30분 전" ,new String[]{"대구" , "경북" ,"취미"} ));
        list.add(new OpenSubDTOs().new OpenSub2DTO(R.drawable.friend_profile_img4 , 47 , "대전사진모임" , "1시간 전" ,new String[]{"사진" , "포토" , "경남" , "창원" , "마산" , "김해"} ));
        return list;
    }


    public ArrayList<OpenSubDTOs.OpenSub3DTO> getOpenSub4List(){
        ArrayList<OpenSubDTOs.OpenSub3DTO> list = new ArrayList<>();
        list.add(new OpenSubDTOs().new OpenSub3DTO(R.drawable.friend_profile_img3 ,206 , "","방금 대화"));
        list.add(new OpenSubDTOs().new OpenSub3DTO(R.drawable.friend_profile_img3 ,1286 , "","방금 대화"));
        list.add(new OpenSubDTOs().new OpenSub3DTO(R.drawable.friend_profile_img3 ,1360 , "","방금 대화"));
        list.add(new OpenSubDTOs().new OpenSub3DTO(R.drawable.friend_profile_img3 ,456 , "","방금 대화"));
        list.add(new OpenSubDTOs().new OpenSub3DTO(R.drawable.friend_profile_img3 ,752 , "","방금 대화"));
        return list;
    }


}