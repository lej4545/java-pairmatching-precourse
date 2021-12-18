package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;
import pairmatching.view.OutputView;

public class InputView {
    private static final String SELECT_MENU_MESSAGE = "기능을 선택하세요.\n" +
            "1. 페어 매칭\n" +
            "2. 페어 조회\n" +
            "3. 페어 초기화\n" +
            "Q. 종료";
    private static final String INPUT_COURSE_LEVEL_MISSION_MESSAGE = "#############################################\n" +
            "과정: 백엔드 | 프론트엔드\n" +
            "미션:\n" +
            "  - 레벨1: 자동차경주 | 로또 | 숫자야구게임\n" +
            "  - 레벨2: 장바구니 | 결제 | 지하철노선도\n" +
            "  - 레벨3: \n" +
            "  - 레벨4: 성능개선 | 배포\n" +
            "  - 레벨5: \n" +
            "############################################\n" +
            "과정, 레벨, 미션을 선택하세요.\n" +
            "ex) 백엔드, 레벨1, 자동차경주";
    private static final String REMATCHING_MESSAGE = "매칭 정보가 있습니다. 다시 매칭하시겠습니까?";
    public static final String YES = "예";
    public static final String NO = "아니오";
    public static final String VERTICAL_VAR = " | ";




    public static String selectMenu() {
        System.out.println(SELECT_MENU_MESSAGE);
        return Console.readLine();
    }
    public static String inputCourseLevelMission() { // 출력에 따라 수정 필요
        System.out.println(INPUT_COURSE_LEVEL_MISSION_MESSAGE);
        return Console.readLine();
    }


    public static String askMatchingAgain() {
        System.out.println(REMATCHING_MESSAGE);
        System.out.println(YES + VERTICAL_VAR + NO);
        return Console.readLine();
    }
}
