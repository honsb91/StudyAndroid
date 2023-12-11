package com.example.project01_nsbtalk.opentalk;

public class OpenSubDTOs {

    public class OpenSub1DTO{
        private int imgTitle , chatCnt;
        private String roomTitle , recentChat , chatDate;
        public OpenSub1DTO(int imgTitle, int chatCnt, String roomTitle, String recentChat, String chatDate) {
            this.imgTitle = imgTitle;
            this.chatCnt = chatCnt;
            this.roomTitle = roomTitle;
            this.recentChat = recentChat;
            this.chatDate = chatDate;
        }

        public int getImgTitle() {
            return imgTitle;
        }

        public void setImgTitle(int imgTitle) {
            this.imgTitle = imgTitle;
        }

        public int getChatCnt() {
            return chatCnt;
        }

        public void setChatCnt(int chatCnt) {
            this.chatCnt = chatCnt;
        }

        public String getRoomTitle() {
            return roomTitle;
        }

        public void setRoomTitle(String roomTitle) {
            this.roomTitle = roomTitle;
        }

        public String getRecentChat() {
            return recentChat;
        }

        public void setRecentChat(String recentChat) {
            this.recentChat = recentChat;
        }

        public String getChatDate() {
            return chatDate;
        }

        public void setChatDate(String chatDate) {
            this.chatDate = chatDate;
        }
    }

    public class OpenSub2DTO{
        private int imgTitle , chatCnt;
        private String roomTitle , recentChat;
        private String[] tagArr;

        public OpenSub2DTO(int imgTitle, int chatCnt, String roomTitle, String recentChat, String[] tagArr) {
            this.imgTitle = imgTitle;
            this.chatCnt = chatCnt;
            this.roomTitle = roomTitle;
            this.recentChat = recentChat;
            this.tagArr = tagArr;
        }

        public int getImgTitle() {
            return imgTitle;
        }

        public void setImgTitle(int imgTitle) {
            this.imgTitle = imgTitle;
        }

        public int getChatCnt() {
            return chatCnt;
        }

        public void setChatCnt(int chatCnt) {
            this.chatCnt = chatCnt;
        }

        public String getRoomTitle() {
            return roomTitle;
        }

        public void setRoomTitle(String roomTitle) {
            this.roomTitle = roomTitle;
        }

        public String getRecentChat() {
            return recentChat;
        }

        public void setRecentChat(String recentChat) {
            this.recentChat = recentChat;
        }

        public String[] getTagArr() {
            return tagArr;
        }

        public void setTagArr(String[] tagArr) {
            this.tagArr = tagArr;
        }
    }

    public class OpenSub3DTO{
        private int backgroundImgRes , chatCnt;
        private String roomTitle , recentChat;

        public OpenSub3DTO(int backgroundImgRes, int chatCnt, String roomTitle, String recentChat) {
            this.backgroundImgRes = backgroundImgRes;
            this.chatCnt = chatCnt;
            this.roomTitle = roomTitle;
            this.recentChat = recentChat;
        }

        public int getBackgroundImgRes() {
            return backgroundImgRes;
        }

        public void setBackgroundImgRes(int backgroundImgRes) {
            this.backgroundImgRes = backgroundImgRes;
        }

        public int getChatCnt() {
            return chatCnt;
        }

        public void setChatCnt(int chatCnt) {
            this.chatCnt = chatCnt;
        }

        public String getRoomTitle() {
            return roomTitle;
        }

        public void setRoomTitle(String roomTitle) {
            this.roomTitle = roomTitle;
        }

        public String getRecentChat() {
            return recentChat;
        }

        public void setRecentChat(String recentChat) {
            this.recentChat = recentChat;
        }
    }

}