package com.example.acer.test2;

public class ListQ {
    Question[] question = new Question[10];

    public void InitList(){
        for (int i=0;i<10;i++){
            question[i] = new Question();
        }
        question[0].q="Hà Nội là thủ đô của VN?";
        question[0].a=true;
        question[1].q="Việt Nam có thủ đô là Trà Vinh";
        question[1].a=false;
        question[2].q="Cơ sở B của HUTECH nằm ở quận Bình Thạnh?";
        question[2].a=true;

    }
}
