package dynamic_beat2;

import javax.swing.*;
import java.awt.*;

public class DynamicBeat extends JFrame {
    private Image screentImage;
    private Graphics screenGraphic;
    private Image introBackground;

    public DynamicBeat() {
        setTitle("Dynamic Beat!");
        setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        setResizable(false);    // 한 번 만들어진 게임 창은 사용자가 줄이거나 할 수 없음
        setLocationRelativeTo(null); // 컴퓨터 중앙에 뜨게 함
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 게임창을 종료했을 때 프로그램 전체가 종료 (필수!!)
        setVisible(true);

        introBackground = new ImageIcon(Main.class.getResource("introBackground.jpg")).getImage();
        //getImage인스턴스를 인트로백그라운드에 넣음으로서 인트로 백그라운드 초기화
    }

    public void paint(Graphics g) {
        screentImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        screenGraphic = screentImage.getGraphics();
        screenDraw(screenGraphic);
        g.drawImage(screentImage, 0, 0, null);  // 스크린 이미지를 0, 0 위치에
    }
    public void screenDraw(Graphics g){
        g.drawImage(introBackground,0,0,null);
        this.repaint();
    }
}
