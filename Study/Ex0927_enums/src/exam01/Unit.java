package exam01;

import java.util.Date;

class Unit {
    int x, y; // 유닛의 위치
    Direction dir; // 열거형을 인스턴스 변수로 선언
     void init(String str) {
        dir = Direction.EAST; // 유닛의 방향을 EAST로 초기화
    }
    void move() {
        switch(dir) {
            case EAST: x++; // Direction.EAST라고 쓰면 안된다.
                break;
            case WEST: x--;
                break;
            case SOUTH: y++;
                break;
            case NORTH: y--;
                break;
        }
    }
}