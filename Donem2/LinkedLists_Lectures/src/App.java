import java.util.ArrayList;
import java.util.LinkedList;

/**
 * JAVA DOCUMAN MARMARA UNIVERSTY COMPUTER SCIENCE LECTURES IN LINKED LIST
 * 
 * @author Denizhan Toprak
 *
 */

public class App {
    private static LinkedList<Lecture> Llist = new LinkedList<Lecture>();

    /**
     * Initializing the LinkedList and printing the Initilized values.
     * 
     * @param Llist the lecture List which will be initilized.
     */
    public static void InitializeLinkedList(LinkedList<Lecture> Llist) {
        String[] lectureCodes = { "ATA121", "MGB1201", "CSE1200", "CSE1241", "MATH1001", "PHYS1101", "PHYS1103",
                "TRD121", "ATA122", "CSE1242", "MATH1002", "MATH2256", "PHYS1102", "PHYS1104", "TRD122", "NTExxx",
                "CSE2023", "CSE2225", "ECON2004", "EE2031", "MATH2055", "MATH2059", "CSE2246", "CSE2138", "CSE2260",
                "EE2032", "STAT2253", "CSE3000", "CSE3215", "CSE3033", "CSE3055", "CSE3063", "IE3081", "CSE3038",
                "CSE3044", "CSE3048", "CSE3264", "UE3235", "COM2202", "CSE4000", "CSE3074", "CSE4219", "CSE4297",
                "ISG121", "CSE4288", "UE", "TExxx", "CSE4298", "ISG122", "FTExxx", "NTExxx", "TExxx", "TExxx",
                "TExxx" };
        String[] lectureNames = { "Atatürk İlkeleri ve İnkılap Tarihi I", "Introduction to Modern Biology",
                "Introduction to Computer Engineering", "Computer Programming I", "Calculus I", "Physics I",
                "Physics Lab I", "Türk Dili I", "Atatürk İlkeleri ve İnkılap Tarihi II", "Computer Programming II",
                "Calculus II", "Linear Algebra for Computer Engineering", "Physics II", "Physics Lab II",
                "Türk Dili II", "Non-Technical Elective - 1", "Discrete Computational Structures", "Data Structures",
                "Engineering Economy", "Electric Circuits", "Differential Equations", "Numerical Methods",
                "Analysis of Algorithms", "Systems Programming", "Principles of Programming Languages", "Electronics",
                "Introduction to Probability and Statistics", "Summer Pactice I", "Digital Logic Design",
                "Operating Systems", "Database Systems", "Object-Oriented Software Design",
                "Modeling and Discrete Simulation", "Computer Organization", "Software Engineering",
                "Introduction to Signals and Systems", "Formal Languages and Automata Theory", "Operations Research",
                "Technical Comm. and Entrepreneurship", "Summer Practice II", "Computer Networks",
                "Principles of Embedded System Design", "Engineering Project I", "İş Sağlığı ve Güvenliği I",
                "Introduction to Machine Learning", "University Elective", "Technical Elective - 1",
                "Engineering Project II", "İş Sağlığı ve Güvenliği II", "Faculty Technical Electives",
                "Non-Technical Elective- 2", "Technical Elective -2", "Technical Elective -3",
                "Technical Elective -4" };
        int[] semesters = { 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5,
                5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, };

        for (int i = 0; i < lectureCodes.length; i++) {
            Lecture lc = new Lecture(lectureCodes[i], lectureNames[i], semesters[i], true);
            Llist.add(i, lc);
        }
    }

    /**
     * Getting the Lectures by code value.
     * 
     * @param code Lecture Code.
     * @return ArrayList<Lecture> The lectures that has the input "code" value.
     */
    public static ArrayList<Lecture> getByCode(String code) {
        ArrayList<Lecture> getByCodeList = new ArrayList<Lecture>();

        for (int i = 0; i < Llist.size(); i++) {
            if (Llist.get(i).getLectureCode() == code) {
                getByCodeList.add(Llist.get(i));
            }
        }
        return getByCodeList;
    }

    /**
     * Getting the lectures by semester value.
     * 
     * @param semester Lecture' s semesters.
     * @return ArrayList<Lecture> Lectures which has the input "semester" value.
     */
    public static ArrayList<Lecture> listSemesterCourses(int semester) {
        ArrayList<Lecture> semesterCourses = new ArrayList<Lecture>();

        for (int i = 0; i < Llist.size(); i++) {
            if (Llist.get(i).getSemester() == semester) {
                semesterCourses.add(Llist.get(i));
            }
        }
        return semesterCourses;
    }

    /**
     * Getting the lectures between input1 and input2 values.
     * 
     * @param start_index starting index.
     * @param last_index  last index.
     * @return ArrayList<Lecture> The lectures between start_index and last_index.
     */
    public static ArrayList<Lecture> getByRange(int start_index, int last_index) {
        ArrayList<Lecture> getByRangeList = new ArrayList<Lecture>();

        for (int i = start_index; i < last_index; i++) {
            getByRangeList.add(Llist.get(i));
        }
        return getByRangeList;
    }

    /**
     * adding the input lecture to the Linked List.
     * 
     * @param l Lecture which will be added to the linked list.
     */
    public static void Add(Lecture l) {
        Llist.add(l);
    }

    /**
     * Removing the lecture by lecture Code.
     * 
     * @param lectureCode Lecture's code value.
     */
    public static void Remove(String lectureCode) {
        for (int i = 0; i < Llist.size(); i++) {
            if (Llist.get(i).getLectureCode() == lectureCode) {
                Llist.remove(i);
            }
        }
    }

    /**
     * Removing the lecture by its index.
     * 
     * @param index lecture' s current index.
     */
    public static void Remove(int index) {
        Llist.remove(index);
    }

    /**
     * Getting the value by given index's +1
     * 
     * @param index is necessary to find the lecture at index + 1 in linked list
     * @return Lecture is the lecture that in index + 1 in linked list
     */
    public static Lecture Next(int index) {
        System.out.println(Llist.get(index + 1));

        return Llist.get(index + 1);
    }

    /**
     * Getting the value by given index's +1 if both index's lecture's has the same
     * semester value
     * 
     * @param index is necessary to find the lecture at index + 1 in linked list
     * @return Lecture is the lecture that in index + 1 in linked list if correct.
     */
    public static Lecture NextInSemester(int index) {
        if (Llist.get(index).getSemester() != Llist.get(index + 1).getSemester()) {
            System.out.println("Bir sonraki indexteki ders ayni semesterde degildir.");
            return null;
        } else {
            System.out.println(Llist.get(index + 1));
            return Llist.get(index + 1);
        }
    }

    /**
     * Finding the Linked List's size.
     * 
     * @return int Linked List' s size.
     */
    public static int Size() {
        return Llist.size();
    }

    /**
     * Disabling (null get values) the Lecture at given index.
     * 
     * @param index Linked lists 's lecture' s index will be disabled.
     */
    public static void Disable(int index) {
        Llist.get(index).Disable();
    }

    /**
     * Disabling (null get values) the Lecture at given Lecture Code.
     * 
     * @param lectureCode Linked lists 's lecture' s code will be disabled.
     */
    public static void Disable(String lectureCode) {
        for (int i = 0; i < Llist.size(); i++) {
            if (Llist.get(i).getLectureCode() == lectureCode) {
                Llist.get(i).Disable();
            }
        }
    }

    /**
     * Enabling (real get values) the Lecture at given Lecture index.
     * 
     * @param index inked lists 's lecture' s index will be disabled.
     */
    public static void Enable(int index) {
        Llist.get(index).Enable();
    }

    /**
     * Enabling (real get values) the Lecture at given Lecture Code.
     * 
     * @param lectureCode Linked lists 's lecture' s code will be disabled.
     */
    public static void Enable(String lectureCode) {
        for (int i = 0; i < Llist.size(); i++) {
            if (Llist.get(i).getLectureCode() == lectureCode) {
                Llist.get(i).Enable();
            }
        }
    }

    /**
     * Showing the all Lectures had been disabled.
     * 
     * @return ArrayList<Lecture> Lectures had been disabled.
     */
    public static ArrayList<Lecture> ShowDisabled() {
        ArrayList<Lecture> disabledLectures = new ArrayList<Lecture>();

        for (int i = 0; i < Llist.size(); i++) {
            if (!Llist.get(i).getIsEnable()) {
                disabledLectures.add(Llist.get(i));
            }
        }

        System.out.println(disabledLectures);

        return disabledLectures;
    }

    public static void main(String[] args) throws Exception {
        InitializeLinkedList(Llist);
        System.out.println(getByCode("ISG122"));
        System.out.println(listSemesterCourses(6));
        System.out.println(getByRange(10, 20));

        Lecture l = new Lecture("BUS1003", "Enterpreneurship and Innovation", 1, true);
        // adding a optional lecture
        Add(l);
        System.out.println(Llist);
        Remove(54);
        System.out.println(Llist);

        Next(10);

        NextInSemester(10);

        System.out.println(Size());

        Disable(10);
        Disable("CSE3038");
        Disable(11);

        ShowDisabled();

        Enable(10);
        Enable("CSE3038");
        // Disable(11);

        System.out.println(Llist);

    }

}
