package dynamic_beat_1;

import javax.swing.*;

public class DynamicBeat extends JFrame {

    public DynamicBeat(){
        setTitle("Dynamic Beat!");
        setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
        setResizable(false);    // 한 번 만들어진 게임 창은 사용자가 줄이거나 할 수 없음
        setLocationRelativeTo(null); // 컴퓨터 중앙에 뜨게 함
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 게임창을 종료했을 때 프로그램 전체가 종료 (필수!!)
        setVisible(true);
    }
}
