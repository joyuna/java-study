/* 2022.10.10
레퍼런스 배열, 메서드 : 영아, 유나, 두밥 스토리 전개(2)
 */

package y2022.m10;

public class d10_2 {

    static class Mode {
        String modeName;
        String hobby;
        int period;
        int startMonth;
        int finalMonth;
        String notice;
    }

    public static void main(String[] args) {
        Mode[] modeNames = new Mode[3];

        modeNames[0] = create("영아", " coding", 3, 7, "손코딩하세요.");
    }

    static Mode create(String modeName1, String hobby1, int period1, int startMonth1, String notice1) {
        Mode form = new Mode();
        form.modeName = modeName1;
        form.hobby = hobby1;
        form.period = period1;
        form.startMonth = startMonth1;
        finalMonth1(form);
        form.notice = notice1;

        return form;
    }
    public static Mode finalMonth1(Mode mode) {
        mode.finalMonth = mode.period + mode.startMonth;

        return mode;
    }
}


