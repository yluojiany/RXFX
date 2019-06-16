import java.util.*;

public class t_1 implements Comparable {
    private String stuId;  // 学号
    private String stuName;  // 姓名
    private int totalScore;  // 总分

    public String getStuId() {
        return stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public t_1(String stuId, String stuName, int totalScore) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return "学号: " + this.stuId + ", 姓名: " + this.stuName + ", 总分: " + this.totalScore;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof t_1))
            return false;

        t_1 s = (t_1) o;

        if (this.stuId.equals(s.stuId))
            return true;
        else
            return false;
    }

    @Override
    public int compareTo(Object o) {
        t_1 s = (t_1) o;

        int result = this.totalScore > s.totalScore ? 1 : (this.totalScore == s.totalScore ? 0 : -1);
        result = -result;  // 因为是降序

        if (0 == result)
            result = this.stuName.compareTo(s.stuName); // compareTo比较对象

        return result;
    }
}
