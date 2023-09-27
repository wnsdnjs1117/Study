package exam01;

import java.sql.SQLOutput;
import java.util.Random;

interface buttonClickListener {
    public void click();

}

public class AnonymousExample {
    public class Button {
        private buttonClickListener listener;

        public void setButtonListener(buttonClickListener listener) {
            this.listener = listener;
        }

        public void click() {
            if (listener != null) {
                this.listener.click();
            }
        }
    }




    public static void main(String[] args) {
        AnonymousExample exam = new AnonymousExample();
        AnonymousExample.Button button = exam.new Button();
        button.setButtonListener(new buttonClickListener() {
            @Override
            public void click() {
                System.out.println("버튼을 눌렀습니다.");
            }
        });
        button.click();
        Random rand = new Random();
        int r = rand.nextInt(100);
        //
        int a = new Random().nextInt(100);
        System.out.println(a);
    }
}

