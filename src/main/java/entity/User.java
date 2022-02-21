package entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor

//public class User implements Comparable<User> {
public class User{

    private String userName;
    private String timeToSpend;
    private String activity;

    public User(String userName, String timeToSpend, String activity) {
        this.userName = userName;
        this.timeToSpend = timeToSpend;
        this.activity = activity;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTimeToSpend() {
        return timeToSpend;
    }

    public void setTimeToSpend(String timeToSpend) {
        this.timeToSpend = timeToSpend;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", timeToSpend='" + timeToSpend + '\'' +
                ", activity='" + activity + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(User o) {
//        return this.userName.compareTo(o.getUserName());
//    }
}
