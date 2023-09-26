import java.util.List;

public class DBCalculator {
    String Name;
    String addressList;
    String ageList;
    int phoneNum;

    @Override
    public String toString() {
        return "INSERT INTO tbl_movie(" + Name + '\'' +
                ", addressList='" + addressList + '\'' +
                ", ageList='" + ageList + '\'' +
                ", phoneNum=" + phoneNum +
                '}';
    }
}


//    INSERT INTO tbl_movie(movie_name,
//                          movie_director,
//                          movie_attendance,
//                          movie_startdate) VALUES('오펜하이머','크리스토퍼놀란',100000,'2023-07-21')
