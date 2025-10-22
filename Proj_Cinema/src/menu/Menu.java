package menu;

//2. 인터페이스:메뉴 출력, 다음메뉴로 이동
public interface Menu {
    void print(); // 메뉴 출력

    Menu next(); // 다음 메뉴로 이동
}