/* 2022.10.10
클래스, 메서드 : 영아 , 유나, 두밥 스토리 전개
 */

package y2022.m10;

public class d10_1 {

    static class Mode {
        String modeName;
        String hobby;
        int period;
        int startMonth;
        int finalMonth;
        String notice;
    }

    public static void main(String[] args) {
        Mode younga = new Mode();
        younga.modeName = "영아";
        younga.hobby = "coding";
        younga.period = 3;
        younga.startMonth = 7;
        younga.notice = "손코딩하세요.";
    //   younga.finalMonth = mode();
finalMonth(younga);
        System.out.println(younga.modeName+","+younga.hobby+","+younga.period+","+younga.startMonth+","+younga.notice+","+younga.finalMonth);

        Mode yuna = new Mode();
        yuna.modeName = "유나";
        yuna.hobby = "english";
        yuna.period = 5;
        yuna.startMonth = 3;
        yuna.notice = "영어는 인풋아웃풋 둘다 중요해요.";

        Mode dubab = new Mode();
        dubab.modeName = "두밥";
        dubab.hobby = "game";
        dubab.period = 8;
        dubab.startMonth = 1;
        dubab.notice = "게임 적당히 하세요.";
    }

    public static Mode finalMonth(Mode mode) {
        mode.finalMonth = mode.period + mode.startMonth;
        return mode;
    }
}
