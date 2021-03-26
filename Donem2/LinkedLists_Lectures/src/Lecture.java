public class Lecture {
    private String lectureName;
    private String lectureCode;
    private int semester;
    private Boolean isEnable;

    Lecture(String c, String n, int s, Boolean e) {
        lectureCode = c;
        lectureName = n;
        semester = s;
        isEnable = e;
    }

    /**
     * Getting the lecture name.
     * 
     * @return String Lecture name.
     */
    public String getLectureName() {
        if (isEnable) {
            return lectureName;
        } else {
            return "";
        }
    }

    /**
     * Getting the lecture code.
     * 
     * @return String lecture code.
     */
    public String getLectureCode() {
        if (isEnable) {
            return lectureCode;
        } else {
            return "";
        }

    }

    /**
     * Getting the lecture semester value.
     * 
     * @return int lecture's semester.
     */
    public int getSemester() {
        if (isEnable) {
            return semester;
        } else {
            return -1;
        }

    }

    /**
     * Getting the is lecture Enabled.
     * 
     * @return Boolean is lecture enable.
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    /**
     * Setting the lecture name.
     * 
     * @param n lecture new name.
     */
    public void setLectureName(String n) {
        lectureName = n;
    }

    /**
     * Setting the lecture code.
     * 
     * @param c lecture new code.
     */
    public void setLectureCode(String c) {
        lectureCode = c;
    }

    /**
     * Setting the lecture semester value.
     * 
     * @param s new semester value.
     */
    public void setSemester(int s) {
        semester = s;
    }

    /**
     * Setting the lecture availibility by true.
     */

    public void Enable() {
        isEnable = true;
    }

    /**
     * Setting the lecture availibility by false.
     */

    public void Disable() {
        isEnable = false;
    }

    /**
     * Setting the lecture availibility
     * 
     * @param e lecture's availibility
     */
    public void setIsEnable(Boolean e) {
        isEnable = e;
    }

    /**
     * Setting all the lecture values to String type and returning the values
     * 
     * @return String ( lectureCode, lectureName, semester, isEnable) in string
     */
    public String toString() {
        return "(" + lectureCode + ", " + lectureName + ", " + semester + ", " + isEnable + ")";
    }
}